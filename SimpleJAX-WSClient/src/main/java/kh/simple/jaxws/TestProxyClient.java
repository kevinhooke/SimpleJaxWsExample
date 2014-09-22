package kh.simple.jaxws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import kh.simple.Person;
import kh.simple.jaxws.endpoint.SimpleEndpoint;

/**
 * Example client using the dynamic proxy approach to call the SimpleJaxWsEndpoint.
 * 
 * Note - this generates the client code for the service and port at runtime and is not the 
 * preferred approach. It also requires that the endpoint implements an interface, as this is
 * needed for the param to Service.getPort() (otherwise it is not required to use an interface with 
 * your endpoint implementation).
 * 
 * @author kevin.hooke
 *
 */
public class TestProxyClient {

	public static void main(String[] args) throws Exception{
		new TestProxyClient().test();
	}
	
	public void test() throws Exception {
		URL wsdlURL = new URL("http://localhost:8080/SimpleJAX-WS-Endpoint/SimpleJaxWsEndpoint?wsdl");
		QName serviceName = new QName("http://endpoint.jaxws.simple.kh/", "SimpleJaxWsEndpointService");
		Service service = Service.create(wsdlURL, serviceName);
		SimpleEndpoint endpoint = service.getPort(SimpleEndpoint.class);
		
		Person p = new Person();
		p.setFirstName("testfirstname_fromproxy");
		p.setLastName("testlastname_fromproxy");
		endpoint.savePerson(p);
	}
}
