/**
 * 编写webServiceApp.java类 来暴露web服务
 * run webServiceApp.java 类来启动服务。 访问 http://localhost:8080/helloWorld?wsdl  查看是否显示wsdl
 */
package demo;

import javax.xml.ws.Endpoint;

public class WebServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("web service start");
		HelloCXFImpl implementor = new HelloCXFImpl();
		String address = "http://localhost:8080/helloCXF";
		Endpoint.publish(address, implementor);
		System.out.println("web service started");
	}

}
