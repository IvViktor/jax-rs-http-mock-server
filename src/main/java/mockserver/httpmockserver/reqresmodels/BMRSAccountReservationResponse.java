package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BMRSAccountReservationResponse implements Serializable {

	@NotNull(message = "The procCode of source system cannot be null.")
	@NotEmpty(message = "The procCode of source system cannot be empty.")
	@JsonProperty("procCode")
    private String systemCode;
	
	@NotNull(message = "The processInstanceId param in request cannot be null.")
	@NotEmpty(message = "The processInstanceId param in request cannot be empty.")
	@JsonProperty("procId")
    private String processInstanceId;
	
	@NotNull(message = "ledgerSubledger reqeust param cannot be null")
	@Size(min = 4, max = 4, message = "ledgerSubledger request param has to be exactly 4 chars in length.")
	@JsonProperty("ledgerSubledger")
    private String bmrsBookSubBook;
	
	@NotNull(message = "accountNumber param cannot be null")
	@Pattern(regexp = "^\\d{1,20}$", message = "Found invalid format in accountNumber param.")
	@JsonProperty("accountNumber")
	private String regularFormatAccountNumber;
	
	@NotNull(message = "IBAN account number param cannot be null")
	@Pattern(regexp = "^UA\\d{2}\\d{6}\\p{Alnum}{1,19}$", message = "Found invalid format in IBAN account number param.")
	@JsonProperty("iban")
	private String ibanAccountNumber;
	
	@NotNull(message = "Missing mandatory error field in response body.")
	private Error error;
	

    public BMRSAccountReservationResponse() {
    }

    public BMRSAccountReservationResponse(String systemCode, String processInstanceId, String bmrsBookSubBook, String regularFormatAccountNumber, String ibanAccountNumber) {
		this.systemCode = systemCode;
		this.processInstanceId = processInstanceId;
		this.bmrsBookSubBook = bmrsBookSubBook;
		this.regularFormatAccountNumber = regularFormatAccountNumber;
		this.ibanAccountNumber = ibanAccountNumber;
	}

	public BMRSAccountReservationResponse(String systemCode, String processInstanceId, String bmrsBookSubBook, String regularFormatAccountNumber, String ibanAccountNumber, Error error) {
		this.systemCode = systemCode;
		this.processInstanceId = processInstanceId;
		this.bmrsBookSubBook = bmrsBookSubBook;
		this.regularFormatAccountNumber = regularFormatAccountNumber;
		this.ibanAccountNumber = ibanAccountNumber;
		this.error = error;
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
	 * @return the bmrsBookSubBook
	 */
	public String getBmrsBookSubBook() {
		return bmrsBookSubBook;
	}


	/**
	 * @return the regularFormatAccountNumber
	 */
	public String getRegularFormatAccountNumber() {
		return regularFormatAccountNumber;
	}


	/**
	 * @return the ibanAccountNumber
	 */
	public String getIbanAccountNumber() {
		return ibanAccountNumber;
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
	 * @param bmrsBookSubBook the bmrsBookSubBook to set
	 */
	public void setBmrsBookSubBook(String bmrsBookSubBook) {
		this.bmrsBookSubBook = bmrsBookSubBook;
	}


	/**
	 * @param regularFormatAccountNumber the regularFormatAccountNumber to set
	 */
	public void setRegularFormatAccountNumber(String regularFormatAccountNumber) {
		this.regularFormatAccountNumber = regularFormatAccountNumber;
	}


	/**
	 * @param ibanAccountNumber the ibanAccountNumber to set
	 */
	public void setIbanAccountNumber(String ibanAccountNumber) {
		this.ibanAccountNumber = ibanAccountNumber;
	}


	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}

}