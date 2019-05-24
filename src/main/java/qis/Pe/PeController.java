package qis.Pe;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeController {
	@Autowired
	PeRepository peRepository;
	@Autowired
	ClassificationRepository classRepository;
	
	@GetMapping("/pelist")
    public List<PE> PeList(){
    	return peRepository.PeList();
    }
	
	@GetMapping("/getClass")
	public List<Classification> ClassList(){
		return classRepository.getclass();
	}
	
	
	@PostMapping("/addPE")
    public int AddPe(@RequestBody Map<String, String>body) {
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String skin 		= body.get("skin");
		String hn 			= body.get("hn");
		String cbl 			= body.get("cbl");
		String ch 			= body.get("ch");
		String abdo 		= body.get("abdo");
		String extre 		= body.get("extre");
		String ot 			= body.get("ot");
		String find 		= body.get("find");
		String doctor 		= body.get("doctor");
		int license 		= Integer.parseInt(body.get("license"));
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
    	
    return peRepository.addPe(trans, pid, skin, hn, cbl, ch, abdo, extre, ot, find,
    		doctor, license, cdate, udate);
    }
	
	@PostMapping("/updatePE")
		public int UpdatePe(@RequestBody Map<String, String> body) {
		String skin = body.get("skin");
		String hn = body.get("hn");
		String cbl = body.get("cbl");
		String ch = body.get("ch");
		String abdo = body.get("abdo");
		String extre = body.get("extre");
		String ot = body.get("ot");
		String find = body.get("find");
		String doctor = body.get("doctor");
		int license = Integer.parseInt(body.get("license"));
		String cdate = body.get("creationDate");
		String udate = body.get("dateUpdate");
	return peRepository.updatePe(skin, hn, cbl, ch, abdo, extre, ot, find,
			doctor, license, cdate, udate);
	}
	
	@PostMapping("/addClass")
	public int addClass(@RequestBody Map<String, String> body) {
		int trans = Integer.parseInt(body.get("transactionID"));
		int pid = Integer.parseInt(body.get("patientID"));
		String med = body.get("medicalClass");
		String notes = body.get("notes");
		String qc = body.get("qc");
		int qcl = Integer.parseInt(body.get("qclicense"));
		String cdate = body.get("creationDate");
		return classRepository.addClass(trans, pid, med, notes, qc, qcl, cdate);
	}
	@PostMapping("/updateClass")
	public int updateClass(@RequestBody Map<String, String> body) {
		String med = body.get("medicalClass");
		String notes = body.get("notes");
		String qc = body.get("qc");
		int qcl = Integer.parseInt(body.get("qclicense"));
		String cdate = body.get("creationDate");
		return classRepository.updateClass(med, notes, qc, qcl, cdate);
	}
	
}