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

import mockserver.httpmockserver.reqresmodels.PrintingModuleRequest;
import mockserver.httpmockserver.reqresmodels.PrintingModuleResponse;
import ua.aval.integration.microservices.http.model.ResponseFormatOnRegisteringPostRequest;

/**
 * this test server class will work with work with Request entities as String , and Response entities as Integer
 * @author Viktor Ivanchenko, Integrity Vision LLC, Kyiv
 *
 */
@Path("printingmodule")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PrintingModuleRequestsMocks {
	
	@Path("print")
	@POST
	public Response processPostRequestSuccessfully(PrintingModuleRequest data) {
		return Response.ok(new ResponseFormatOnRegisteringPostRequest("printingCorellationId")).build();
	}
	
	@Path("print/printingCorellationId")
	@GET
	public Response processGetFetchRequestSuccess() {
		return Response.ok(this.getPrintingModuleResponseSample()).build();
	}
	
	private PrintingModuleResponse getPrintingModuleResponseSample() {
		PrintingModuleResponse res = new PrintingModuleResponse();
		res.setUrl("http://taipan.test.kv.aval/tmpPDF.pdf");
		return res;
	}
	
	
}
