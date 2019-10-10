package mockserver.httpmockserver.reqresmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintingModuleResponse implements Serializable {

    @JsonProperty("url")
    @JsonbProperty("url")
    private String url;
    
    private Error error;

    /**
	 * 
	 */
	public PrintingModuleResponse() {
	}
	public PrintingModuleResponse(String errCode) {
		this.error = new Error(errCode, "No message");
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
