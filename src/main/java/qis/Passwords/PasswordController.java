package qis.Passwords;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PasswordController {
	@Autowired
    PasswordRepository passwordRepository;
	
	@GetMapping("/getPassword")
	public Password getPassword(){
    	return passwordRepository.getPassword();
    }
	
	@PostMapping("/addPassword")
    public int addPassword(@RequestBody Map<String, String>body) {
    	String password	 				= body.get("password");
    	String creationDate 			= body.get("creationDate");
    	
    	try {
    		return passwordRepository.addPassword(password, creationDate);}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
}
