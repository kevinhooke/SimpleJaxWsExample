package kh.simple.jaxws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import kh.simple.Person;

/**
 * Simple JAX-WS endpoint. Note that we're implementing an interface to 
 * demonstrate the use of the Proxy client which requires use of an interface (otherwise
 * the interface is optional)
 * 
 * @author kevin.hooke
 */
@WebService
public class SimpleJaxWsEndpoint implements SimpleEndpoint{

	@WebMethod
	public void savePerson(Person person)
	{
		//do something here with passed value
		System.out.println("savePerson() called: " + person.getFirstName() 
				+ " / " + person.getLastName());
	}
	
}
