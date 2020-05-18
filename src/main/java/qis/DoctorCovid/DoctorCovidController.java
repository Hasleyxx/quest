package qis.DoctorCovid;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorCovidController {
	@Autowired
	DoctorCovidRepository docCovidRep;
	
	@GetMapping("/getCovidHistory/{patientId}")
	public List<DoctorCovid> getCovidHistory(@PathVariable int patientId) {
		return docCovidRep.getCovidHistory(patientId);
	}
	
	@GetMapping("/getCovidHistoryOne/{docCovidId}")
	public DoctorCovid getCovidHistoryOne(@PathVariable int docCovidId) {
		return docCovidRep.getCovidHistoryOne(docCovidId);
	}
	
	@PostMapping("/addCovid")
	public int addCovid(@RequestBody Map<String, String> body) {
		int patientId						= Integer.parseInt(body.get("patientId"));
		int userID							= Integer.parseInt(body.get("userID"));
		String result						= body.get("result");
		
		return docCovidRep.addCovid(patientId, result, userID);
	}
	
	@PostMapping("/updateCovid")
	public int updateCovid(@RequestBody Map<String, String> body) {
		int docCovidId						= Integer.parseInt(body.get("docCovidId"));
		int userID							= Integer.parseInt(body.get("userID"));
		String result						= body.get("result");
		String dateUpdate					= body.get("dateUpdate");
		
		return docCovidRep.updateCovid(docCovidId, result, userID, dateUpdate);
	}
}
