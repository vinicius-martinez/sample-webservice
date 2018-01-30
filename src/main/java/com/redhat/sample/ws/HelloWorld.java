package com.redhat.sample.ws;

import javax.jws.WebService;

@WebService(serviceName = "HelloWorldService",
	portName = "HelloWorld",
	name = "HelloWorld",
	endpointInterface = "com.redhat.sample.ws.HelloWorldService",
	targetNamespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld")
public class HelloWorld implements HelloWorldService {

	@Override
	public String sayHello() {
		return "Welcome to Mars!";
	}

}
