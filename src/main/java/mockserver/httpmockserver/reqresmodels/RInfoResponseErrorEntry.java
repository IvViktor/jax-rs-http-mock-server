package mockserver.httpmockserver.reqresmodels;

import java.io.Serializable;

public class RInfoResponseErrorEntry implements Serializable {

    private String errorDescription;

    public RInfoResponseErrorEntry() {
    }

    public RInfoResponseErrorEntry(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
