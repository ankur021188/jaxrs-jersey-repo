package am.code;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class Servlet3 {

	@GET
	@Produces("text/plain")
	@Path("/text")
	public Response downloadTextFile() {
		File textFile = new File("E:\\filestodownloadJAXRS\\todo-css.txt");
		ResponseBuilder response = Response.ok((Object) textFile);
		response.header("Content-Disposition", "attachment;filename=\"file.txt\"");
		return response.build();
	}
	@GET
	@Produces("image/png")
	@Path("/image")
	public Response downloadImageFile() {
		File file = new File("E:\\filestodownloadJAXRS\\6.png");
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition", "attachment;filename=\"file.png\"");
		return response.build();
	}
}
