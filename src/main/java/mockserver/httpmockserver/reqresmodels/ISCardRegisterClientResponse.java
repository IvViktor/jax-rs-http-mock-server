package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISCardRegisterClientResponse implements Serializable {

    @JsonProperty("IO_ContractID")
    @JsonbProperty("IO_ContractID")
    private String contractID;

    @JsonProperty("IO_AccountID")
    @JsonbProperty("IO_AccountID")
    private String accountID;

    @JsonProperty("IO_ClientPrivID")
    @JsonbProperty("IO_ClientPrivID")
    private String clientPrivID;

    @JsonProperty("IO_ClientCorpID")
    @JsonbProperty("IO_ClientCorpID")
    private String clientCorpID;

    @JsonProperty("O_CardID")
    @JsonbProperty("O_CardID")
    private String cardID;

    @JsonProperty("O_cardnum")
    @JsonbProperty("O_cardnum")
    private String cardNumber;

    @JsonProperty("O_expdate")
    @JsonbProperty("O_expdate")
    private String expirationDate;

    @JsonProperty("O_foaccnum")
    @JsonbProperty("O_foaccnum")
    private String frontOfficeSystemAccountNumber;

    @JsonProperty("O_ErrClassID")
    @JsonbProperty("O_ErrClassID")
    private String errClassID;

    @JsonProperty("O_ErrDescription")
    @JsonbProperty("O_ErrDescription")
    private String errDescription;

    public ISCardRegisterClientResponse() {
    }

    public ISCardRegisterClientResponse(String contractID, String accountID, String clientPrivID, String clientCorpID, String cardID, String cardNumber, String errClassID, String errDescription) {
        this.contractID = contractID;
        this.accountID = accountID;
        this.clientPrivID = clientPrivID;
        this.clientCorpID = clientCorpID;
        this.cardID = cardID;
        this.cardNumber = cardNumber;
        this.errClassID = errClassID;
        this.errDescription = errDescription;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getClientPrivID() {
        return clientPrivID;
    }

    public void setClientPrivID(String clientPrivID) {
        this.clientPrivID = clientPrivID;
    }

    public String getClientCorpID() {
        return clientCorpID;
    }

    public void setClientCorpID(String clientCorpID) {
        this.clientCorpID = clientCorpID;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFrontOfficeSystemAccountNumber() {
        return frontOfficeSystemAccountNumber;
    }

    public void setFrontOfficeSystemAccountNumber(String frontOfficeSystemAccountNumber) {
        this.frontOfficeSystemAccountNumber = frontOfficeSystemAccountNumber;
    }

    public String getErrClassID() {
        return errClassID;
    }

    public void setErrClassID(String errClassID) {
        this.errClassID = errClassID;
    }

    public String getErrDescription() {
        return errDescription;
    }

    public void setErrDescription(String errDescription) {
        this.errDescription = errDescription;
    }

}
