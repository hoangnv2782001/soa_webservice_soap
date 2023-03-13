
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Travel", targetNamespace = "http://bai1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Travel {


    /**
     * 
     * @param cvcNumber
     * @param cardHolderName
     * @param cardType
     * @param cardNumber
     * @param expirationDate
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculateFee", targetNamespace = "http://bai1/", className = "service.CalculateFee")
    @ResponseWrapper(localName = "calculateFeeResponse", targetNamespace = "http://bai1/", className = "service.CalculateFeeResponse")
    @Action(input = "http://bai1/Travel/calculateFeeRequest", output = "http://bai1/Travel/calculateFeeResponse")
    public String calculateFee(
        @WebParam(name = "cardHolderName", targetNamespace = "")
        String cardHolderName,
        @WebParam(name = "cardType", targetNamespace = "")
        String cardType,
        @WebParam(name = "cardNumber", targetNamespace = "")
        String cardNumber,
        @WebParam(name = "cvcNumber", targetNamespace = "")
        String cvcNumber,
        @WebParam(name = "expirationDate", targetNamespace = "")
        String expirationDate);

}
