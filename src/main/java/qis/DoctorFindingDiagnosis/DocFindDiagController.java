package qis.DoctorFindingDiagnosis;

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
public class DocFindDiagController {
	@Autowired
	DocFindDiagRepository docFindDiagRep;
	
	@GetMapping("/getFindDiag/{pid}")
	public @ResponseBody List<DocFindDiag> getFindDiagPid(@PathVariable int pid) {
		
		return docFindDiagRep.getFindDiagPid(pid);
	}
	
	@GetMapping("/getFindDiagByDate/{docId}")
	public @ResponseBody List<DocFindDiag> getFindDiagByDate(@PathVariable int docId) {
		return docFindDiagRep.getFindDiagByDate(docId);
	}
	
	@PostMapping("/addFindDiag")
	public int addFindDiag(@RequestBody Map<String, String>body) {
		int patientID			= Integer.parseInt(body.get("patientID"));
		
		String CreationDate		= body.get("CreationDate");
		String findings 		= body.get("findings");
		String diagnosis 		= body.get("diagnosis");
		
		try {
			return docFindDiagRep.addFindDiag(patientID, CreationDate, findings, diagnosis);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
