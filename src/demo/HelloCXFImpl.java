package demo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

//endpointInterface 交界接口 serviceName 接口名称
@WebService(endpointInterface="demo.HelloCXF",serviceName="HelloCXF")
public class HelloCXFImpl implements HelloCXF{

	Map<Integer,User> users = new LinkedHashMap<Integer,User>();
	
	@Override
	public String sayHi(String text) {
		// TODO Auto-generated method stub
		return "Hellow" + text;
	}

	@Override
	public String sayHiToUser(User user) {
		// TODO Auto-generated method stub
		users.put(users.size()+1, user);
		return "Hello" + user.getName();
	}

	@Override
	public String[] sayHiToUserList(List<User> userList) {
		// TODO Auto-generated method stub
		String[] result = new String[userList.size()];
		int i=0;
		for(User u : userList){
			result[i] = "Hello" + u.getName();
			i++;
		}
		return result;
	}

}
