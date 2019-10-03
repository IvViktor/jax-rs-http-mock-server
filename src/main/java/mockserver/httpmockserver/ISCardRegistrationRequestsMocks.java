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

import mockserver.httpmockserver.reqresmodels.ISCardRegisterClientRequestPE;
import mockserver.httpmockserver.reqresmodels.ISCardRegisterClientRequestPI;
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
	
	@Path("pi/create")
	@POST
	public Response processPostRequestSuccessfully(ISCardRegisterClientRequestPI data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("isCardCreateCorellationId")).build();
	}

	@Path("pe/create")
	@POST
	public Response processPostRequestSuccessfully(ISCardRegisterClientRequestPE data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("isCardCreateCorellationId")).build();
	}
	
	@Path("pi/create/isCardCreateCorellationId")
	@GET
	public Response processGetFetchRequestSuccessPI() {
		return Response.ok(this.getISCardResponseSamplePI()).build();
	}
	
	@Path("pe/create/isCardCreateCorellationId")
	@GET
	public Response processGetFetchRequestSuccessPE() {
		return Response.ok(this.getISCardResponseSamplePE()).build();
	}

	private ISCardRegisterClientResponse getISCardResponseSamplePI() {
		return new ISCardRegisterClientResponse("isCardContractId", "isCardAccId", "isCardClientPrivId", null, "icCardCardId", "1111222233334444", "", "");
	}

	private ISCardRegisterClientResponse getISCardResponseSamplePE() {
		return new ISCardRegisterClientResponse("isCardContractId", "isCardAccId", null, "isCardClientCorpId", "icCardCardId", "1111222233334444", "", "");
	}
	
}
