package qis.DoctorRequest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import qis.DoctorPatient.DoctorPatient;

@RestController
public class DoctorRequestController {
	@Autowired
	DoctorRequestRepository docRequestRepository;
	
	@GetMapping("/getDocRequest")
	public List<DoctorRequest> docPatient() {
		return docRequestRepository.docRequest();
	}
	
	@PostMapping("/addDocRequest")
	public int addDocRequest(@RequestBody Map<String, String>body){
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String category			= body.get("category");
		String test				= body.get("test");
		String otherTest		= body.get("otherTest");
		String dateCreated		= body.get("dateCreated");
		try {
			return docRequestRepository.addDocRequest(pid, category, test, otherTest, dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocRequest")
	public int updateDocRequest(@RequestBody Map<String, String>body){
		int	drid				= Integer.parseInt(body.get("docRequestID"));
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String category			= body.get("category");
		String test				= body.get("test");
		String otherTest		= body.get("otherTest");
		String dateCreated		= body.get("dateCreated");
		try {
			return docRequestRepository.updateDocRequest(category, test, otherTest, dateCreated, drid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
