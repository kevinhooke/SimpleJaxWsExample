
package kh.simple.jaxws.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kh.simple.jaxws.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SavePersonResponse_QNAME = new QName("http://endpoint.jaxws.simple.kh/", "savePersonResponse");
    private final static QName _SavePerson_QNAME = new QName("http://endpoint.jaxws.simple.kh/", "savePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kh.simple.jaxws.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SavePerson }
     * 
     */
    public SavePerson createSavePerson() {
        return new SavePerson();
    }

    /**
     * Create an instance of {@link SavePersonResponse }
     * 
     */
    public SavePersonResponse createSavePersonResponse() {
        return new SavePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.jaxws.simple.kh/", name = "savePersonResponse")
    public JAXBElement<SavePersonResponse> createSavePersonResponse(SavePersonResponse value) {
        return new JAXBElement<SavePersonResponse>(_SavePersonResponse_QNAME, SavePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.jaxws.simple.kh/", name = "savePerson")
    public JAXBElement<SavePerson> createSavePerson(SavePerson value) {
        return new JAXBElement<SavePerson>(_SavePerson_QNAME, SavePerson.class, null, value);
    }

}
