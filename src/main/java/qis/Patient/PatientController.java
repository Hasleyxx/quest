package qis.Patient;

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
public class PatientController {
	@Autowired
	PatientRepository patientRepository;
	@GetMapping("/getPatient")
    public  @ResponseBody List<Patient> ListPatient() {
        return patientRepository.findPatient();
	}
	
	@GetMapping("/getPatient/{pid}")
	public  @ResponseBody List<Patient> PatientID(@PathVariable String pid) {
		int id = Integer.parseInt(pid);
        return patientRepository.PatientID(id);
	}
	
	@GetMapping("/checkRef/{pid}")
	public  @ResponseBody List<Patient> CheckRef(@PathVariable String pid) {
		int ref = Integer.parseInt(pid);
        return patientRepository.checkRef(ref);
	}
	
	@PostMapping("/addPatient")
	public int AddPatient(@RequestBody Map<String, String>body){
	
		String pRef			 = body.get("patientRef");
		String pType		 = body.get("patientType");
		String com			 = body.get("companyName");
		String pos			 = body.get("position");
		String fn			 = body.get("firstName");
		String mn			 = body.get("middleName");
		String ln			 = body.get("lastName");
		String add			 = body.get("address");
		String bdate		 = body.get("birthdate");
		String email		 = body.get("email");
		int age				 = Integer.parseInt(body.get("age"));
		String gen			 = body.get("gender");
		String no			 = body.get("contactNo");
		String notes		 = body.get("notes");
		String sid			 = body.get("sid");
		String cdate		 = body.get("creationDate");
		String udate		 = body.get("dateUpdate");
		try {
			return patientRepository.addPatient(pRef, pType, com, pos, fn, mn, ln, add, bdate,
					email, age, gen, no, notes, sid, cdate, udate);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	
	@PostMapping("/updatePatient")
	public int UpdatePatient(@RequestBody Map<String, String>body){
		int pid 			 = Integer.parseInt(body.get("patientID"));
		String pType		 = body.get("patientType");
		String com			 = body.get("companyName");
		String pos			 = body.get("position");
		String fn			 = body.get("firstName");
		String mn			 = body.get("middleName");
		String ln			 = body.get("lastName");
		String add			 = body.get("address");
		String bdate		 = body.get("birthdate");
		String email		 = body.get("email");
		int age				 = Integer.parseInt( body.get("age"));
		String gen			 = body.get("gender");
		String no			 = body.get("contactNo");
		String notes		 = body.get("notes");
		String sid			 = body.get("sid");
		String cdate		 = body.get("creationDate");
		String udate		 = body.get("dateUpdate");
		try {
			return patientRepository.updatePatient(pType, com, pos, fn, mn, ln, add, bdate,
					email, age, gen, no, notes, sid, cdate, udate, pid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}

}
