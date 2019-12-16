package qis.DoctorPE;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import qis.DoctorPE.DoctorPe;
import qis.DoctorPE.DoctorPeRepository;

@RestController
public class DoctorPeController {
	@Autowired
	DoctorPeRepository docPeRepository;
	
	@GetMapping("/getDocPe")
	public List<DoctorPe> docPe() {
		return docPeRepository.docPe();
	}

	@GetMapping("/getDocPe/{dataRef}")
	public DoctorPe getDocPe(@PathVariable String dataRef) {
		String DataRef = dataRef;
		return docPeRepository.getDocPe(DataRef);
	}
	
	@PostMapping("/addDocPe")
	public int addDocPatient(@RequestBody Map<String, String>body){
		int pid					= Integer.parseInt(body.get("patientID"));
		
		String dataRef 			= body.get("dataRef");
		String bp			    = body.get("bp");
		String hr		        = body.get("hr");
		String hn          		= body.get("hn");
		String cl 				= body.get("cl");
		String cardiac			= body.get("cardiac");
		String abd 				= body.get("abd");
		String ext				= body.get("ext");
		String dateCreated		= body.get("dateCreated");
		System.out.println(body);
		try {
			return docPeRepository.addDocPe(pid, dataRef, bp, hr, hn, cl, cardiac, abd, ext, dateCreated);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updateDocPe")
	public int updateDocPe(@RequestBody Map<String, String>body){
		int	dpid				= Integer.parseInt(body.get("docPeID"));
		
		String dataRef 			= body.get("dataRef");
		String bp			    = body.get("bp");
		String hr		        = body.get("hr");
		String hn          		= body.get("hn");
		String cl 				= body.get("cl");
		String cardiac			= body.get("cardiac");
		String abd 				= body.get("abd");
		String ext				= body.get("ext");
		String dateCreated		= body.get("dateCreated");
		
		try {
			return docPeRepository.updateDocPe(dataRef, bp, hr, hn, cl, cardiac, abd, ext,  dateCreated, dpid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
