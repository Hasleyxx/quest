package qis.Transaction;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TransactionController {
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	TransExtRepository transextRepository;
	@Autowired
	TransRefRepository transrefRepository;
	
	@GetMapping("/getTransaction")
	public @ResponseBody List<Transaction> ViewTransaction(){
		return transactionRepository.viewtrans();
	}
	@GetMapping("/getTransactionYear/{year}")
	public @ResponseBody List<Transaction> getTransactionYear(@PathVariable String year){
		return transactionRepository.getTransactionYear(year);
	}
	@GetMapping("/getTransaction/{id}")
	public  @ResponseBody List<Transaction> TransactionID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
		return transactionRepository.Transactionid(pid);
    }
	@GetMapping("/checkTransactionPatient/{pid}/{tid}")
	public @ResponseBody List<Transaction> checkTransactionPatient(@PathVariable String pid, @PathVariable String tid) {
		String Pid = pid;
		String Tid = tid;
		return transactionRepository.checkTransactionPatient(Pid, Tid);
	}
	@GetMapping("/getTransRef/{id}")
	public  @ResponseBody List<Transaction> TransRefbyID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
		return transactionRepository.TransRefId(pid);
    }
	
	@GetMapping("/getHeldTrans")
	public @ResponseBody List<Transaction> HeldTrans(){
		return transactionRepository.status();
	}
	
	@GetMapping("/getHeldTransDate/{v1}/{v2}")
	public @ResponseBody List<Transaction> HeldTransDate(@PathVariable String v1, @PathVariable String v2){
		return transactionRepository.statusDate(v1, v2);
	}
	
	@GetMapping("/getTransactionDate/{v1}/{v2}")
	public List<Transaction> TransactionDate(@PathVariable String v1, @PathVariable String v2) {
		return transactionRepository.getTransactionDate(v1, v2); 
    }
	
	@GetMapping("/getTransactionToday/{v1}")
	public List<Transaction> TransactionToday(@PathVariable String v1) {
		return transactionRepository.getTransactionToday(v1); 
    }
	
	@GetMapping("/getTransactionDateBiller/{v1}/{v2}/{v3}")
	public List<Transaction> TransactionDateBiller(@PathVariable String v1, @PathVariable String v2, @PathVariable String v3) {
		return transactionRepository.getTransactionDateBiller(v1, v2, v3); 
    }
	
	@GetMapping("/getTransactionId/{v1}/{v2}")
	public List<Transaction> TransactionId(@PathVariable String v1, @PathVariable String v2) {
		return transactionRepository.getTransactionId(v1, v2);
	}
	
	@GetMapping("/getTransBillingDate/{v1}/{v2}")
	public List<Transaction> getTransactionBillingDate(@PathVariable String v1, @PathVariable String v2) {
		return transactionRepository.getTransactionBillingDate(v1, v2); 
    }
	
	@GetMapping("/getTransactionType/{type}")
	public List<Transaction> TransactionType(@PathVariable String type){
		return transactionRepository.getTransactionType(type);
	}
	
	@GetMapping("/getTransTypeDate/{type}/{v1}/{v2}")
	public List<Transaction> TransactionTypeDate(@PathVariable String type,
			@PathVariable String v1, @PathVariable String v2){
		return transactionRepository.getTransactionTypeDate(type, v1, v2);
	}
	
	@GetMapping("/getTransext")
	public @ResponseBody List<TransExt> ViewTransExt(){
		return transextRepository.viewtrans();
	}
	
	@GetMapping("/getTransext/{id}")
	public  @ResponseBody List<TransExt> TransextbyID(@PathVariable String id) {
		int tid = Integer.parseInt(id);
		return transextRepository.transrefbyID(tid);
    }
	
	@DeleteMapping("/deleteTransext/{id}")
	public @ResponseBody int DeletebyTransID(@PathVariable String id){
		int tid = Integer.parseInt(id);
		try {
		return transextRepository.deleteTrans(tid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	
	@GetMapping("/getTransRef")
	public @ResponseBody List<TransRef> ViewTransRef(){
		return transrefRepository.viewtransref();
	}
	@GetMapping("/getTRby/{tid}")
	public  @ResponseBody List<TransRef> TransRefID(@PathVariable String tid) {
		int pid = Integer.parseInt(tid);
		return transrefRepository.TransRefId(pid);
    }
	
	 @PostMapping("/addTransaction")
	 public int AddTransaction(@RequestBody Map<String, String>body) {
	 	String tRef 			= body.get("transactionRef");
	 	Integer pId 			= Integer.parseInt(body.get("patientId"));	
	 	int uId 				= Integer.parseInt(body.get("userId"));
	 	String tType 			= body.get("transactionType");
	 	String bil 				= body.get("biller");
	 	String tPrice 			= body.get("totalPrice");
	 	double pIn 				= Double.parseDouble(body.get("paidIn"));
	 	double pOut 			= Double.parseDouble(body.get("paidOut"));
	 	double gTotal 			= Double.parseDouble(body.get("grandTotal"));
	 	String tDate 			= body.get("transactionDate");
	 	int status 				= Integer.parseInt(body.get("status"));
	 	String sType 			= body.get("salesType");
	 	String loe 				= body.get("loe");
	 	String an 				= body.get("an");
	 	String ac 				= body.get("ac");
	 	String notes 			= body.get("notes");
	 	String cur				= body.get("currency");
	 	String ApeID			= body.get("ApeID");
	 	String approvalCode		= body.get("approvalCode");
	 	
	 	try {
	 	return transactionRepository.addTransaction(tRef, pId, uId, tType, bil, tPrice, pIn,
	 			pOut, gTotal, tDate, status, sType, loe, an, ac, notes, cur, ApeID, approvalCode);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 @PostMapping("/updateTransaction")
	 public int UpdateTransaction(@RequestBody Map<String, String>body) {
		Integer pId 		= Integer.parseInt(body.get("patientId"));	
		int uId 			= Integer.parseInt(body.get("userId"));
	 	String tType 		= body.get("transactionType");
	 	String bil 			= body.get("biller");
	 	String tPrice 		= body.get("totalPrice");
	 	double pIn 			= Double.parseDouble(body.get("paidIn"));
	 	double pOut 		= Double.parseDouble(body.get("paidOut"));
	 	double gTotal 		= Double.parseDouble(body.get("grandTotal"));
	 	String tDate 		= body.get("transactionDate");
	 	int status 			= Integer.parseInt(body.get("status"));
	 	String sType 		= body.get("salesType");
	 	String loe 			= body.get("loe");
	 	String an 			= body.get("an");
	 	String ac 			= body.get("ac");
	 	String notes 		= body.get("notes");
	 	int trans			= Integer.parseInt(body.get("transactionId"));
	 	String cur			= body.get("currency");

	 	return transactionRepository.updateTransaction(pId, uId, tType, bil, tPrice, pIn,
 				pOut, gTotal, tDate, status, sType, loe, an, ac, notes, cur, trans);
	 	//try {
	 		//return transactionRepository.updateTransaction(pId, uId, tType, bil, tPrice, pIn,
	 		//		pOut, gTotal, tDate, status, sType, loe, an, ac, notes, cur, trans);
	 //	}catch (DataIntegrityViolationException e){
	 		//return 0;
	 	//}
	 }
	 
	 @PostMapping("/updateACANLOE")
	 public int UpdateACANLOE(@RequestBody Map<String, String>body) {
		 int tid			= Integer.parseInt(body.get("transactionId"));
		 String loe 		= body.get("loe");
		 String an			= body.get("an");
		 String	ac			= body.get("ac");
		 String tdate 		= body.get("transactionDate");
		 try {
			 return transactionRepository.updateACANLOE(ac, an, loe, tdate, tid);
		 }catch(DataIntegrityViolationException e) {
			 return 0;
		 }
	 }
	 
	 @PostMapping("/updateStatus")
	 public int UpdateStatus(@RequestBody Map<String, String>body) {
		 int status 		= Integer.parseInt(body.get("status"));
		 int trans			= Integer.parseInt(body.get("transactionId"));
		 try {
		 		return transactionRepository.updateStatus(status, trans);
		 	}catch (DataIntegrityViolationException e){
		 		return 0;
		 	}
	 }
	 
	 @PostMapping("/addTransext")
	 public int AddTransext(@RequestBody Map<String, String>body) {
	 	int tid 		= Integer.parseInt(body.get("transactionId"));
	 	Integer iid;
	 	if(body.get("itemID") != null) {
	 		iid = Integer.parseInt(body.get("itemID"));
	 	}else {
	 		iid = null;
	 	}
	 	String pname 	= body.get("packageName");
	 	int qty 		= Integer.parseInt(body.get("itemQTY"));
	 	int disc 		= Integer.parseInt(body.get("itemDisc"));
	 	try {
	 		return transextRepository.addtransext(tid, iid, pname, qty, disc);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 
	 @PostMapping("/updateTransext")
	 public int UpdateTransext(@RequestBody Map<String, String>body) {
		String pname    = body.get("packageName");
	 	int qty 		= Integer.parseInt(body.get("itemQTY"));
	 	int disc 		= Integer.parseInt(body.get("itemDisc"));
	 	int teid 		= Integer.parseInt(body.get("transExtID"));
	 	try {
	 		return transextRepository.updatetransext(pname, qty, disc, teid);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 
	 @PostMapping("/addTransref")
	 public int AddTransRef(@RequestBody Map<String, String> body) {
	 	System.out.println(body);
	 	int trans 			= Integer.parseInt(body.get("transactionId"));
	 	int pid 			= Integer.parseInt(body.get("patientID"));
	 	int xray 			= Integer.parseInt(body.get("xray"));
	 	int blood 			= Integer.parseInt(body.get("blood"));
	 	int urine 			= Integer.parseInt(body.get("urine"));
	 	int stool 			= Integer.parseInt(body.get("stool"));
	 	int pe 				= Integer.parseInt(body.get("physicalExam"));
	 	int speci 			= Integer.parseInt(body.get("specimen"));
	 	int usound 			= Integer.parseInt(body.get("ultrasound"));
	 	int ecg 			= Integer.parseInt(body.get("ecg"));
	 	int others 			= Integer.parseInt(body.get("others"));
	 	int _2d				= Integer.parseInt(body.get("_2dEcho"));
	 	
	 	try {
	 		return transrefRepository.addtransref(trans, pid, xray, blood, urine, stool, pe,
	 			speci, usound, ecg, others, _2d);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 
	 @PostMapping("/updateTransref")
	 public int UpdateTransRef(@RequestBody Map<String, String> body) {
	 	int xray 			= Integer.parseInt(body.get("xray"));
	 	int blood 			= Integer.parseInt(body.get("blood"));
	 	int urine 			= Integer.parseInt(body.get("urine"));
	 	int stool 			= Integer.parseInt(body.get("stool"));
	 	int pe 				= Integer.parseInt(body.get("physicalExam"));
	 	int speci 			= Integer.parseInt(body.get("specimen"));
	 	int usound 			= Integer.parseInt(body.get("ultrasound"));
	 	int ecg 			= Integer.parseInt(body.get("ecg"));
	 	int others 			= Integer.parseInt(body.get("others"));
	 	int _2d				= Integer.parseInt(body.get("_2dEcho"));
	 	int trans 			= Integer.parseInt(body.get("transactionId"));
	 	try {
	 		return transrefRepository.updatetransref( xray, blood, urine, stool, pe,
	 			speci, usound, ecg, others ,_2d, trans);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }

	 @PostMapping("/updateChecklist")
	 public int updateChecklist(@RequestBody Map<String, String> body) {
	 	int tid 			= Integer.parseInt(body.get("transactionId"));

	 	String type 		= body.get("type");
	 	String status 		= body.get("status");
	 	System.out.println(body);
	 	try {
	 		if (type.equals("have_blood")) {
	 			return transactionRepository.updateChecklistBlood(tid, status);

	 		} else if (type.equals("have_stool")) {
	 			return transactionRepository.updateChecklistStool(tid, status);
	 			
	 		} else if (type.equals("have_urine")) {
	 			return transactionRepository.updateChecklistUrine(tid, status);
	 			
	 		} else if (type.equals("have_xray")) {
	 			return transactionRepository.updateChecklistXray(tid, status);
	 			
	 		} else if (type.equals("have_medical")) {
	 			return transactionRepository.updateChecklistMedical(tid, status);
	 			
	 		} else {
	 			return transactionRepository.updateChecklistVital(tid, status);
	 			
	 		}
	 	}catch (DataIntegrityViolationException e) {
	 		return 0;
	 	}
	 }
	 
	 @PostMapping("/release")
	 public int release(@RequestBody Map<String, String> body) {
		 int tid = Integer.parseInt(body.get("tid"));
		 String status = body.get("status");
		 
		 try {
			 return transactionRepository.release(tid, status);
		 }catch (DataIntegrityViolationException e) {
		 		return 0;
		 	}
	 }
	 
	 @GetMapping("/getApeID/{ApeID}")
	 public @ResponseBody List<Transaction> getApeID(@PathVariable String ApeID ){
		return transactionRepository.getApeID(ApeID);
	} 
	 
}
