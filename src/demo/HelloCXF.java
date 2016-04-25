package demo;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
//@SOAPBinding(style =  SOAPBinding.Style.RPC)
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface HelloCXF {

	String sayHi(@WebParam(name="text") String text);
	
	String sayHiToUser(User user);
	
	String[] sayHiToUserList(List<User> userList);
}
