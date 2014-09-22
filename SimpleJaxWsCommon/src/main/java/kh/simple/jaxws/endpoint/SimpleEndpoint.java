package kh.simple.jaxws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import kh.simple.Person;

/**
 * Interface for the SimpleEndpoint.
 * 
 * @author kevin.hooke
 *
 */
@WebService
public interface SimpleEndpoint {

	@WebMethod
	public void savePerson(Person person);
	
}
