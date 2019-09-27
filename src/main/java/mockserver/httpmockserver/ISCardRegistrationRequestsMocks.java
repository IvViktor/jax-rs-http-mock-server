/**
 * 
 */
package mockserver.httpmockserver;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mockserver.httpmockserver.reqresmodels.ISCardRegisterClientRequest;
import mockserver.httpmockserver.reqresmodels.ISCardRegisterClientResponse;
import ua.aval.integration.microservices.http.model.ResponseFormatOnRegisteringPostRequest;

/**
 * this test server class will work with work with Request entities as String , and Response entities as Integer
 * @author Viktor Ivanchenko, Integrity Vision LLC, Kyiv
 *
 */
@Path("iscard")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ISCardRegistrationRequestsMocks {
	
	@Path("create")
	@POST
	public Response processPostRequestSuccessfully(ISCardRegisterClientRequest data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("isCardCreateCorellationId")).build();
	}
	
	@Path("create/isCardCreateCorellationId")
	@GET
	public Response processGetFetchRequestSuccess() {
		return Response.ok(this.getPrintingModuleResponseSample()).build();
	}
	
	private ISCardRegisterClientResponse getPrintingModuleResponseSample() {
		return new ISCardRegisterClientResponse("isCardContractId", "isCardAccId", "isCardClientPrivId", "icCardCardId", "1111222233334444", "", "");
	}
	
	
}
