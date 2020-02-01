package qis.DoctorRequestOption;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorRequestOptionController {
	@Autowired
	DoctorRequestOptionRepository docRequestOptionRep;
	
	@GetMapping("/getDocRequestOption")
	public List<DoctorRequestOption> getDocRequestOption(){
		return docRequestOptionRep.getDocRequestOption();
	}
	
	@GetMapping("/getDocRequestOption/{category}")
	public List<DoctorRequestOption> getDocRequestOptions(@PathVariable String category){
		int Category			= Integer.parseInt(category);
		
		return docRequestOptionRep.getDocRequestOptions(Category);
	}
	
	@PostMapping("/addDocRequestOption")
	public int addDocRequestOption(@RequestBody Map<String, String>body){
		String Option			= body.get("option");
		int Category			= Integer.parseInt(body.get("category"));
		
		try {
			return docRequestOptionRep.addDocRequestOption(Option, Category);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocRequestOption")
	public int updateDocRequestOption(@RequestBody Map<String, String>body){
		String Status			= body.get("status");
		int DocReqOptionId		= Integer.parseInt(body.get("docReqOptionId"));
		
		try {
			return docRequestOptionRep.updateDocRequestOption(Status, DocReqOptionId);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
