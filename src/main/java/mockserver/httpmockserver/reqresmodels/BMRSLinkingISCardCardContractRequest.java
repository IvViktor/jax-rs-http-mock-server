package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BMRSLinkingISCardCardContractRequest implements Serializable {

	@JsonProperty("procCode")
	private String systemCode;
	@JsonProperty("procId")
    private String processInstanceId;
	@JsonProperty("user")
    private String userIuadCode;
	@JsonProperty("branchCode")
    private String branchCode;
	@JsonProperty("accountNumber")
    private String accountNumber;
	@JsonProperty("contractId")
    private String isCardContractId;
	@JsonProperty("jwt")
    private String jwt;

	public BMRSLinkingISCardCardContractRequest() {
	}

	private BMRSLinkingISCardCardContractRequest(Builder builder) {
		this.systemCode = builder.systemCode;
		this.processInstanceId = builder.processInstanceId;
		this.userIuadCode = builder.userIuadCode;
		this.branchCode = builder.branchCode;
		this.accountNumber = builder.accountNumber;
		this.isCardContractId = builder.isCardContractId;
		this.jwt = builder.jwt;	
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
	 * @return the userIuadCode
	 */
	public String getUserIuadCode() {
		return userIuadCode;
	}

	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the isCardContractId
	 */
	public String getIsCardContractId() {
		return isCardContractId;
	}

	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
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
	 * @param userIuadCode the userIuadCode to set
	 */
	public void setUserIuadCode(String userIuadCode) {
		this.userIuadCode = userIuadCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @param isCardContractId the isCardContractId to set
	 */
	public void setIsCardContractId(String isCardContractId) {
		this.isCardContractId = isCardContractId;
	}

	/**
	 * @param jwt the jwt to set
	 */
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public static class Builder {
		
		private String systemCode;
		private String processInstanceId;
		private String userIuadCode;
		private String branchCode;
		private String accountNumber;
		private String isCardContractId;
		private String jwt;
		
		public Builder() {
			
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
		public Builder branchCode(String branchCode) {
			this.branchCode = branchCode;
			return this;
		}
		public Builder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		public Builder isCardContractId(String isCardContractId) {
			this.isCardContractId = isCardContractId;
			return this;
		}
		public Builder jwt(String jwt) {
			this.jwt = jwt;
			return this;
		}
		public BMRSLinkingISCardCardContractRequest build() {
			return new BMRSLinkingISCardCardContractRequest(this);
		}
		
	}
}
