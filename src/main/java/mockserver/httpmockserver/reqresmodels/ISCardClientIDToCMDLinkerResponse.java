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
public class ISCardClientIDToCMDLinkerResponse implements Serializable {

    @NotNull(message = "The procCode param in request cannot be null.")
    @NotEmpty(message = "The procCode param in request cannot be empty.")
    @JsonbProperty("procCode")
    @JsonProperty("procCode")
    private String procCode;

    @NotNull(message = "The procId param in request cannot be null.")
    @NotEmpty(message = "The procId param in request cannot be empty.")
    @JsonbProperty("procId")
    @JsonProperty("procId")
    private String procId;

    @JsonbProperty("error")
    @JsonProperty("error")
    private Error error;

    public ISCardClientIDToCMDLinkerResponse() {
    }

    public ISCardClientIDToCMDLinkerResponse(String procCode, String procId, Error error) {
        this.procCode = procCode;
        this.procId = procId;
        this.error = error;
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

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
