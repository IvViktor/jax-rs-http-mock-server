package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import ua.aval.integration.microservices.CoreBankSystemsRequest;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintingModuleRequest implements Serializable, CoreBankSystemsRequest {

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
    
    @JsonProperty("operType")
    @JsonbProperty("operType")
    private String operType;

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
    
	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	@Override
	public void requestOperationType(String operationType) {
		this.operType = operationType;
	}

	@Override
	public String fetchRequestOperationType() {
		return this.operType;
	}

	@Override
	public String fetchSourceSystemCode() {
		return "";
	}

	@Override
	public String fetchSourceSystemProcessId() {
		return "";
	}

	@Override
	public String fetchUserCredentials() {
		return "";
	}

	@Override
	public String fetchJwtToken() {
		return "";
	}


	public static class Builder {

        private String piCardZayava;
        private String peCardZayava;
        private String peCardDovidka;
        private String ParamsFormat;
        private String TemplateCode;
        private String Output;
        private String OPERATION;
        private String customerCmdID;
        private String productID;
        private String typeId;
        private String name;
        private String surname;
        private String secondname;
        private String cardHolder;
        private String taxcode;
        private String birthDate;
        private String docSer;
        private String docNum;
        private String publicAgreementNumber;
        private String publicAgreementDate;
        private String info_MOB_IB;
        private String info_WORK;
        private String info_TEL;
        private String info_MOB_MB;
        private String info_MOB;
        private String email;
        private String category;
        private String cardName;
        private String productName;
        private String currency;
        private String selectedProductId;
        private String keyWord;
        private String IBAN;
        private String Dateopenacc;

        public Builder () {}

        public Builder piCardZayava (String val) {
            piCardZayava = val;
            return this;
        }

        public Builder peCardZayava (String val) {
            peCardZayava = val;
            return this;
        }

        public Builder peCardDovidka (String val) {
            peCardDovidka = val;
            return this;
        }

        public Builder ParamsFormat (String val) {
            ParamsFormat = val;
            return this;
        }

        public Builder TemplateCode (String val) {
            TemplateCode = val;
            return this;
        }

        public Builder Output (String val) {
            Output = val;
            return this;
        }

        public Builder OPERATION (String val) {
            OPERATION = val;
            return this;
        }

        public Builder customerCmdID (String val) {
            customerCmdID = val;
            return this;
        }

        public Builder productID (String val) {
            productID = val;
            return this;
        }

        public Builder typeId (String val) {
            typeId = val;
            return this;
        }

        public Builder name (String val) {
            name = val;
            return this;
        }

        public Builder surname (String val) {
            surname = val;
            return this;
        }

        public Builder secondname (String val) {
            secondname = val;
            return this;
        }

        public Builder cardHolder (String val) {
            cardHolder = val;
            return this;
        }

        public Builder taxcode (String val) {
            taxcode = val;
            return this;
        }

        public Builder birthDate (String val) {
            birthDate = val;
            return this;
        }

        public Builder docSer (String val) {
            docSer = val;
            return this;
        }

        public Builder docNum (String val) {
            docNum = val;
            return this;
        }

        public Builder publicAgreementNumber (String val) {
            publicAgreementNumber = val;
            return this;
        }

        public Builder publicAgreementDate (String val) {
            publicAgreementDate = val;
            return this;
        }

        public Builder info_MOB_IB (String val) {
            info_MOB_IB = val;
            return this;
        }

        public Builder info_WORK (String val) {
            info_WORK = val;
            return this;
        }

        public Builder info_TEL (String val) {
            info_TEL = val;
            return this;
        }

        public Builder info_MOB_MB (String val) {
            info_MOB_MB = val;
            return this;
        }

        public Builder info_MOB (String val) {
            info_MOB = val;
            return this;
        }

        public Builder email (String val) {
            email = val;
            return this;
        }

        public Builder category (String val) {
            category = val;
            return this;
        }

        public Builder cardName (String val) {
            cardName = val;
            return this;
        }

        public Builder productName (String val) {
            productName = val;
            return this;
        }

        public Builder currency (String val) {
            currency = val;
            return this;
        }

        public Builder selectedProductId (String val) {
            selectedProductId = val;
            return this;
        }

        public Builder keyWord (String val) {
            keyWord = val;
            return this;
        }

        public Builder IBAN (String val) {
            IBAN = val;
            return this;
        }

        public Builder Dateopenacc (String val) {
            Dateopenacc = val;
            return this;
        }

        public PrintingModuleRequest build() {
            return new PrintingModuleRequest(this);
        }

    }

    private PrintingModuleRequest (Builder builder) {
        piCardZayava = builder.piCardZayava;
        peCardZayava = builder.peCardZayava;
        peCardDovidka = builder.peCardDovidka;
        ParamsFormat = builder.ParamsFormat;
        TemplateCode = builder.TemplateCode;
        Output = builder.Output;
        OPERATION = builder.OPERATION;
        customerCmdID = builder.customerCmdID;
        productID = builder.productID;
        typeId = builder.typeId;
        name = builder.name;
        surname = builder.surname;
        secondname = builder.secondname;
        cardHolder = builder.cardHolder;
        taxcode = builder.taxcode;
        birthDate = builder.birthDate;
        docSer = builder.docSer;
        docNum = builder.docNum;
        publicAgreementNumber = builder.publicAgreementNumber;
        publicAgreementDate = builder.publicAgreementDate;
        info_MOB_IB = builder.info_MOB_IB;
        info_WORK = builder.info_WORK;
        info_TEL = builder.info_TEL;
        info_MOB_MB = builder.info_MOB_MB;
        info_MOB = builder.info_MOB;
        email = builder.email;
        category = builder.category;
        cardName = builder.cardName;
        productName = builder.productName;
        currency = builder.currency;
        selectedProductId = builder.selectedProductId;
        keyWord = builder.keyWord;
        IBAN = builder.IBAN;
        Dateopenacc = builder.Dateopenacc;
    }

}
