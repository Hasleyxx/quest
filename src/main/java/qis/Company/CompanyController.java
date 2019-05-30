package qis.Company;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompanyController {
	@Autowired
	CompanyRepository companyRepository;
	
	@GetMapping("/getCompany")
	public List<Company> CompanyList(){
		return companyRepository.CompanyList();
	}	
	
	@GetMapping("/getCompany/{cn}")
	public /* with/without responsebody @ResponseBody*/ List<Company> 
	CompanyName(@PathVariable String cn) {
		return companyRepository.getCompany(cn);
    
    }
	
	@PostMapping("/addCompany")
	public int AddCompany(@RequestBody Map<String, String>body){
		String cname		= body.get("nameCompany");
		String cadd			= body.get("companyAddress");
		try {
			return companyRepository.addCompany(cname, cadd);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	@PostMapping("/updateCompany")
	public int UpdateCompany(@RequestBody Map<String, String>body){
		String cname		= body.get("nameCompany");
		String cadd			= body.get("companyAddress");
		try {
			return companyRepository.updateCompany(cname, cadd);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}	

}
