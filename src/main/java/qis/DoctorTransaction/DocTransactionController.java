package qis.DoctorTransaction;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocTransactionController {
	@Autowired
	DocTransactionRepository docTransRep;
	
	@GetMapping("/getDocTransactions/{date1}/{date2}")
	public List<DocTransaction> getDocTransactions(@PathVariable String date1, @PathVariable String date2) {
		return docTransRep.getDocTransactions(date1, date2);
	}
	
	@GetMapping("/getOneDocTransaction/{tid}")
	public DocTransaction getOneDocTransaction(@PathVariable int tid) {
		return docTransRep.getOneDocTransaction(tid);
	}
	
	@GetMapping("/getDocTransactionsCanceled/{date1}/{date2}")
	public List<DocTransaction> getDocTransactionsCanceled(@PathVariable String date1, @PathVariable String date2) {
		return docTransRep.getDocTransactionsCanceled(date1, date2);
	}
	
	@PostMapping("/addDocTransaction")
	public int addDocTransaction(@RequestBody Map<String, String> body) {
		String transactionRef					= body.get("transactionRef");
		int userId								= Integer.parseInt(body.get("userId"));
		int patientId							= Integer.parseInt(body.get("patientId"));
		String totalPrice						= body.get("totalPrice");
		double paidIn							= Integer.parseInt(body.get("paidIn"));
		double paidOut							= Integer.parseInt(body.get("paidOut"));
		double grandTotal						= Integer.parseInt(body.get("grandTotal"));
		
		return docTransRep.addDocTransaction(transactionRef, userId, patientId, totalPrice, paidIn, paidOut, grandTotal);
	}
	
	@GetMapping("/cancelDocTransaction/{transDocId}")
	public int cancelDocTransaction(@PathVariable int transDocId) {
		return docTransRep.cancelDocTransaction(transDocId);
	}
	
	@PostMapping("/updateDocTransaction")
	public int updateDocTransaction(@RequestBody Map<String, String> body) {
		int transactionDocId					= Integer.parseInt(body.get("transactionDocId"));
		String totalPrice						= body.get("totalPrice");
		double paidIn							= Integer.parseInt(body.get("paidIn"));
		double paidOut							= Integer.parseInt(body.get("paidOut"));
		double grandTotal						= Integer.parseInt(body.get("grandTotal"));
		String itemId							= body.get("itemId");
		String date_paid						= body.get("date_paid");
		
		return docTransRep.updateDocTransaction(transactionDocId, totalPrice, paidIn, paidOut, grandTotal, itemId, date_paid);
	}
}
