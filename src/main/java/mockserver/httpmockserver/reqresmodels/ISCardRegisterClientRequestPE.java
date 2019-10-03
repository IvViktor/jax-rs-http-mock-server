package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISCardRegisterClientRequestPE implements Serializable {

    @JsonProperty("I_ComandID")
    @JsonbProperty("I_ComandID")
    private String comandID;

    @JsonProperty("I_IdentCode")
    @JsonbProperty("I_IdentCode")
    private String identCode;

    @JsonProperty("I_NameCorp")
    @JsonbProperty("I_NameCorp")
    private String nameCorp;

    @JsonProperty("I_NameCorpCard")
    @JsonbProperty("I_NameCorpCard")
    private String nameCorpCard;

    @JsonProperty("I_LCountryID")
    @JsonbProperty("I_LCountryID")
    private String lCountryID;

    @JsonProperty("I_LRegionID")
    @JsonbProperty("I_LRegionID")
    private String lRegionID;

    @JsonProperty("I_LCityID")
    @JsonbProperty("I_LCityID")
    private String lCityID;

    @JsonProperty("I_LStreet")
    @JsonbProperty("I_LStreet")
    private String lStreet;

    @JsonProperty("I_LZipCode")
    @JsonbProperty("I_LZipCode")
    private String lZipCode;

    @JsonProperty("I_CountryID")
    @JsonbProperty("I_CountryID")
    private String countryID;

    @JsonProperty("I_RegionID")
    @JsonbProperty("I_RegionID")
    private String regionID;

    @JsonProperty("I_CityID")
    @JsonbProperty("I_CityID")
    private String cityID;

    @JsonProperty("I_Street")
    @JsonbProperty("I_Street")
    private String street;

    @JsonProperty("I_ZipCode")
    @JsonbProperty("I_ZipCode")
    private String zipCode;

    @JsonProperty("I_AgrPartPlID")
    @JsonbProperty("I_AgrPartPlID")
    private String agrPartPlID;

    @JsonProperty("I_MainAccCcy")
    @JsonbProperty("I_MainAccCcy")
    private String mainAccCcy;

    @JsonProperty("I_BranchID")
    @JsonbProperty("I_BranchID")
    private String branchID;

    @JsonProperty("I_EmailAddress")
    @JsonbProperty("I_EmailAddress")
    private String emailAddress;

    @JsonProperty("I_BaseCardName")
    @JsonbProperty("I_BaseCardName")
    private String baseCardName;

    @JsonProperty("I_BaseMcName")
    @JsonbProperty("I_BaseMcName")
    private String baseMcName;

    @JsonProperty("I_ChannelID")
    @JsonbProperty("I_ChannelID")
    private String channelID;

    @JsonProperty("I_Reserved1")
    @JsonbProperty("I_Reserved1")
    private String reserved1;

    @JsonProperty("I_Reserved2")
    @JsonbProperty("I_Reserved2")
    private String reserved2;

    public ISCardRegisterClientRequestPE() {
    }

    public String getComandID() {
        return comandID;
    }

    public void setComandID(String comandID) {
        this.comandID = comandID;
    }

    public String getIdentCode() {
        return identCode;
    }

    public void setIdentCode(String identCode) {
        this.identCode = identCode;
    }

    public String getNameCorp() {
        return nameCorp;
    }

    public void setNameCorp(String nameCorp) {
        this.nameCorp = nameCorp;
    }

    public String getNameCorpCard() {
        return nameCorpCard;
    }

    public void setNameCorpCard(String nameCorpCard) {
        this.nameCorpCard = nameCorpCard;
    }

    public String getlCountryID() {
        return lCountryID;
    }

    public void setlCountryID(String lCountryID) {
        this.lCountryID = lCountryID;
    }

    public String getlRegionID() {
        return lRegionID;
    }

    public void setlRegionID(String lRegionID) {
        this.lRegionID = lRegionID;
    }

    public String getlCityID() {
        return lCityID;
    }

    public void setlCityID(String lCityID) {
        this.lCityID = lCityID;
    }

    public String getlStreet() {
        return lStreet;
    }

    public void setlStreet(String lStreet) {
        this.lStreet = lStreet;
    }

    public String getlZipCode() {
        return lZipCode;
    }

    public void setlZipCode(String lZipCode) {
        this.lZipCode = lZipCode;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAgrPartPlID() {
        return agrPartPlID;
    }

    public void setAgrPartPlID(String agrPartPlID) {
        this.agrPartPlID = agrPartPlID;
    }

    public String getMainAccCcy() {
        return mainAccCcy;
    }

    public void setMainAccCcy(String mainAccCcy) {
        this.mainAccCcy = mainAccCcy;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBaseCardName() {
        return baseCardName;
    }

    public void setBaseCardName(String baseCardName) {
        this.baseCardName = baseCardName;
    }

    public String getBaseMcName() {
        return baseMcName;
    }

    public void setBaseMcName(String baseMcName) {
        this.baseMcName = baseMcName;
    }

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }
}
