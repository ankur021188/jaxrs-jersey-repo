package am.code;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/save")
public class Servlet2 {

	@POST
	public String postTest(@FormParam("id") int id, @FormParam("name") String name, @FormParam("price") float price) {
		return "<table><tr><td>Id</td><td>Name</td><td>Price</td></tr><tr><td>"+id+"</td><td>"+name+"</td><td>"+price+"</td></tr></table>";
	}
}
