package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BMRSAccountReservationRequest implements Serializable {

	@NotNull(message = "The procCode of source system cannot be null.")
	@NotEmpty(message = "The procCode of source system cannot be empty.")
	@JsonProperty("procCode")
    private String systemCode;
	
	@NotNull(message = "The processInstanceId param in request cannot be null.")
	@NotEmpty(message = "The processInstanceId param in request cannot be empty.")
	@JsonProperty("procId")
    private String processInstanceId;
	
	@NotNull(message = "The user IUAD code param in request cannot be null.")
	@Pattern(regexp = "^IUAD\\p{Alnum}{4}$", message = "Invalid user IAUD code format found in request param.")
	@JsonProperty("user")
    private String userIuadCode;
	
	@NotNull(message = "branchCode reqeust param cannot be null")
	@Size(min = 4, max = 4, message = "bracnhCode request param has to be exactly 4 chars in length.")
	@JsonProperty("branchCode")
    private String branchCode;
	
	@NotNull(message = "ledgerSubledger reqeust param cannot be null")
	@Size(min = 4, max = 4, message = "ledgerSubledger request param has to be exactly 4 chars in length.")
	@JsonProperty("ledgerSubledger")
    private String bmrsBookSubBook;
	
	@JsonProperty("jwt")
    private String jwt;

    public BMRSAccountReservationRequest() {
    }
    
    public BMRSAccountReservationRequest(String systemCode, String processInstanceId, String userIuadCode, String branchCode, String bmrsBookSubBook) {
		this.systemCode = systemCode;
		this.processInstanceId = processInstanceId;
		this.userIuadCode = userIuadCode;
		this.branchCode = branchCode;
		this.bmrsBookSubBook = bmrsBookSubBook;
	}

	public BMRSAccountReservationRequest(String systemCode, String processInstanceId, String userIuadCode, String branchCode, String bmrsBookSubBook, String jwt) {
		this.systemCode = systemCode;
		this.processInstanceId = processInstanceId;
		this.userIuadCode = userIuadCode;
		this.branchCode = branchCode;
		this.bmrsBookSubBook = bmrsBookSubBook;
		this.jwt = jwt;
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
	 * @return the bmrsBookSubBook
	 */
	public String getBmrsBookSubBook() {
		return bmrsBookSubBook;
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
	 * @param bmrsBookSubBook the bmrsBookSubBook to set
	 */
	public void setBmrsBookSubBook(String bmrsBookSubBook) {
		this.bmrsBookSubBook = bmrsBookSubBook;
	}

	/**
	 * @param jwt the jwt to set
	 */
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}
