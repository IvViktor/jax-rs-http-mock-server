package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BMRSLinkingISCardCardContractResponse implements Serializable {

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
	
	@NotNull(message = "accountNumber reqeust param cannot be null")
	@NotEmpty(message = "accountNumber reqeust param cannot be empty")
	@JsonbProperty("accountNumber")
	@JsonProperty("accountNumber")
    private String accountNumber;
	
	@NotNull(message = "accountNumber reqeust param cannot be null")
	@NotEmpty(message = "accountNumber reqeust param cannot be empty")
	@JsonbProperty("contractId")
	@JsonProperty("contractId")
    private String isCardContractId;
	
	@NotNull(message = "error param canno be null")
	private Error error;
	
	public BMRSLinkingISCardCardContractResponse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param systemCode
	 * @param processInstanceId
	 * @param accountNumber
	 * @param isCardContractId
	 * @param error
	 */
	public BMRSLinkingISCardCardContractResponse(String systemCode, String processInstanceId, String accountNumber, String isCardContractId, Error error) {
		this.systemCode = systemCode;
		this.processInstanceId = processInstanceId;
		this.accountNumber = accountNumber;
		this.isCardContractId = isCardContractId;
		this.error = error;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getIsCardContractId() {
		return isCardContractId;
	}

	public Error getError() {
		return error;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setIsCardContractId(String isCardContractId) {
		this.isCardContractId = isCardContractId;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
}
