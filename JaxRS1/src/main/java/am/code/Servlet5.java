package am.code;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import am.code.model.Person;

@Path("/person")
public class Servlet5 {

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Person getPerson() {
		Person p = new Person();
        p.setFirstName("Nabi");
        p.setLastName("Zamani");
        p.setCitizenships( new String[]{"German", "Persian"} );        
        
        
        Map<String, Object> creditCards = new HashMap<String, Object>();
        creditCards.put("MasterCard", "1234 1234 1234 1234");
        creditCards.put("Visa", "1234 1234 1234 1234");
        creditCards.put("dummy", true);
        p.setCreditCards(creditCards);
        return p;
	}
}
