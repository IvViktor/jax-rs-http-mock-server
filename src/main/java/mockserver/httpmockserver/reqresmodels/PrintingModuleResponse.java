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

    /**
	 * 
	 */
	public PrintingModuleResponse() {
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
