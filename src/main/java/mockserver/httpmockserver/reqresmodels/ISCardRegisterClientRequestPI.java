package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISCardRegisterClientRequestPI implements Serializable {

    
    @JsonProperty("I_ComandID")
    @JsonbProperty("I_ComandID")
    private String comandID;
    
    @JsonProperty("I_Surname")
    @JsonbProperty("I_Surname")
    private String surname;
    
    @JsonProperty("I_Name")
    @JsonbProperty("I_Name")
    private String name;
    
    @JsonProperty("I_Fname")
    @JsonbProperty("I_Fname")
    private String fName;
    
    @JsonProperty("I_BirthDate")
    @JsonbProperty("I_BirthDate")
    private String birthDate;
    
    @JsonProperty("I_IdentCode")
    @JsonbProperty("I_IdentCode")
    private String identCode;
    
    @JsonProperty("I_Hstreet")
    @JsonbProperty("I_Hstreet")
    private String hStreet;
    
    @JsonProperty("I_HcityID")
    @JsonbProperty("I_HcityID")
    private String hCityID;
    
    @JsonProperty("I_HregionID")
    @JsonbProperty("I_HregionID")
    private String hRegionID;
    
    @JsonProperty("I_HcountryID")
    @JsonbProperty("I_HcountryID")
    private String hCountryID;
    
    @JsonProperty("I_HzipCode")
    @JsonbProperty("I_HzipCode")
    private String hZipCode;
    
    @JsonProperty("I_ResidentID")
    @JsonbProperty("I_ResidentID")
    private String residentID;
    
    @JsonProperty("I_InfluenceID")
    @JsonbProperty("I_InfluenceID")
    private String influenceID;
    
    @JsonProperty("I_Enrolled")
    @JsonbProperty("I_Enrolled")
    private String enrolled;
    
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
    
    @JsonProperty("I_MainAccCcy")
    @JsonbProperty("I_MainAccCcy")
    private String mainAccCcy;
    
    @JsonProperty("I_Pserie")
    @JsonbProperty("I_Pserie")
    private String pSerie;
    
    @JsonProperty("I_Pnumber")
    @JsonbProperty("I_Pnumber")
    private String pNumber;
    
    @JsonProperty("I_Pissued")
    @JsonbProperty("I_Pissued")
    private String pIssued;
    
    @JsonProperty("I_Pissuer")
    @JsonbProperty("I_Pissuer")
    private String pIssuer;
    
    @JsonProperty("I_HdistrictID")
    @JsonbProperty("I_HdistrictID")
    private String hDistrictID;
    
    @JsonProperty("I_Sex")
    @JsonbProperty("I_Sex")
    private String sex;
    
    @JsonProperty("I_AgrPartPlID")
    @JsonbProperty("I_AgrPartPlID")
    private String agrPartPlID;
    
    @JsonProperty("I_ChannelID")
    @JsonbProperty("I_ChannelID")
    private String channelID;
    
    @JsonProperty("I_Reserved1")
    @JsonbProperty("I_Reserved1")
    private String reserved1;
    
    @JsonProperty("I_Reserved2")
    @JsonbProperty("I_Reserved2")
    private String reserved2;

    public ISCardRegisterClientRequestPI() {
    }

    public String getComandID() {
        return comandID;
    }

    public void setComandID(String comandID) {
        this.comandID = comandID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdentCode() {
        return identCode;
    }

    public void setIdentCode(String identCode) {
        this.identCode = identCode;
    }

    public String gethStreet() {
        return hStreet;
    }

    public void sethStreet(String hStreet) {
        this.hStreet = hStreet;
    }

    public String gethCityID() {
        return hCityID;
    }

    public void sethCityID(String hCityID) {
        this.hCityID = hCityID;
    }

    public String gethRegionID() {
        return hRegionID;
    }

    public void sethRegionID(String hRegionID) {
        this.hRegionID = hRegionID;
    }

    public String gethCountryID() {
        return hCountryID;
    }

    public void sethCountryID(String hCountryID) {
        this.hCountryID = hCountryID;
    }

    public String gethZipCode() {
        return hZipCode;
    }

    public void sethZipCode(String hZipCode) {
        this.hZipCode = hZipCode;
    }

    public String getResidentID() {
        return residentID;
    }

    public void setResidentID(String residentID) {
        this.residentID = residentID;
    }

    public String getInfluenceID() {
        return influenceID;
    }

    public void setInfluenceID(String influenceID) {
        this.influenceID = influenceID;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(String enrolled) {
        this.enrolled = enrolled;
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

    public String getMainAccCcy() {
        return mainAccCcy;
    }

    public void setMainAccCcy(String mainAccCcy) {
        this.mainAccCcy = mainAccCcy;
    }

    public String getpSerie() {
        return pSerie;
    }

    public void setpSerie(String pSerie) {
        this.pSerie = pSerie;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getpIssued() {
        return pIssued;
    }

    public void setpIssued(String pIssued) {
        this.pIssued = pIssued;
    }

    public String getpIssuer() {
        return pIssuer;
    }

    public void setpIssuer(String pIssuer) {
        this.pIssuer = pIssuer;
    }

    public String gethDistrictID() {
        return hDistrictID;
    }

    public void sethDistrictID(String hDistrictID) {
        this.hDistrictID = hDistrictID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAgrPartPlID() {
        return agrPartPlID;
    }

    public void setAgrPartPlID(String agrPartPlID) {
        this.agrPartPlID = agrPartPlID;
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
