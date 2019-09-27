package mockserver.httpmockserver.reqresmodels;

import java.io.Serializable;

public class Error implements Serializable {

    private String errCode;
    private String errMes;

    public Error() {
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMes() {
        return errMes;
    }

    public void setErrMes(String errMes) {
        this.errMes = errMes;
    }
}
