package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ua.aval.integration.microservices.CoreBankSystemsResponse;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintingModuleResponse implements Serializable, CoreBankSystemsResponse {

    @JsonProperty("url")
    @JsonbProperty("url")
    private String url;
    
    @JsonProperty("error")
    @JsonbProperty("error")
    private Error error;

    /**
	 *
	 */
	public PrintingModuleResponse() {
	}

	@Override
	public String fetchErrorCode() {
		if (this.error == null) return null;
		return this.error.getErrCode();
	}

	@Override
	public String fetchErrorMessage() {
		if (this.error == null) return null;
		return this.error.getErrMes();
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
}
