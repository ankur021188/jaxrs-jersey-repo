package am.code;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Servlet1 {

	@GET
	public String defaultGreetingMessage(@DefaultValue("Default") @QueryParam("name") String name) {
		return "Hello, " +name+" REST world. <a href='../'>Go Back</a>";
	}
	
	@Path("{param}")
	@GET
	public String paramGreetingMessage(@PathParam("param") String parameter) {
		return "Hello "+parameter+", REST world. <a href='../'>Go Back</a>";
	}
	
	@GET
	@Path("mediatypetest")
	@Produces(MediaType.TEXT_HTML)
	public String mediatypeMessage() {
		return "<html><body><p>Produces HTML Message</p><a href='../'>Go Back</a></body></html>";
	}
	
	@GET
	@Path("{day}/{month}/{year}")
	@Produces(MediaType.APPLICATION_XML)
	public String showMultipleParamMsg(@PathParam("day") int day, 
			@PathParam("month") String month, @PathParam("year") String year) {
				return "<day>"+day+"</day>"+"<month>"+month+"</month><year>"+year+"</year>"; 
			}
}
