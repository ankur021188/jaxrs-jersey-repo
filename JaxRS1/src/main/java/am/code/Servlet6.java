package am.code;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("example")
public class Servlet6 {
	//;author=JavaInterviewPoint;book=SherlockHolmes;year=2015

	@GET
	public String showContextParam(@Context UriInfo uriinfo, 
			@MatrixParam("author") String author,
			@MatrixParam("book") String book,
			@MatrixParam("year") int year) {
		List<String> param1 = uriinfo.getQueryParameters().get("param1");
		List<String> param2 = uriinfo.getQueryParameters().get("param2");
		String matrixParams="Matrix Params: author="+ author+ ", book="+book+", year="+year;
		return "param1: " + param1.toString() + ", param2: "+ param2.toString() + matrixParams;
	}
	
}
