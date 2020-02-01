package qis.DoctorRequestCategory;

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
public class DoctorRequestCategoryController {
	@Autowired
	DoctorRequestCategoryRepository doctorRequestCategoryRep;
	
	@GetMapping("/getDocRequestCategory")
	public List<DoctorRequestCategory> docRequestCategory(){
		return doctorRequestCategoryRep.docRequestCategory();
	}
	
	@GetMapping("/getDocRequestCategory/{docReqCatId}")
	public  @ResponseBody List<DoctorRequestCategory> docRequestCategoryId(@PathVariable String docReqCatId) {
		int DocReqCatId = Integer.parseInt(docReqCatId);
		
        return doctorRequestCategoryRep.docRequestCategoryId(DocReqCatId);
	}
	
	@PostMapping("/addDocRequestCategory")
	public int addDocRequestCategory(@RequestBody Map<String, String>body){
		String Category		= body.get("category");
		
		try {
			return doctorRequestCategoryRep.addDocRequestCategory(Category);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}

	@PostMapping("/updateDocRequestCategory")
	public int docRequestCategoryUpdate(@RequestBody Map<String, String>body) {
		String Status	= body.get("status");
		int DocReqCatId = Integer.parseInt(body.get("docReqCatId"));
		
        return doctorRequestCategoryRep.docRequestCategoryUpdate(Status, DocReqCatId);
	}
}
