package qis.DoctorPatient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorPatientController {
	@Autowired
	DoctorPatientRepository docPatientRepository;
	
	@GetMapping("/getDocPatient")
	public List<DoctorPatient> docPatient() {
		return docPatientRepository.docPatient();
	}
	
	@PostMapping("/addDocPatient")
	public int addDocPatient(@RequestBody Map<String, String>body){
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String famHis			= body.get("famHis");
		String pastmedHis		= body.get("pastmedHis");
		String allergies		= body.get("allergies");
		String medication		= body.get("medication");
		String dateCreated		= body.get("dateCreated");
		try {
			return docPatientRepository.addDocPatient(pid, famHis, pastmedHis, allergies, medication, dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocPatient")
	public int updateDocPatient(@RequestBody Map<String, String>body){
		int	dpid				= Integer.parseInt(body.get("docPatientID"));
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String famHis			= body.get("famHis");
		String pastmedHis		= body.get("pastmedHis");
		String allergies		= body.get("allergies");
		String medication		= body.get("medication");
		String dateCreated		= body.get("dateCreated");
		try {
			return docPatientRepository.updateDocPatient(famHis, pastmedHis, allergies, medication, dateCreated, dpid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
