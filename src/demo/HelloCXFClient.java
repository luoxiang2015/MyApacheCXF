/**
 * 编写客户端访问服务
 *  测试： run webServiceApp.java 类来启动服务，然后 run HelloCXFClient.java 来访问服务。
 */
package demo;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class HelloCXFClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
		svr.setServiceClass(HelloCXF.class);
		svr.setAddress("http://localhost:8080/helloCXF");
		HelloCXF hc = (HelloCXF) svr.create();
		User user = new User();
		user.setName("lx");
		user.setDescription("test");
		System.out.println(hc.sayHiToUser(user));
	}

}
