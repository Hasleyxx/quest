package qis.Accounting;

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
public class AccountingController {
	@Autowired
	AccountingRepository accRep;
	
	@GetMapping("/accList")
	public @ResponseBody List<Accounting> accList() {
	    	return accRep.accList();
	}
	
	@GetMapping("/accTID/{id}")
	public @ResponseBody List<Accounting> accListbyTID(@PathVariable String id) {
		int tid = Integer.parseInt(id);
	    	return accRep.accListbyTID(tid);
	}
	
	@GetMapping("/accPID/{id}")
	public @ResponseBody List<Accounting> accListbyPID(@PathVariable String id) {
		int tid = Integer.parseInt(id);
	    	return accRep.accListbyPID(tid);
	}
	
	@PostMapping("/addAcc")
    public int addAcc(@RequestBody Map<String, String>body) {
    	int tid 			= Integer.parseInt(body.get("TransactionID"));
    	int pid 			= Integer.parseInt(body.get("PatientID"));
    	String cur 			= body.get("PaidCur");
    	String pdate 		= body.get("PaidDate");
    	String tdate 		= body.get("TimeLimit");
    	try {
    		return accRep.addAcc(tid, cur, pdate, tdate, pid);
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	
	@PostMapping("/updateAcc")
    public int updateAcc(@RequestBody Map<String, String>body) {
    	String cur 			= body.get("PaidCur");
    	String pdate 		= body.get("PaidDate");
    	String tdate 		= body.get("TimeLimit");
    	int aid				= Integer.parseInt(body.get("accID"));
    	try {
    		return accRep.updateAcc( cur, pdate, tdate, aid );
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
}
