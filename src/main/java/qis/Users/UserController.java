package qis.Users;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getUsers")
    public List<Users> PeList(){
    	return userRepository.UserList();
    }
	
	@PostMapping("/addUser")
    public int AddUser(@RequestBody Map<String, String>body) {
		String user 		= body.get("userName");
		String email 		= body.get("userEmail");
		String pass 		= body.get("userPass");
		String status 		= body.get("userStatus");
		String cd 			= body.get("tokenCode");
		String cl 			= body.get("_class");
    	try {
    		return userRepository.addUser(user, email, pass, status, cd, cl);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	@PostMapping("/updateUser")
    public int UpdateUser(@RequestBody Map<String, String>body) {
		String user 		= body.get("userName");
		String email 		= body.get("userEmail");
		String pass 		= body.get("userPass");
		String status 		= body.get("userStatus");
		String cd 			= body.get("tokenCode");
		String cl 			= body.get("_class");
    	try {
    		return userRepository.updateUser(user, email, pass, status, cd, cl);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
}
