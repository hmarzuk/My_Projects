package com.soaptest.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloRPC {
	
	@WebMethod
	public String sayHello(String messageFromClient);
}
