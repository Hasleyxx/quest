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
	@Autowired
	BillingRepository bilRep;
	
	@GetMapping("/accList")
	public @ResponseBody List<Accounting> accList() {
	    	return accRep.accList();
	}
	
	@GetMapping("/accID/{id}")
	public @ResponseBody List<Accounting> accListbyID(@PathVariable String id) {
		int aid = Integer.parseInt(id);
	    	return accRep.accListbyID(aid);
	}
	
	@GetMapping("/accTID/{id}")
	public @ResponseBody List<Accounting> accListbyTID(@PathVariable String id) {
		int tid = Integer.parseInt(id);
	    	return accRep.accListbyTID(tid);
	}
	
	@GetMapping("/accBID/{id}")
	public @ResponseBody List<Accounting> accListbyBID(@PathVariable String id) {
		int bid = Integer.parseInt(id);
	    	return accRep.accListbyBID(bid);
	}
	
	@GetMapping("/accCID/{id}")
	public @ResponseBody List<Accounting> accListbyCID(@PathVariable String id) {
		int cid = Integer.parseInt(id);
	    	return accRep.accListbyCID(cid);
	}
	
	@GetMapping("/bilList")
	public @ResponseBody List<Billing> bilList() {
	    	return bilRep.bilList();
	}
	
	@GetMapping("/bilList/{id}")
	public @ResponseBody List<Billing> bilCID(@PathVariable String id) {
			int cid = Integer.parseInt(id);
	    	return bilRep.bilCID(cid);
	}
	
	@GetMapping("/bilID/{id}")
	public @ResponseBody List<Billing> bilBID(@PathVariable String id) {
			int bid = Integer.parseInt(id);
	    	return bilRep.bilBID(bid);
	}
	
	@GetMapping("/bilSC/{id}")
	public @ResponseBody List<Billing> bilSC(@PathVariable String id) {
			int sc = Integer.parseInt(id);
	    	return bilRep.bilSC(sc);
	}
	
	@PostMapping("/addAcc")
    public int addAcc(@RequestBody Map<String, String>body) {
		Integer tid, bid;
		if(body.get("transactionID") != null) {
			tid = Integer.parseInt(body.get("transactionID"));
		}else {
			tid = null;
		}
		if(body.get("billID") != null) {
			bid = Integer.parseInt(body.get("billID"));
		}else {
			bid = null;
		}
    	int cid = Integer.parseInt(body.get("companyID"));
    	double debit = Double.parseDouble(body.get("debit"));
    	String pt = body.get("paymentType");
    	String pc = body.get("paymentCur");
    	String cn = body.get("checkNo");
    	String bank = body.get("bank");
    	String cd = body.get("checkDate");
    	String pd = body.get("paymentDate");
    	
    	try {
    		return accRep.addAcc(tid, bid, cid, debit, pt, pc, cn, bank, cd, pd);
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	
	@PostMapping("/updateAcc")
    public int updateAcc(@RequestBody Map<String, String>body) {
		Integer tid, bid;
		if(body.get("transactionID") != null) {
			tid = Integer.parseInt(body.get("transactionID"));
		}else {
			tid = null;
		}
		if(body.get("billID") != null) {
			bid = Integer.parseInt(body.get("billID"));
		}else {
			bid = null;
		}
    	int cid = Integer.parseInt(body.get("companyID"));
    	int aid = Integer.parseInt(body.get("apID"));
    	double debit = Double.parseDouble(body.get("debit"));
    	String pt = body.get("paymentType");
    	String pc = body.get("paymentCur");
    	String cn = body.get("checkNo");
    	String bank = body.get("bank");
    	String cd = body.get("checkDate");
    	String pd = body.get("paymentDate");
    	
    	try {
    		return accRep.updateAcc(tid, bid, cid, debit, pt, pc, cn, bank, cd, pd, aid);
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	
	@PostMapping("/addBil")
    public int addBil(@RequestBody Map<String, String>body) {
    	int cid = Integer.parseInt(body.get("companyID"));
    	String add = body.get("address");
    	String tids = body.get("transIds");
    	String sd = body.get("soaDate");
    	String td = body.get("toDate");
    	String fd = body.get("fromDate");
    	String sc = body.get("soaCode");
    	String att = body.get("attention");
    	String pre = body.get("prepared");
    	String ver = body.get("verified");
    	String val = body.get("validated");
    	
    	try {
    		return bilRep.addBil(cid, add, sc, fd, td, sd, tids, att, pre, ver, val);
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
	
	@PostMapping("/updateBil")
    public int updateBil(@RequestBody Map<String, String>body) {
		int bid = Integer.parseInt(body.get("billID"));
    	int cid = Integer.parseInt(body.get("companyID"));
    	String add = body.get("address");
    	String tids = body.get("transIds");
    	String sd = body.get("soaDate");
    	String td = body.get("toDate");
    	String fd = body.get("fromDate");
    	String sc = body.get("soaCode");
    	String att = body.get("attention");
    	String pre = body.get("prepared");
    	String ver = body.get("verified");
    	String val = body.get("validated");
    	
    	try {
    		return bilRep.updateBil(cid, add, sc, fd, td, sd, tids, att, pre, ver, val,  bid);
    	}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
}
