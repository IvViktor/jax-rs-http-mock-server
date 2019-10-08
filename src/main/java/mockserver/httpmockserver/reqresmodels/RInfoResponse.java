package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RInfoResponse implements Serializable {

    @JsonbProperty("systemId")
    @JsonProperty("systemId")
    private String systemId;

    @JsonbProperty("requestId")
    @JsonProperty("requestId")
    private String requestId;

    @JsonbProperty("requestDateTime")
    @JsonProperty("requestDateTime")
    private String requestDateTime;

    @JsonbProperty("error")
    @JsonProperty("error")
    private List<RInfoResponseErrorEntry> errors = new ArrayList<>();

    public RInfoResponse() {
    }

    public RInfoResponse(String systemId, String requestId, String requestDateTime) {
        this.systemId = systemId;
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
    }

    public RInfoResponse(String systemId, String requestId, String requestDateTime, List<RInfoResponseErrorEntry> errors) {
        this.systemId = systemId;
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
        this.errors = errors;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public List<RInfoResponseErrorEntry> getErrors() {
        return errors;
    }

    public void setErrors(List<RInfoResponseErrorEntry> errors) {
        this.errors = errors;
    }
}
