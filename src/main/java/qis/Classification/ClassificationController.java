package qis.Classification;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
	@Autowired
	SendEmailRepository seRepository;
	
	@GetMapping("/getClass")
	public List<Classification> ClassList(){
		return classRepository.getclass();
	}
	@GetMapping("/getPdfResult")
	public List<PdfResult> PdfResult(){
		return pdfRepository.PdfList();
	}
	
	@GetMapping("/getSendmail")
	public List<SendEmail> SendEmailList(){
		return seRepository.EmailList();				
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
		try {
		return classRepository.addClass(trans, pid, med, notes, qc, qcl, cdate);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	@PostMapping("/updateClass")
	public int updateClass(@RequestBody Map<String, String> body) {
		String med 			= body.get("medicalClass");
		String notes 		= body.get("notes");
		String qc 			= body.get("qc");
		int qcl 			= Integer.parseInt(body.get("qclicense"));
		String cdate 		= body.get("creationDate");
		try {
			return classRepository.updateClass(med, notes, qc, qcl, cdate);
		}catch (DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@PostMapping("/addPdfResult")
	public int addPdfResult(@RequestBody Map<String, String>body) {
		String rec 			= body.get("recipient");
		String tle 			= body.get("title");
		String rf 			= body.get("resultFiles");
		String sd 			= body.get("sendDate");
		try{
			return pdfRepository.addPdf(rec, tle, rf, sd);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updatePdfResult")
	public int updatePdfResult(@RequestBody Map<String, String>body) {
		String rec 			= body.get("recipient");
		String tle 			= body.get("title");
		String rf 			= body.get("resultFiles");
		String sd 			= body.get("sendDate");
		try {
			return pdfRepository.updatePdf(rec, tle, rf, sd);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/addRecipientEmail")
	public int addRE(@RequestBody Map<String, String>body) {
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		String re 			= body.get("recipientsEmail");
		String sub 			= body.get("subject");
		String co 			= body.get("createdOn");
		String cb 			= body.get("createdBy");
		String mo 			= body.get("modifiedOn");
		int mb 				= Integer.parseInt(body.get("modifiedBy"));
		try {
			return seRepository.addEmail(pid, trans, re, sub, co, cb, mo, mb);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
		
	}
	
	@PostMapping("/updateRecipientEmail")
	public int updateRE(@RequestBody Map<String, String>body) {
		
		String re 			= body.get("recipientsEmail");
		String sub 			= body.get("subject");
		String co 			= body.get("createdOn");
		String cb 			= body.get("createdBy");
		String mo 			= body.get("modifiedOn");
		int mb 				= Integer.parseInt(body.get("modifiedBy"));
		try {
			return seRepository.updateEmail(re, sub, co, cb, mo, mb);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
		
	}
}
