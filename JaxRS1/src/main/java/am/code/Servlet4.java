package am.code;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import am.code.model.Message;
import am.code.service.MessageService;

@Path("/msg")
public class Servlet4 {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		MessageService messsageService = new MessageService();
		return messsageService.getAllMessage();
	}
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage() {
		MessageService messsageService = new MessageService();
		return messsageService.getAllMessage();
	}
	
	@GET
	@Path("/all")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Message> getMessageinAllFormat() {
		MessageService messsageService = new MessageService();
		return messsageService.getAllMessage();
	}
}
