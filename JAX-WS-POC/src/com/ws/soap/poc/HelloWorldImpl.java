package com.ws.soap.poc;

import javax.jws.WebService;

//Service Implementation Bean

// endpoint url: http://localhost:8080/Jax-ws-demo/hello?wsdl
@WebService(endpointInterface = "com.ws.soap.poc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}
}