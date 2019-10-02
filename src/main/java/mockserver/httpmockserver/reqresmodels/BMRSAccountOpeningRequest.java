package mockserver.httpmockserver.reqresmodels;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BMRSAccountOpeningRequest implements Serializable {

	@NotNull(message = "The procCode of source system cannot be null.")
	@NotEmpty(message = "The procCode of source system cannot be empty.")
	@JsonbProperty("procCode")
	@JsonProperty("procCode")
	private String systemCode;
	
	@NotNull(message = "The processInstanceId param in request cannot be null.")
	@NotEmpty(message = "The processInstanceId param in request cannot be empty.")
	@JsonbProperty("procId")
	@JsonProperty("procId")
    private String processInstanceId;
	
	@NotNull(message = "The user IUAD code param in request cannot be null.")
	@Pattern(regexp = "^IUAD\\p{Alnum}{4}$", message = "Invalid user IAUD code format found in request param.")
	@JsonbProperty("user")
	@JsonProperty("user")
    private String userIuadCode;
	
	@NotNull(message = "userBranch reqeust param cannot be null")
	@Size(min = 4, max = 4, message = "userBranch request param has to be exactly 4 chars in length.")
	@JsonbProperty("userBranch")
	@JsonProperty("userBranch")
    private String userBranchCode;
	
	@NotNull(message = "clientId reqeust param cannot be null")
	@NotEmpty(message = "clientId reqeust param cannot be empty")
	@JsonbProperty("clientId")
	@JsonProperty("clientId")
    private String bmrsCustomerId;
	
	@JsonbProperty("clientType")
	@JsonProperty("clientType")
    private String bmrsCustomerType;
	
	@JsonbProperty("clientClass")
	@JsonProperty("clientClass")
    private String bmrsCustomerClass;
	
	@NotNull(message = "accBranch reqeust param cannot be null")
	@Size(min = 4, max = 4, message = "accBranch request param has to be exactly 4 chars in length.")
	@JsonbProperty("accBranch")
	@JsonProperty("accBranch")
    private String accountBranchCode;
	
	@NotNull(message = "accNumber reqeust param cannot be null")
	@NotEmpty(message = "accNumber reqeust param cannot be empty")
	@JsonbProperty("accNumber")
	@JsonProperty("accNumber")
    private String accountNumber;
	
	@NotNull(message = "accType reqeust param cannot be null")
	@Size(min = 3, max = 3, message = "accType request param has to be exactly 3 chars in length.")
	@JsonbProperty("accType")
	@JsonProperty("accType")
    private String bmrsAccountType;
	
	@NotNull(message = "ledger reqeust param cannot be null")
	@Size(min = 2, max = 2, message = "ledger request param has to be exactly 2 chars in length.")
	@JsonbProperty("ledger")
	@JsonProperty("ledger")
    private String bmrsLedger;
	
	@NotNull(message = "subLedger reqeust param cannot be null")
	@Size(min = 2, max = 2, message = "subLedger request param has to be exactly 2 chars in length.")
	@JsonbProperty("subLedger")
	@JsonProperty("subLedger")
    private String bmrsSubLedger;
	
	@NotNull(message = "currency reqeust param cannot be null")
	@Size(min = 3, max = 3, message = "currency request param has to be exactly 3 chars in length.")
	@JsonbProperty("currency")
	@JsonProperty("currency")
    private String accountCurrency;
	
	@JsonbProperty("jwt")
	@JsonProperty("jwt")
    private String jwt;

	public BMRSAccountOpeningRequest() {
	}
	
	public BMRSAccountOpeningRequest(Builder builder) {
		this.systemCode = builder.systemCode;
		this.processInstanceId = builder.processInstanceId;
		this.userIuadCode = builder.userIuadCode;
		this.userBranchCode = builder.userBranchCode;
		this.bmrsCustomerId = builder.bmrsCustomerId;
		this.bmrsCustomerType = builder.bmrsCustomerType;
		this.bmrsCustomerClass = builder.bmrsCustomerClass;
		this.accountBranchCode = builder.accountBranchCode;
		this.accountNumber = builder.accountNumber;
		this.bmrsAccountType = builder.bmrsAccountType;
		this.bmrsLedger = builder.bmrsLedger;
		this.bmrsSubLedger = builder.bmrsSubLedger;
		this.accountCurrency = builder.accountCurrency;
		this.jwt = builder.jwt;
	}
	
	public static class Builder {
		
		private String accountCurrency;
		private String bmrsSubLedger;
		private String bmrsLedger;
		private String bmrsAccountType;
		private String accountBranchCode;
		private String bmrsCustomerClass;
		private String bmrsCustomerType;
		private String bmrsCustomerId;
		private String userBranchCode;
		private String systemCode;
		private String processInstanceId;
		private String userIuadCode;
		private String accountNumber;
		private String jwt;
		
		public Builder() {	
		}
		
		public BMRSAccountOpeningRequest build() {
			return new BMRSAccountOpeningRequest(this);
		}
		
		public Builder systemCode(String systemCode) {
			this.systemCode = systemCode;
			return this;
		}
		public Builder processInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
			return this;
		}
		public Builder userIuadCode(String userIuadCode) {
			this.userIuadCode = userIuadCode;
			return this;
		}
		
		public Builder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		public Builder jwt(String jwt) {
			this.jwt = jwt;
			return this;
		}

		public Builder accountCurrency(String accountCurrency) {
			this.accountCurrency = accountCurrency;
			return this;
		}

		public Builder bmrsSubLedger(String bmrsSubLedger) {
			this.bmrsSubLedger = bmrsSubLedger;
			return this;
		}

		public Builder bmrsLedger(String bmrsLedger) {
			this.bmrsLedger = bmrsLedger;
			return this;
		}

		public Builder bmrsAccountType(String bmrsAccountType) {
			this.bmrsAccountType = bmrsAccountType;
			return this;
		}

		public Builder accountBranchCode(String accountBranchCode) {
			this.accountBranchCode = accountBranchCode;
			return this;
		}

		public Builder bmrsCustomerClass(String bmrsCustomerClass) {
			this.bmrsCustomerClass = bmrsCustomerClass;
			return this;
		}

		public Builder bmrsCustomerType(String bmrsCustomerType) {
			this.bmrsCustomerType = bmrsCustomerType;
			return this;
		}

		public Builder bmrsCustomerId(String bmrsCustomerId) {
			this.bmrsCustomerId = bmrsCustomerId;
			return this;
		}

		public Builder userBranchCode(String userBranchCode) {
			this.userBranchCode = userBranchCode;
			return this;
		}
		
	}

	public String getSystemCode() {
		return systemCode;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public String getUserIuadCode() {
		return userIuadCode;
	}

	public String getUserBranchCode() {
		return userBranchCode;
	}

	public String getBmrsCustomerId() {
		return bmrsCustomerId;
	}

	public String getBmrsCustomerType() {
		return bmrsCustomerType;
	}

	public String getBmrsCustomerClass() {
		return bmrsCustomerClass;
	}

	public String getAccountBranchCode() {
		return accountBranchCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getBmrsAccountType() {
		return bmrsAccountType;
	}

	public String getBmrsLedger() {
		return bmrsLedger;
	}

	public String getBmrsSubLedger() {
		return bmrsSubLedger;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public String getJwt() {
		return jwt;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public void setUserIuadCode(String userIuadCode) {
		this.userIuadCode = userIuadCode;
	}

	public void setUserBranchCode(String userBranchCode) {
		this.userBranchCode = userBranchCode;
	}

	public void setBmrsCustomerId(String bmrsCustomerId) {
		this.bmrsCustomerId = bmrsCustomerId;
	}

	public void setBmrsCustomerType(String bmrsCustomerType) {
		this.bmrsCustomerType = bmrsCustomerType;
	}

	public void setBmrsCustomerClass(String bmrsCustomerClass) {
		this.bmrsCustomerClass = bmrsCustomerClass;
	}

	public void setAccountBranchCode(String accountBranchCode) {
		this.accountBranchCode = accountBranchCode;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBmrsAccountType(String bmrsAccountType) {
		this.bmrsAccountType = bmrsAccountType;
	}

	public void setBmrsLedger(String bmrsLedger) {
		this.bmrsLedger = bmrsLedger;
	}

	public void setBmrsSubLedger(String bmrsSubLedger) {
		this.bmrsSubLedger = bmrsSubLedger;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}
