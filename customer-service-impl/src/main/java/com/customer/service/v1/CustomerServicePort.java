package com.customer.service.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2018-05-01T16:05:55.592+08:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://service.customer.com/v1", name = "CustomerServicePort")
@XmlSeeAlso({com.customer.service.types.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerServicePort {

    @WebMethod(action = "updateCustomer")
    @WebResult(name = "updateCustomerResponse", targetNamespace = "http://service.customer.com/types/v1", partName = "updateCustomerResponse")
    public com.customer.service.types.v1.UpdateCustomerResponse updateCustomer(
        @WebParam(partName = "updateCustomerRequest", name = "updateCustomerRequest", targetNamespace = "http://service.customer.com/types/v1")
        com.customer.service.types.v1.UpdateCustomerRequest updateCustomerRequest
    ) throws UpdateCustomerFault;

    @WebMethod(action = "deleteCustomer")
    @WebResult(name = "deleteCustomerResponse", targetNamespace = "http://service.customer.com/types/v1", partName = "deleteCustomerResponse")
    public com.customer.service.types.v1.DeleteCustomerResponse deleteCustomer(
        @WebParam(partName = "deleteCustomerRequest", name = "deleteCustomerRequest", targetNamespace = "http://service.customer.com/types/v1")
        com.customer.service.types.v1.DeleteCustomerRequest deleteCustomerRequest
    ) throws DeleteCustomerFault;

    @WebMethod(action = "createCustomer")
    @WebResult(name = "createCustomerResponse", targetNamespace = "http://service.customer.com/types/v1", partName = "createCustomerResponse")
    public com.customer.service.types.v1.CreateCustomerResponse createCustomer(
        @WebParam(partName = "createCustomerRequest", name = "createCustomerRequest", targetNamespace = "http://service.customer.com/types/v1")
        com.customer.service.types.v1.CreateCustomerRequest createCustomerRequest
    ) throws CreateCustomerFault;
}
