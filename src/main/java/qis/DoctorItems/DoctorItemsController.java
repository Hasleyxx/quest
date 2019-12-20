package qis.DoctorItems;

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

import qis.Company.Company;
import qis.Company.CompanyRepository;

@RestController
public class DoctorItemsController {
	@Autowired
	DoctorItemsRepository doctorItemsRepository;
	
	@GetMapping("/getDocItems")
	public List<DoctorItems> doctorItems(){
		return doctorItemsRepository.doctorItems();
	}
	
	@PostMapping("/addDocItems")
	public int addDocItems(@RequestBody Map<String, String>body){
		String generic			= body.get("generic");
		String medicine			= body.get("medicine");
		String dosage			= body.get("dosage");
		try {
			return doctorItemsRepository.addDocItems(generic, medicine, dosage);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocItems")
	public int updateDoctorItems(@RequestBody Map<String, String>body){
		String generic			= body.get("generic");
		String medicine			= body.get("medicine");
		String dosage			= body.get("dosage");
		int doctorItemId		= Integer.parseInt(body.get("docItemId"));
		try {
			return doctorItemsRepository.updateDoctorItems(generic, medicine, dosage, doctorItemId);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}	
}
