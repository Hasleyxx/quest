package qis.Cashier;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CashierController {
	@Autowired
	CashierRepository cashierRespository;
	@Autowired
	CashierPatientRepository patientRepository;
	
	@GetMapping("/Cash1")
    public  @ResponseBody List<Cashier1> ListPatient() {
        return patientRepository.findPatient();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/TransactionList")
	public List<Cashier> findTransactionList() {
	    	return cashierRespository.findTransactionList();
	}
	    
	@GetMapping("/HMOList")
	public List<Cashier> findHMOList(){
	    	return cashierRespository.findHMOList();
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
		String a			 = body.get("age");
		int age				 = Integer.parseInt(a);
		String gen			 = body.get("gender");
		String no			 = body.get("contactNo");
		String biller		 = body.get("patientBiller");
		String notes		 = body.get("notes");
		String sid			 = body.get("sid");
		String cdate		 = body.get("creationDate");
		String udate		 = body.get("dateUpdate");
		return patientRepository.addPatient(pRef, pType, com, pos, fn, mn, ln, add, bdate, email,
				age, gen, no, biller, notes, sid, cdate, udate);
	}
	@PostMapping("/updatePatient")
	public int UpdatePatient(@RequestBody Map<String, String>body){

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
		String a			 = body.get("age");
		int age				 = Integer.parseInt(a);
		String gen			 = body.get("gender");
		String no			 = body.get("contactNo");
		String biller		 = body.get("patientBiller");
		String notes		 = body.get("notes");
		String sid			 = body.get("sid");
		String cdate		 = body.get("creationDate");
		String udate		 = body.get("dateUpdate");
		return patientRepository.updatePatient(pRef, pType, com, pos, fn, mn, ln, add, bdate, email,
				age, gen, no, biller, notes, sid, cdate, udate);
	}
	
}
