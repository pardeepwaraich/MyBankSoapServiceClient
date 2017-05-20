
package trng.imcs.soap.temp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://trng.imcs.org/BankService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param parameters
     * @return
     *     returns trng.imcs.soap.temp.CreateAccountResponse
     */
    @WebMethod(action = "http://trng.imcs.org/BankService/createAccount")
    @WebResult(name = "CreateAccountResponse", targetNamespace = "http://trng.imcs.org/BankService/", partName = "parameters")
    public CreateAccountResponse createAccount(
        @WebParam(name = "CreateAccountRequest", targetNamespace = "http://trng.imcs.org/BankService/", partName = "parameters")
        CreateAccountRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns trng.imcs.soap.temp.GetAccountResponse
     */
    @WebMethod(action = "http://trng.imcs.org/BankService/getAccount")
    @WebResult(name = "GetAccountResponse", targetNamespace = "http://trng.imcs.org/BankService/", partName = "parameters")
    public GetAccountResponse getAccount(
        @WebParam(name = "GetAccountRequest", targetNamespace = "http://trng.imcs.org/BankService/", partName = "parameters")
        GetAccountRequest parameters);

}
