package am.code.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {

	private String firstName;
	private String lastName;
	private String text;
	private Date date;
	
	Message() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Message(String firstName, String lastName, String text, Date date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.text = text;
		this.date = date;
	}
	
	
	
	
}
