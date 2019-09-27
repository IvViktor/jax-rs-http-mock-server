package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ISCardRegisterClientResponse implements Serializable {

    @JsonProperty("IO_ContractID")
    private String contractID;
    @JsonProperty("IO_AccountID")
    private String accountID;
    @JsonProperty("IO_ClientPrivID")
    private String clientPrivID;
    @JsonProperty("O_CardID")
    private String cardID;
    @JsonProperty("o_cardnum")
    private String cardNumber;
    @JsonProperty("O_ErrClassID")
    private String errClassID;
    @JsonProperty("O_ErrDescription")
    private String errDescription;

    public ISCardRegisterClientResponse() {
    }

    public ISCardRegisterClientResponse(String contractID, String accountID, String clientPrivID, String cardID, String cardNumber, String errClassID, String errDescription) {
        this.contractID = contractID;
        this.accountID = accountID;
        this.clientPrivID = clientPrivID;
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
