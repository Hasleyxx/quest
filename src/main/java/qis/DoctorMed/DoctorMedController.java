package qis.DoctorMed;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorMedController {
	@Autowired
	DoctorMedRepository docMedRepository;
	
	@GetMapping("/getDocMed")
	public List<DoctorMed> doctorMed() {
		return docMedRepository.docMed();
	}
	
	@PostMapping("/addDocMed")
	public int addDocMed(@RequestBody Map<String, String>body){
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String genericName		= body.get("genericName");
		String brandName		= body.get("brandName");
		String quantity			= body.get("quantity");
		String dosage			= body.get("dosage");
		String sched			= body.get("sched");
		String duration			= body.get("duration");
		String dateCreated		= body.get("dateCreated");
		try {
			return docMedRepository.addDocMed(pid, genericName, brandName, quantity, dosage, sched, duration, 
					dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocMed")
	public int updateDocMed(@RequestBody Map<String, String>body){
		int	dmId				= Integer.parseInt(body.get("docMedID"));
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String genericName		= body.get("genericName");
		String brandName		= body.get("brandName");
		String quantity			= body.get("quantity");
		String dosage			= body.get("dosage");
		String sched			= body.get("sched");
		String duration			= body.get("duration");
		String dateCreated		= body.get("dateCreated");
		try {
			return docMedRepository.updateDocMed(genericName, brandName, quantity, dosage, sched, duration, 
					dateCreated, dmId);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
