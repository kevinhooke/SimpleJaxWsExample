package kh.simple.jaxws;

import kh.simple.jaxws.generated.Person;
import kh.simple.jaxws.generated.SimpleEndpoint;
import kh.simple.jaxws.generated.SimpleJaxWsEndpointService;

public class TestGeneratedClient {

	public static void main(String[] args) throws Exception{
		new TestGeneratedClient().test();

	}

	/**
	 * Uses generated client code from wsimport -keep -p kh.simple.jaxws.generated http://localhost:8080/SimpleJAX-WS-Endpoint/SimpleJaxWsEndpoint?wsdl
	 * 
	 * To change the endpoint url in the generated code, use approach with BindingProvider here:
	 * http://stackoverflow.com/questions/5158537/jaxws-how-to-change-the-endpoint-address
	 */
	public void test() throws Exception{
		SimpleJaxWsEndpointService service = new SimpleJaxWsEndpointService();
		SimpleEndpoint endpoint = service.getSimpleJaxWsEndpointPort();
		
		Person person = new Person();
		person.setFirstName("firstname");
		person.setLastName("lastname");
		
		//call method on endpoint
		endpoint.savePerson(person);
	}
}
