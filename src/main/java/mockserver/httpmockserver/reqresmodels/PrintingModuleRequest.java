package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintingModuleRequest implements Serializable {

    @JsonProperty("PI_CARD_ZAYAVA")
    @JsonbProperty("PI_CARD_ZAYAVA")
    @NotNull(message = "piCardZayava field in PrintingModuleRequest object connot be null.")
    private String piCardZayava;

    @JsonProperty("PE_CARD_ZAYAVA")
    @JsonbProperty("PE_CARD_ZAYAVA")
    @NotNull(message = "peCardZayava field in PrintingModuleRequest object connot be null.")
    private String peCardZayava;

    @JsonProperty("PE_CARD_DOVIDKA")
    @JsonbProperty("PE_CARD_DOVIDKA")
    @NotNull(message = "peCardDovidka field in PrintingModuleRequest object connot be null.")
    private String peCardDovidka;

    @JsonProperty("ParamsFormat")
    @JsonbProperty("ParamsFormat")
    @NotNull(message = "ParamsFormat field in PrintingModuleRequest object connot be null.")
    private String ParamsFormat;

    @JsonProperty("TemplateCode")
    @JsonbProperty("TemplateCode")
    @NotNull(message = "TemplateCode field in PrintingModuleRequest object connot be null.")
    private String TemplateCode;

    @JsonProperty("Output")
    @JsonbProperty("Output")
    @NotNull(message = "Output field in PrintingModuleRequest object connot be null.")
    private String Output;

    @JsonProperty("OPERATION")
    @JsonbProperty("OPERATION")
    @NotNull(message = "OPERATION field in PrintingModuleRequest object connot be null.")
    private String OPERATION;

    @JsonProperty("customerCmdID")
    @JsonbProperty("customerCmdID")
    @NotNull(message = "customerCmdID field in PrintingModuleRequest object connot be null.")
    private String customerCmdID;

    @JsonProperty("productID")
    @JsonbProperty("productID")
    @NotNull(message = "productID field in PrintingModuleRequest object connot be null.")
    private String productID;

    @JsonProperty("typeId")
    @JsonbProperty("typeId")
    @NotNull(message = "typeId field in PrintingModuleRequest object connot be null.")
    private String typeId;

    @JsonProperty("name")
    @JsonbProperty("name")
    @NotNull(message = "name field in PrintingModuleRequest object connot be null.")
    private String name;

    @JsonProperty("surname")
    @JsonbProperty("surname")
    @NotNull(message = "surname field in PrintingModuleRequest object connot be null.")
    private String surname;

    @JsonProperty("secondname")
    @JsonbProperty("secondname")
    @NotNull(message = "secondname field in PrintingModuleRequest object connot be null.")
    private String secondname;

    @JsonProperty("cardHolder")
    @JsonbProperty("cardHolder")
    @NotNull(message = "cardHolder field in PrintingModuleRequest object connot be null.")
    private String cardHolder;

    @JsonProperty("taxcode")
    @JsonbProperty("taxcode")
    @NotNull(message = "taxcode field in PrintingModuleRequest object connot be null.")
    private String taxcode;

    @JsonProperty("birthDate")
    @JsonbProperty("birthDate")
    @NotNull(message = "birthDate field in PrintingModuleRequest object connot be null.")
    private String birthDate;

    @JsonProperty("docSer")
    @JsonbProperty("docSer")
    @NotNull(message = "docSer field in PrintingModuleRequest object connot be null.")
    private String docSer;

    @JsonProperty("docNum")
    @JsonbProperty("docNum")
    @NotNull(message = "docNum field in PrintingModuleRequest object connot be null.")
    private String docNum;

    @JsonProperty("publicAgreementNumber")
    @JsonbProperty("publicAgreementNumber")
    @NotNull(message = "publicAgreementNumber field in PrintingModuleRequest object connot be null.")
    private String publicAgreementNumber;

    @JsonProperty("publicAgreementDate")
    @JsonbProperty("publicAgreementDate")
    @NotNull(message = "publicAgreementDate field in PrintingModuleRequest object connot be null.")
    private String publicAgreementDate;

    @JsonProperty("info_MOB_IB")
    @JsonbProperty("info_MOB_IB")
    private String info_MOB_IB;

    @JsonProperty("info_WORK")
    @JsonbProperty("info_WORK")
    private String info_WORK;

    @JsonProperty("info_TEL")
    @JsonbProperty("info_TEL")
    private String info_TEL;

    @JsonProperty("info_MOB_MB")
    @JsonbProperty("info_MOB_MB")
    private String info_MOB_MB;

    @JsonProperty("info_MOB")
    @JsonbProperty("info_MOB")
    private String info_MOB;

    @JsonProperty("email")
    @JsonbProperty("email")
    private String email;

    @JsonProperty("category")
    @JsonbProperty("category")
    @NotNull(message = "category field in PrintingModuleRequest object connot be null.")
    private String category;

    @JsonProperty("cardName")
    @JsonbProperty("cardName")
    @NotNull(message = "nameCard field in PrintingModuleRequest object connot be null.")
    private String cardName;

    @JsonProperty("productName")
    @JsonbProperty("productName")
    @NotNull(message = "productName field in PrintingModuleRequest object connot be null.")
    private String productName;

    @JsonProperty("currency")
    @JsonbProperty("currency")
    @NotNull(message = "currency field in PrintingModuleRequest object connot be null.")
    private String currency;

    @JsonProperty("selectedProductId")
    @JsonbProperty("selectedProductId")
    @NotNull(message = "selectedProductId field in PrintingModuleRequest object connot be null.")
    private String selectedProductId;

    @JsonProperty("keyWord")
    @JsonbProperty("keyWord")
    @NotNull(message = "keyWord field in PrintingModuleRequest object connot be null.")
    private String keyWord;

    @JsonProperty("IBAN")
    @JsonbProperty("IBAN")
    @NotNull(message = "IBAN field in PrintingModuleRequest object connot be null.")
    private String IBAN;

    @JsonProperty("Dateopenacc")
    @JsonbProperty("Dateopenacc")
    @NotNull(message = "Dateopenacc field in PrintingModuleRequest object connot be null.")
    private String Dateopenacc;

    /**
	 * 
	 */
	public PrintingModuleRequest() {
	}

    public String getPiCardZayava() {
        return piCardZayava;
    }

    public void setPiCardZayava(String piCardZayava) {
        this.piCardZayava = piCardZayava;
    }

    public String getPeCardZayava() {
        return peCardZayava;
    }

    public void setPeCardZayava(String peCardZayava) {
        this.peCardZayava = peCardZayava;
    }

    public String getPeCardDovidka() {
        return peCardDovidka;
    }

    public void setPeCardDovidka(String peCardDovidka) {
        this.peCardDovidka = peCardDovidka;
    }

    public String getParamsFormat() {
        return ParamsFormat;
    }

    public void setParamsFormat(String paramsFormat) {
        ParamsFormat = paramsFormat;
    }

    public String getTemplateCode() {
        return TemplateCode;
    }

    public void setTemplateCode(String templateCode) {
        TemplateCode = templateCode;
    }

    public String getOutput() {
        return Output;
    }

    public void setOutput(String output) {
        Output = output;
    }

    public String getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(String OPERATION) {
        this.OPERATION = OPERATION;
    }

    public String getCustomerCmdID() {
        return customerCmdID;
    }

    public void setCustomerCmdID(String customerCmdID) {
        this.customerCmdID = customerCmdID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocSer() {
        return docSer;
    }

    public void setDocSer(String docSer) {
        this.docSer = docSer;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getPublicAgreementNumber() {
        return publicAgreementNumber;
    }

    public void setPublicAgreementNumber(String publicAgreementNumber) {
        this.publicAgreementNumber = publicAgreementNumber;
    }

    public String getPublicAgreementDate() {
        return publicAgreementDate;
    }

    public void setPublicAgreementDate(String publicAgreementDate) {
        this.publicAgreementDate = publicAgreementDate;
    }

    public String getInfo_MOB_IB() {
        return info_MOB_IB;
    }

    public void setInfo_MOB_IB(String info_MOB_IB) {
        this.info_MOB_IB = info_MOB_IB;
    }

    public String getInfo_WORK() {
        return info_WORK;
    }

    public void setInfo_WORK(String info_WORK) {
        this.info_WORK = info_WORK;
    }

    public String getInfo_TEL() {
        return info_TEL;
    }

    public void setInfo_TEL(String info_TEL) {
        this.info_TEL = info_TEL;
    }

    public String getInfo_MOB_MB() {
        return info_MOB_MB;
    }

    public void setInfo_MOB_MB(String info_MOB_MB) {
        this.info_MOB_MB = info_MOB_MB;
    }

    public String getInfo_MOB() {
        return info_MOB;
    }

    public void setInfo_MOB(String info_MOB) {
        this.info_MOB = info_MOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSelectedProductId() {
        return selectedProductId;
    }

    public void setSelectedProductId(String selectedProductId) {
        this.selectedProductId = selectedProductId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getDateopenacc() {
        return Dateopenacc;
    }

    public void setDateopenacc(String dateopenacc) {
        Dateopenacc = dateopenacc;
    }
}
