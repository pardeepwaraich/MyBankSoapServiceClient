
package trng.imcs.soap.temp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.imcs.soap.temp package. 
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

    private final static QName _GetAccountRequest_QNAME = new QName("http://trng.imcs.org/BankService/", "GetAccountRequest");
    private final static QName _CreateAccountRequest_QNAME = new QName("http://trng.imcs.org/BankService/", "CreateAccountRequest");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://trng.imcs.org/BankService/", "CreateAccountResponse");
    private final static QName _GetAccountResponse_QNAME = new QName("http://trng.imcs.org/BankService/", "GetAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.imcs.soap.temp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.imcs.org/BankService/", name = "GetAccountRequest")
    public JAXBElement<GetAccountRequest> createGetAccountRequest(GetAccountRequest value) {
        return new JAXBElement<GetAccountRequest>(_GetAccountRequest_QNAME, GetAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.imcs.org/BankService/", name = "CreateAccountRequest")
    public JAXBElement<CreateAccountRequest> createCreateAccountRequest(CreateAccountRequest value) {
        return new JAXBElement<CreateAccountRequest>(_CreateAccountRequest_QNAME, CreateAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.imcs.org/BankService/", name = "CreateAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.imcs.org/BankService/", name = "GetAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

}
