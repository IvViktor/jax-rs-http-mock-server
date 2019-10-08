/**
 * 
 */
package mockserver.httpmockserver;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mockserver.httpmockserver.reqresmodels.*;
import mockserver.httpmockserver.reqresmodels.Error;

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
		return Response.ok(this.getISCardResponseSamplePI()).build();
	}

	@Path("pe/create")
	@POST
	public Response processPostRequestSuccessfully(ISCardRegisterClientRequestPE data) {
		return Response.ok(this.getISCardResponseSamplePE()).build();
	}

	@Path("link-is-card")
	@POST
	public Response processPostRequestSuccessfullyForAccIdToCMDLinking(ISCardClientIDToCMDLinkerRequest data) {
		return Response.ok(this.getISCardResponseSampleForAccIdToCMDLinking()).build();
	}
	
	private ISCardRegisterClientResponse getISCardResponseSamplePI() {
		return new ISCardRegisterClientResponse("isCardContractId", "isCardAccId", "isCardClientPrivId", null, "icCardCardId", "1111222233334444", "", "");
	}

	private ISCardRegisterClientResponse getISCardResponseSamplePE() {
		return new ISCardRegisterClientResponse("isCardContractId", "isCardAccId", null, "isCardClientCorpId", "icCardCardId", "1111222233334444", "", "");
	}

	private ISCardClientIDToCMDLinkerResponse getISCardResponseSampleForAccIdToCMDLinking() {
		return new ISCardClientIDToCMDLinkerResponse("isCardCMDProcCode", "isCardCMDprocId", new Error("0", "no errors"));
	}
}
