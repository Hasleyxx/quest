package qis.Transaction;

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
public class TransactionController {
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	TransExtRepository transextRepository;
	@Autowired
	TransRefRepository transrefRepository;
	
	@GetMapping("/gettransaction")
	public @ResponseBody List<Transaction> ViewTransaction(){
		return transactionRepository.viewtrans();
	}
	@GetMapping("/getTransaction/{id}")
	public  @ResponseBody List<Transaction> TransactionID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
		return transactionRepository.Transactionid(pid);
    }
	@GetMapping("/getTransRef/{id}")
	public  @ResponseBody List<Transaction> TransRefID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
		return transactionRepository.TransRefId(pid);
    }
	
	@GetMapping("/getTransext")
	public @ResponseBody List<TransExt> ViewTransExt(){
		return transextRepository.viewtrans();
	}
	@GetMapping("/getTransref")
	public @ResponseBody List<TransRef> ViewTransRef(){
		return transrefRepository.viewtransref();
	}
	
	 @PostMapping("/addTransaction")
	 public int AddTransaction(@RequestBody Map<String, String>body) {
	 	String tRef 		= body.get("transactionRef");
	 	int pId 			= Integer.parseInt(body.get("patientId"));
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
	 	try {
	 	return transactionRepository.addTransaction(tRef, pId, uId, tType, bil, tPrice, pIn,
	 			pOut, gTotal, tDate, status, sType, loe, an, ac, notes);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 @PostMapping("/updateTransaction")
	 public int UpdateTransaction(@RequestBody Map<String, String>body) {
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
	 	try {
	 		return transactionRepository.updateTransaction(tType, bil, tPrice, pIn, pOut,
	 			gTotal, tDate, status, sType, loe, an, ac, notes);
	 	}catch (DataIntegrityViolationException e){
	 		return 0;
	 	}
	 }
	 
	 @PostMapping("/addTransext")
	 public int AddTransext(@RequestBody Map<String, String>body) {
	 	int tid 		= Integer.parseInt(body.get("transactionID"));
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
	 	int qty 		= Integer.parseInt(body.get("itemQTY"));
	 	int disc 		= Integer.parseInt(body.get("itemDisc"));
	 	try {
	 		return transextRepository.updatetransext(qty, disc);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	 
	 @PostMapping("/addTransref")
	 public int AddTransRef(@RequestBody Map<String, String> body) {
	 	int trans 			= Integer.parseInt(body.get("transactionID"));
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
	 	try {
	 		return transrefRepository.addtransref(trans, pid, xray, blood, urine, stool, pe,
	 			speci, usound, ecg, others);
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
	 	try {
	 		return transrefRepository.updatetransref( xray, blood, urine, stool, pe,
	 			speci, usound, ecg, others);
	 	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	 }
	
	 
}
