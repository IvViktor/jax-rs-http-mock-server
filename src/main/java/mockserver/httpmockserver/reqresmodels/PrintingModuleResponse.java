package mockserver.httpmockserver.reqresmodels;

import java.io.Serializable;

public class PrintingModuleResponse implements Serializable {

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
