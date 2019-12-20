package qis.DoctorMedcert;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import qis.DoctorClearance.DoctorClearance;

@RestController
public class DoctorMedcertController {
	@Autowired
	DoctorMedcertRepository docMedcertRepository;
	
	@GetMapping("/getDocMedcert")
	public List<DoctorMedcert> docMedcert() {
		return docMedcertRepository.docMedcert();
	}
	
	@GetMapping("/getPidDocMedcert/{pid}")
	public List<DoctorMedcert> getPidDocClearance(@PathVariable String pid) {
		String Pid = pid;
		return docMedcertRepository.getPidDocMedcert(Pid);
	}
	
	@GetMapping("/getDocMedcert/{id}")
	public DoctorMedcert getDocClearance(@PathVariable String id) {
		String Id = id;
		return docMedcertRepository.getDocMedcert(id);
	}
	
	
	@PostMapping("/addDocMedcert")
	public int addDocMedcert(@RequestBody Map<String, String>body){
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String due				= body.get("due");
		String diagnosis		= body.get("diagnosis");
		String remarks			= body.get("remarks");
		String days			    = body.get("days");
		String dateCreated		= body.get("dateCreated");
		System.out.print(body);
		try {
			return docMedcertRepository.addDocMedcert(pid, due, diagnosis, remarks, days, dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocMedcert")
	public int updateDocMedcert(@RequestBody Map<String, String>body){
		int	dmId				= Integer.parseInt(body.get("docMedcertID"));
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String due				= body.get("due");
		String diagnosis		= body.get("diagnosis");
		String remarks			= body.get("remarks");
		String days			    = body.get("days");
		String dateCreated		= body.get("dateCreated");
		
		
		try {
			return docMedcertRepository.updateDocMedcert(due, diagnosis, remarks, days, dateCreated, dmId);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
