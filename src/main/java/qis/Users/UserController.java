package qis.Users;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	PrivilegeRepository privRepository;
	
	@GetMapping("/getUsers")
    public List<Users> PeList(){
    	return userRepository.UserList();
    }
	
	@GetMapping("/getUser/{id}")
	public  @ResponseBody List<Users> UserbyID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return userRepository.getuserbyid(pid);
       
    }
	
	@GetMapping("/getPrivilege")
	public List<Privilege> Privelege(){
		return privRepository.privilege();
	}
	
	@GetMapping("/getPrivilege/{id}")
	public @ResponseBody List<Privilege> PrivilegebyID(@PathVariable String id){
		int pid = Integer.parseInt(id);
		return privRepository.getprivbyid(pid);
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
		int uid				= Integer.parseInt(body.get("userID"));
		String user 		= body.get("userName");
		String email 		= body.get("userEmail");
		String pass 		= body.get("userPass");
		String status 		= body.get("userStatus");
		String cd 			= body.get("tokenCode");
		String cl 			= body.get("_class");
    	try {
    		return userRepository.updateUser(user, email, pass, status, cd, cl, uid);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	
	@PostMapping("/addPrivilege")
	public int AddPrivilege(@RequestBody Map<String, String>body) {
		int uid 		= Integer.parseInt(body.get("userID"));
		int doc 		= Integer.parseInt(body.get("doctor"));
		int ca 			= Integer.parseInt(body.get("cashierAccount"));
		int cc 			= Integer.parseInt(body.get("cashierCash"));
		int med 		= Integer.parseInt(body.get("medical"));
		int lab 		= Integer.parseInt(body.get("laboratory"));
		int ima 		= Integer.parseInt(body.get("imaging"));
		int qc 			= Integer.parseInt(body.get("qualityControl"));
		int ad 			= Integer.parseInt(body.get("admin"));
		try {
    		return privRepository.addPrivilege(uid, doc, ca, cc, med, lab, ima, qc, ad);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	@PostMapping("/updatePrivilege")
	public int UpdatePrivilege(@RequestBody Map<String, String>body) {
		int uid 		= Integer.parseInt(body.get("userID"));
		int doc 		= Integer.parseInt(body.get("doctor"));
		int ca 			= Integer.parseInt(body.get("cashierAccount"));
		int cc 			= Integer.parseInt(body.get("cashierCash"));
		int med 		= Integer.parseInt(body.get("medical"));
		int lab 		= Integer.parseInt(body.get("laboratory"));
		int ima 		= Integer.parseInt(body.get("imaging"));
		int qc 			= Integer.parseInt(body.get("qualityControl"));
		int ad 			= Integer.parseInt(body.get("admin"));
		int pid			= Integer.parseInt(body.get("privID"));
		try {
    		return privRepository.updatePrivilege(uid, doc, ca, cc, med, lab, ima, qc, ad, pid);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
