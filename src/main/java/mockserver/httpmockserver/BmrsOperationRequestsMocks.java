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

import mockserver.httpmockserver.reqresmodels.BMRSAccountOpeningRequest;
import mockserver.httpmockserver.reqresmodels.BMRSAccountOpeningResponse;
import mockserver.httpmockserver.reqresmodels.BMRSAccountReservationRequest;
import mockserver.httpmockserver.reqresmodels.BMRSAccountReservationResponse;
import mockserver.httpmockserver.reqresmodels.BMRSLinkingISCardCardContractRequest;
import mockserver.httpmockserver.reqresmodels.BMRSLinkingISCardCardContractResponse;
import mockserver.httpmockserver.reqresmodels.Error;
import ua.aval.integration.microservices.http.model.FetchRequestBodyModel;
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
	public Response processPostRequestSuccessfully(FetchRequestBodyModel data) {
		if(data.getOperType().equals("request"))
			return Response.ok(new ResponseFormatOnRegisteringPostRequest("registerCorrelationIdSuccess")).build();
		else if (data.getOperType().equals("response") && data.getCorrelationId().equals("registerCorrelationIdSuccess"))
			return Response.ok(this.getBmrsAccountReservationResponseSample("0")).build();
		else
			return Response.ok(this.getBmrsAccountReservationResponseSample("API-505")).build();
	}
	
	private BMRSAccountReservationResponse getBmrsAccountReservationResponseSample(String errorCode) {
		return new BMRSAccountReservationResponse("CBPM",
                "1010",
                "CA02",
                "1234567890",
                "UA853996220000000260012335661",
                new Error(errorCode, "error message"));
    }
	
	@Path("link-is-card/success")
	@POST
	public Response processLinkingPostRequestSuccessfully(FetchRequestBodyModel data) {
		if(data.getOperType().equals("request"))
			return Response.ok(new ResponseFormatOnRegisteringPostRequest("linkingCorellationId")).build();
		else if (data.getOperType().equals("response") && data.getCorrelationId().equals("linkingCorellationId"))
			return Response.ok(this.getBmrsToIsCardAccLinkerResponseSample("0")).build();
		else
			return Response.ok(this.getBmrsToIsCardAccLinkerResponseSample("API-505")).build();
	}
	
	private BMRSLinkingISCardCardContractResponse getBmrsToIsCardAccLinkerResponseSample(String errorCode) {
		return new BMRSLinkingISCardCardContractResponse("CBPM",
														 "1010",
														 "1234567890",
														 "0987654321",
														 new Error(errorCode, "No message"));
	}
	
	@Path("open/success")
	@POST
	public Response processOpeningPostRequestSuccessfully(FetchRequestBodyModel data) {
		if(data.getOperType().equals("request"))
			return Response.ok(new ResponseFormatOnRegisteringPostRequest("openingCorellationId")).build();
		else if (data.getOperType().equals("response") && data.getCorrelationId().equals("openingCorellationId"))
			return Response.ok(this.getBmrsAccountOpenResponseSample("0")).build();
		else
			return Response.ok(this.getBmrsAccountOpenResponseSample("API-505")).build();
	}
	
//	@Path("open/success")
//	@POST
//	public Response processPostRequestSuccessfully(String data) {
//		throw new IllegalArgumentException(data);
//	}
	
	private BMRSAccountOpeningResponse getBmrsAccountOpenResponseSample(String errorCode) {
		return new BMRSAccountOpeningResponse.Builder()
							.systemCode("CBPM")
							.processInstanceId("processInstanceTestId")
							.bmrsCustomerId("bmrsCustomerTestId")
							.accountBranchCode("9999")
							.accountNumber("1234567890")
							.ibanAccountNumber("UA853996220000000260012335661")
							.accountCurrency("USD")
							.bmrsAccountType("bmrsAccountTestType")
							.bmrsAccountRole("bmrsAccountTestRole")
							.accountOpenDate("19920907")
							.error(new Error(errorCode, "No message"))
							.build();
	}
	
}
