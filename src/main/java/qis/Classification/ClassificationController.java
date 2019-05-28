package qis.Classification;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassificationController {
	@Autowired
	ClassificationRepository classRepository;
	@Autowired
	PdfRepository pdfRepository;
	
	@GetMapping("/getClass")
	public List<Classification> ClassList(){
		return classRepository.getclass();
	}
	@GetMapping("/getPdfResult")
	public List<PdfResult> PdfResult(){
		return pdfRepository.PdfList();
	}	
	
	@PostMapping("/addClass")
	public int addClass(@RequestBody Map<String, String> body) {
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String med 			= body.get("medicalClass");
		String notes 		= body.get("notes");
		String qc 			= body.get("qc");
		int qcl 			= Integer.parseInt(body.get("qclicense"));
		String cdate 		= body.get("creationDate");
		return classRepository.addClass(trans, pid, med, notes, qc, qcl, cdate);
	}
	@PostMapping("/updateClass")
	public int updateClass(@RequestBody Map<String, String> body) {
		String med 			= body.get("medicalClass");
		String notes 		= body.get("notes");
		String qc 			= body.get("qc");
		int qcl 			= Integer.parseInt(body.get("qclicense"));
		String cdate 		= body.get("creationDate");
		return classRepository.updateClass(med, notes, qc, qcl, cdate);
	}
	
	@PostMapping("/addPdfResult")
	public int addPdfResult(@RequestBody Map<String, String>body) {
		String rec = body.get("receipient");
		String tle = body.get("title");
		String rf = body.get("resultFiles");
		String sd = body.get("sendDate");
		return pdfRepository.addPdf(rec, tle, rf, sd);
	}
	
	@PostMapping("/updatePdfResult")
	public int updatePdfResult(@RequestBody Map<String, String>body) {
		String rec = body.get("receipient");
		String tle = body.get("title");
		String rf = body.get("resultFiles");
		String sd = body.get("sendDate");
		return pdfRepository.updatePdf(rec, tle, rf, sd);
	}

}
