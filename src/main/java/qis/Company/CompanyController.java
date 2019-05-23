package qis.Company;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	CompanyRepository companyRepository;
	
	@PostMapping("/addCompany")
	public int AddCompany(@RequestBody Map<String, String>body){
		String cname		= body.get("nameCompany");
		String cadd			= body.get("companyAddress");
		return companyRepository.addCompany(cname, cadd);
	}
	@PostMapping("/updateCompany")
	public int UpdateCompany(@RequestBody Map<String, String>body){
		String cname		= body.get("nameCompany");
		String cadd			= body.get("companyAddress");
		return companyRepository.updateCompany(cname, cadd);
	}	

}
