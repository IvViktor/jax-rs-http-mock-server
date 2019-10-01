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

import mockserver.httpmockserver.reqresmodels.BMRSAccountReservationRequest;
import mockserver.httpmockserver.reqresmodels.BMRSAccountReservationResponse;
import mockserver.httpmockserver.reqresmodels.BMRSLinkingISCardCardContractResponse;
import mockserver.httpmockserver.reqresmodels.Error;
import ua.aval.integration.microservices.http.model.ResponseFormatOnRegisteringPostRequest;

/**
 * this test server class will work with work with Request entities as String , and Response entities as Integer
 * @author Viktor Ivanchenko, Integrity Vision LLC, Kyiv
 *
 */
@Path("bmrs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BmrsOperationRequestsMocks {
	
	@Path("reserve/success")
	@POST
	public Response processPostRequestSuccessfully(BMRSAccountReservationRequest data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("reservationCorellationId")).build();
	}
	
	@Path("reserve/success/reservationCorellationId")
	@GET
	public Response processGetFetchRequestSuccess() {
		return Response.ok(this.getBmrsAccountReservationResponseSample()).build();
	}
	
	private BMRSAccountReservationResponse getBmrsAccountReservationResponseSample() {
        return new BMRSAccountReservationResponse("CBPM",
                "1010",
                "CA02",
                "1234567890",
                "UA853996220000000260012335661",
                new Error());
    }
	
	@Path("link-is-card/success")
	@POST
	public Response processLinkingPostRequestSuccessfully(BMRSAccountReservationRequest data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("linkingCorellationId")).build();
	}
	
	@Path("link-is-card/success/linkingCorellationId")
	@GET
	public Response processLinkingGetFetchRequestSuccess() {
		return Response.ok(this.getBmrsToIsCardAccLinkerResponseSample()).build();
	}
	
	private BMRSLinkingISCardCardContractResponse getBmrsToIsCardAccLinkerResponseSample() {
		return new BMRSLinkingISCardCardContractResponse("CBPM",
														 "1010",
														 "1234567890",
														 "0987654321",
														 new Error());
	}
	
}
