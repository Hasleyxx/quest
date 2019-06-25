package qis.Personnel;

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
public class PersonnelController {
	@Autowired
	LabPersonnelRepository LabPerRepository;
	
	@GetMapping("/getPersonnel/{id}")
	public  @ResponseBody List<LabPersonnel> LabPersonnelbyID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabPerRepository.getpersonnelbyid(pid);
    }
	
	@GetMapping("/getPersonnel")
	public List<LabPersonnel> LabPersonnel() {
        return LabPerRepository.getpersonnel();
    }
	
	@PostMapping("/addPersonnel")
    public int addPersonnel(@RequestBody Map<String, String> body){
		String fn 			= body.get("firstName");
		String mn 			= body.get("middleName");
		String ln 			= body.get("lastName");
		String no 			= body.get("licenseNO");
		String po 			= body.get("position");
		String ext 			= body.get("positionEXT");
		try {
			return LabPerRepository.addPersonnel(fn, mn, ln, no, po, ext);
		}catch (DataIntegrityViolationException e) {
   			return 0;
   		}
		
	}
	
	@PostMapping("/updatePersonnel")
    public int updatePersonnel(@RequestBody Map<String, String> body){
		String fn 			= body.get("firstName");
		String mn 			= body.get("middleName");
		String ln 			= body.get("lastName");
		String no 			= body.get("licenseNO");
		String po 			= body.get("position");
		String ext 			= body.get("positionEXT");
		int pid 			= Integer.parseInt(body.get("personnelID"));
		try {
			return LabPerRepository.updatePersonnel(fn, mn, ln, no, po, ext, pid);
		}catch (DataIntegrityViolationException e) {
   			return 0;
   		}
		
	}
}
