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
public class BMRSAccountOpeningResponse implements Serializable {

	@JsonbProperty("procCode")
	@JsonProperty("procCode")
	private String systemCode;
	
	@NotNull(message = "The processInstanceId param in request cannot be null.")
	@NotEmpty(message = "The processInstanceId param in request cannot be empty.")
	@JsonbProperty("procId")
	@JsonProperty("procId")
    private String processInstanceId;
	
	@NotNull(message = "clientTargetId reqeust param cannot be null")
	@NotEmpty(message = "clientTargetId reqeust param cannot be empty")
	@JsonbProperty("clientTargetId")
	@JsonProperty("clientTargetId")
    private String bmrsCustomerId;
	
	@JsonbProperty("accBranch")
	@JsonProperty("accBranch")
    private String accountBranchCode;
	
	@NotNull(message = "accNumber reqeust param cannot be null")
	@NotEmpty(message = "accNumber reqeust param cannot be empty")
	@JsonbProperty("accountNumber")
	@JsonProperty("accountNumber")
    private String accountNumber;
	
	@NotNull(message = "IBAN account number param cannot be null")
	@Pattern(regexp = "^UA\\d{2}\\d{6}\\p{Alnum}{1,19}$", message = "Found invalid format in IBAN account number param.")
	@JsonbProperty("iban")
	@JsonProperty("iban")
	private String ibanAccountNumber;
	
	@NotNull(message = "accountCurrency reqeust param cannot be null")
	@Size(min = 3, max = 3, message = "accountCurrency request param has to be exactly 3 chars in length.")
	@JsonbProperty("accountCurrency")
	@JsonProperty("accountCurrency")
    private String accountCurrency;
	
	@JsonbProperty("accountType")
	@JsonProperty("accountType")
    private String bmrsAccountType;
	
	@NotNull(message = "accountRole reqeust param cannot be null")
	@NotEmpty(message = "accountRole reqeust param cannot be empty")
	@JsonbProperty("accountRole")
	@JsonProperty("accountRole")
    private String bmrsAccountRole;
	
	@NotNull(message = "accountOpenDate reqeust param cannot be null")
	@Size(min = 8, max = 8, message = "accountOpenDate request param has to be exactly 8 chars in length in format YYYYMMDD.")
	@JsonbProperty("accountOpenDate")
	@JsonProperty("accountOpenDate")
    private String accountOpenDate;
	
	@JsonbProperty("error")
	@JsonProperty("error")
    private Error error;

	public BMRSAccountOpeningResponse() {
	}
	
	
	
	public BMRSAccountOpeningResponse(Builder builder) {
		this.systemCode = builder.systemCode;
		this.processInstanceId = builder.processInstanceId;
		this.bmrsCustomerId = builder.bmrsCustomerId;
		this.accountBranchCode = builder.accountBranchCode;
		this.accountNumber = builder.accountNumber;
		this.ibanAccountNumber = builder.ibanAccountNumber;
		this.accountCurrency = builder.accountCurrency;
		this.bmrsAccountType = builder.bmrsAccountType;
		this.bmrsAccountRole = builder.bmrsAccountRole;
		this.accountOpenDate = builder.accountOpenDate;
		this.error = builder.error;
	}



	public static class Builder {
		
		private Error error;
		private String accountOpenDate;
		private String bmrsAccountRole;
		private String ibanAccountNumber;
		private String accountCurrency;
		private String bmrsAccountType;
		private String accountBranchCode;
		private String bmrsCustomerId;
		private String systemCode;
		private String processInstanceId;
		private String accountNumber;
		
		public Builder() {	
		}
		
		public BMRSAccountOpeningResponse build() {
			return new BMRSAccountOpeningResponse(this);
		}
		
		public Builder systemCode(String systemCode) {
			this.systemCode = systemCode;
			return this;
		}
		public Builder processInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
			return this;
		}
		
		public Builder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		
		public Builder accountCurrency(String accountCurrency) {
			this.accountCurrency = accountCurrency;
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

		public Builder bmrsCustomerId(String bmrsCustomerId) {
			this.bmrsCustomerId = bmrsCustomerId;
			return this;
		}

		public Builder error(Error error) {
			this.error = error;
			return this;
		}

		public Builder accountOpenDate(String accountOpenDate) {
			this.accountOpenDate = accountOpenDate;
			return this;
		}

		public Builder bmrsAccountRole(String bmrsAccountRole) {
			this.bmrsAccountRole = bmrsAccountRole;
			return this;
		}

		public Builder ibanAccountNumber(String ibanAccountNumber) {
			this.ibanAccountNumber = ibanAccountNumber;
			return this;
		}
		
	}



	/**
	 * @return the systemCode
	 */
	public String getSystemCode() {
		return systemCode;
	}



	/**
	 * @return the processInstanceId
	 */
	public String getProcessInstanceId() {
		return processInstanceId;
	}



	/**
	 * @return the bmrsCustomerId
	 */
	public String getBmrsCustomerId() {
		return bmrsCustomerId;
	}



	/**
	 * @return the accountBranchCode
	 */
	public String getAccountBranchCode() {
		return accountBranchCode;
	}



	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}



	/**
	 * @return the ibanAccountNumber
	 */
	public String getIbanAccountNumber() {
		return ibanAccountNumber;
	}



	/**
	 * @return the accountCurrency
	 */
	public String getAccountCurrency() {
		return accountCurrency;
	}



	/**
	 * @return the bmrsAccountType
	 */
	public String getBmrsAccountType() {
		return bmrsAccountType;
	}



	/**
	 * @return the bmrsAccountRole
	 */
	public String getBmrsAccountRole() {
		return bmrsAccountRole;
	}



	/**
	 * @return the accountOpenDate
	 */
	public String getAccountOpenDate() {
		return accountOpenDate;
	}



	/**
	 * @return the error
	 */
	public Error getError() {
		return error;
	}



	/**
	 * @param systemCode the systemCode to set
	 */
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}



	/**
	 * @param processInstanceId the processInstanceId to set
	 */
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}



	/**
	 * @param bmrsCustomerId the bmrsCustomerId to set
	 */
	public void setBmrsCustomerId(String bmrsCustomerId) {
		this.bmrsCustomerId = bmrsCustomerId;
	}



	/**
	 * @param accountBranchCode the accountBranchCode to set
	 */
	public void setAccountBranchCode(String accountBranchCode) {
		this.accountBranchCode = accountBranchCode;
	}



	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	/**
	 * @param ibanAccountNumber the ibanAccountNumber to set
	 */
	public void setIbanAccountNumber(String ibanAccountNumber) {
		this.ibanAccountNumber = ibanAccountNumber;
	}



	/**
	 * @param accountCurrency the accountCurrency to set
	 */
	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}



	/**
	 * @param bmrsAccountType the bmrsAccountType to set
	 */
	public void setBmrsAccountType(String bmrsAccountType) {
		this.bmrsAccountType = bmrsAccountType;
	}



	/**
	 * @param bmrsAccountRole the bmrsAccountRole to set
	 */
	public void setBmrsAccountRole(String bmrsAccountRole) {
		this.bmrsAccountRole = bmrsAccountRole;
	}



	/**
	 * @param accountOpenDate the accountOpenDate to set
	 */
	public void setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}



	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}
	
}
