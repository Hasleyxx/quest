package qis.Validity;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidityController {
	@Autowired
	ValidityRepository validityRep;
	
	@GetMapping("/getValidity")
	public Validity getValidity() {
		return validityRep.getValidity();
	}
	
	@PostMapping("/updateValidity")
	public int updateValidity(@RequestBody Map<String, String> body) {
		String validity				= body.get("validity");
		int id						= Integer.parseInt(body.get("id"));
		
		return validityRep.updateValidity(validity, id);
	}
}
