package com.soaptest.services;

public class HelloRPCImpl implements HelloRPC {

	@Override
	public String sayHello(String messageFromClient) {
		System.out.println("Client message was processed by the server...");
		System.out.println("Message from remote host: " + messageFromClient);

		return "[response-message] Your message has being processed by the server. Your message was : "
				.concat(messageFromClient);

	}

}
