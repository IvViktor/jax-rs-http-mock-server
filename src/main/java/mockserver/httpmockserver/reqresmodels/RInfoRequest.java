package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RInfoRequest implements Serializable {

    @JsonbProperty("systemId")
    @JsonProperty("systemId")
    @NotNull(message = "The systemId of source system cannot be null.")
    private String systemId;

    @JsonbProperty("requestId")
    @JsonProperty("requestId")
    private String requestId;

    @JsonbProperty("requestDateTime")
    @JsonProperty("requestDateTime")
    private String requestDateTime;

    @JsonbProperty("requestType")
    @JsonProperty("requestType")
    private String requestType;

    @JsonbProperty("clientId")
    @JsonProperty("clientId")
    @NotNull(message = "The clientId of source system cannot be null.")
    private String clientId;

    @JsonbProperty("productId")
    @JsonProperty("productId")
    @NotNull(message = "The productId of source system cannot be null.")
    private String productId;

    @JsonbProperty("condition")
    @JsonProperty("condition")
    @NotNull(message = "The condition field of source system cannot be null.")
    private String condition;

    @JsonbProperty("parameters")
    @JsonProperty("parameters")
    private Map<String, Object> parameters = new HashMap<>();

    public RInfoRequest() {
    }

    public RInfoRequest(String systemId, String requestId, String requestDateTime, String requestType, String clientId, String productId, String condition, Map<String, Object> parameters) {
        this.systemId = systemId;
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
        this.requestType = requestType;
        this.clientId = clientId;
        this.productId = productId;
        this.condition = condition;
        this.parameters = parameters;
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }
}
