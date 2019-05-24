package qis.Cashier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CashierController {
	@Autowired
	CashierRepository cashierRespository;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/TransactionList")
	public List<Cashier> findTransactionList() {
	    	return cashierRespository.findTransactionList();
	}
	    
	@GetMapping("/HMOList")
	public List<Cashier> findHMOList(){
	    	return cashierRespository.findHMOList();
	}
	
	
	
}
