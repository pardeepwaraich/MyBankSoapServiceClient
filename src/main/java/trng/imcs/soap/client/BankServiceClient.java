package trng.imcs.soap.client;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import trng.imcs.soap.temp.BankService;
import trng.imcs.soap.temp.CreateAccountRequest;
import trng.imcs.soap.temp.CreateAccountResponse;

public class BankServiceClient {
	public static void main(String[] args) throws MalformedURLException, DatatypeConfigurationException {
		//Create service client
		URL url = new URL("http://10.0.0.17:8080/MyBankSoapWS/bankService?wsdl");
		QName qName = new QName("http://impl.soap.imcs.trng/", "BankServiceWSImplService");
		Service service = Service.create(url, qName);
		BankService bankService = service.getPort(BankService.class);
		
		//Create request.
		CreateAccountRequest request = new CreateAccountRequest();
		request.setAddress("ABC Street");
		request.setInitialAmount(new BigDecimal(80000));
		request.setName("Raja");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar dob = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		request.setDob(dob);
		
		
		//calling the service
		CreateAccountResponse response = bankService.createAccount(request);
		
		//consuming the response
		System.out.println(response.getAccountId());
		System.out.println(response.getBalance());
	}
	
}
