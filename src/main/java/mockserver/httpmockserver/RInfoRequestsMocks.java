package mockserver.httpmockserver;

import mockserver.httpmockserver.reqresmodels.Error;
import mockserver.httpmockserver.reqresmodels.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.Date;

@Path("rinfo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RInfoRequestsMocks {
	
	@Path("connect")
	@POST
	public Response processPostRequestSuccessfully(RInfoRequest data) {
		return Response.ok(this.getRInfoResponseSample()).build();
	}
	
	private RInfoResponse getRInfoResponseSample() {
		return new RInfoResponse("rinfoSysId", "rinfoRequestId", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
