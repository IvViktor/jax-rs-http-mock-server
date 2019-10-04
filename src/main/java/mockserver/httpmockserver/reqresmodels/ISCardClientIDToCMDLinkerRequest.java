package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISCardClientIDToCMDLinkerRequest implements Serializable {

    @NotNull(message = "The procCode of source system cannot be null.")
    @NotEmpty(message = "The procCode of source system cannot be empty.")
    @JsonProperty("procCode")
    @JsonbProperty("procCode")
    private String procCode;

    @NotNull(message = "The procId of source system cannot be null.")
    @NotEmpty(message = "The procId of source system cannot be empty.")
    @JsonProperty("procId")
    @JsonbProperty("procId")
    private String procId;

    @NotNull(message = "The identClient of source system cannot be null.")
    @NotEmpty(message = "The identClient of source system cannot be empty.")
    @JsonProperty("identClient")
    @JsonbProperty("identClient")
    private String identClient;

    @NotNull(message = "The systemId of source system cannot be null.")
    @NotEmpty(message = "The systemId of source system cannot be empty.")
    @JsonProperty("systemId")
    @JsonbProperty("systemId")
    private String systemId;

    @NotNull(message = "The clientType of source system cannot be null.")
    @NotEmpty(message = "The clientType of source system cannot be empty.")
    @JsonProperty("clientType")
    @JsonbProperty("clientType")
    private String clientType;

    public ISCardClientIDToCMDLinkerRequest() {
    }

    public ISCardClientIDToCMDLinkerRequest(String procCode, String procId, String identClient, String systemId, String clientType) {
        this.procCode = procCode;
        this.procId = procId;
        this.identClient = identClient;
        this.systemId = systemId;
        this.clientType = clientType;
    }

    public String getProcCode() {
        return procCode;
    }

    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getIdentClient() {
        return identClient;
    }

    public void setIdentClient(String identClient) {
        this.identClient = identClient;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
