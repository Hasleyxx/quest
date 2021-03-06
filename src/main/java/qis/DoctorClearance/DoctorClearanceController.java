package qis.DoctorClearance;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import qis.Pe.MedicalHistory;

@RestController
public class DoctorClearanceController {
	@Autowired
	DoctorClearanceRepository docClearanceRepository;
	
	@GetMapping("/getDocClearance")
	public List<DoctorClearance> doctorClearance() {
		return docClearanceRepository.doctorClearance();
	}
	
	@PostMapping("/addDocClearance")
	public int addDocClearance(@RequestBody Map<String, String>body){
		int pid				= Integer.parseInt(body.get("patientID"));

		String dataRef		= body.get("dataRef");
		String pastmedHis		= body.get("pastmedHis");
		String socialHis		= body.get("socialHis");
		String allergies		= body.get("allergies");
		String prevSurgery		= body.get("prevSurgery");
		String rOs				= body.get("rOs");
		String workUp			= body.get("workUp");
		String assesmentPlan	= body.get("assesmentPlan");
		String dateCreated		= body.get("dateCreated");
		
		try {
			return docClearanceRepository.addDocClearance(pid, dataRef, pastmedHis, socialHis, allergies, prevSurgery, rOs,
					workUp, assesmentPlan, dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@GetMapping("/getOneDocClearance/{id}")
	public DoctorClearance getOneDocClearance(@PathVariable String id) {
		String Id = id;
		return docClearanceRepository.getOneDocClearance(Id);
	}
	
	@GetMapping("/getOneDocClearanceRef/{ref}")
	public DoctorClearance getOneDocClearanceRef(@PathVariable String ref) {
		return docClearanceRepository.getOneDocClearanceRef(ref);
	}
	
	@PostMapping("/updateDocClearance")
	public int updateDocClearance(@RequestBody Map<String, String>body){
		int docClearanceID		= Integer.parseInt(body.get("docClearanceID"));
		
		String dataRef			= body.get("dataRef");
		String pastmedHis		= body.get("pastmedHis");
		String socialHis		= body.get("socialHis");
		String allergies		= body.get("allergies");
		String prevSurgery		= body.get("prevSurgery");
		String rOs				= body.get("rOs");
		String workUp			= body.get("workUp");
		String assesmentPlan	= body.get("assesmentPlan");
		String dateCreated		= body.get("dateCreated");
		
		try {
			return docClearanceRepository.updateDocClearance(dataRef, pastmedHis, socialHis, allergies, prevSurgery, rOs, 
					workUp, assesmentPlan, dateCreated, docClearanceID);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	
	@GetMapping("/getPidDocClearance/{pid}")
	public List<DoctorClearance> getPidDocClearance(@PathVariable String pid) {
		String Pid = pid;
		return docClearanceRepository.getPidDocClearance(Pid);
	}
	
}

