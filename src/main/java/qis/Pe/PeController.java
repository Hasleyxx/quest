package qis.Pe;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import qis.Classification.Classification;
import qis.Classification.ClassificationRepository;
import qis.Classification.PdfRepository;
import qis.Classification.PdfResult;


@RestController
public class PeController {
	@Autowired
	PeRepository peRepository;
	@Autowired
	mHistoryRepository mhRepository;
	
	
	@GetMapping("/pelist")
    public List<PE> PeList(){
    	return peRepository.PeList();
    }
	
	@GetMapping("/getMedicalHistory")
	public List<MedicalHistory> MedList(){
    	return mhRepository.MedList();
    }
	
	
	@PostMapping("/addPE")
    public int AddPe(@RequestBody Map<String, String>body) {
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String skin 		= body.get("skin");
		String hn 			= body.get("hn");
		String cbl 			= body.get("cbl");
		String ch 			= body.get("ch");
		String abdo 		= body.get("abdo");
		String extre 		= body.get("extre");
		String ot 			= body.get("ot");
		String find 		= body.get("find");
		String doctor 		= body.get("doctor");
		int license 		= Integer.parseInt(body.get("license"));
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
    	
    return peRepository.addPe(trans, pid, skin, hn, cbl, ch, abdo, extre, ot, find,
    		doctor, license, cdate, udate);
    }
	
	@PostMapping("/updatePE")
		public int UpdatePe(@RequestBody Map<String, String> body) {
		String skin 		= body.get("skin");
		String hn 			= body.get("hn");
		String cbl 			= body.get("cbl");
		String ch 			= body.get("ch");
		String abdo 		= body.get("abdo");
		String extre 		= body.get("extre");
		String ot 			= body.get("ot");
		String find 		= body.get("find");
		String doctor 		= body.get("doctor");
		int license 		= Integer.parseInt(body.get("license"));
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
	return peRepository.updatePe(skin, hn, cbl, ch, abdo, extre, ot, find,
			doctor, license, cdate, udate);
	}
	
	
	
	@PostMapping("/addMedhis")
    public int AddMedHis(@RequestBody Map<String, String>body) {
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String asth 		= body.get("asth");
		String tb 			= body.get("tb");
		String dia 			= body.get("dia");
		String hb 			= body.get("hb");
		String hp 			= body.get("hp");
		String kp 			= body.get("kp");
		String ab 			= body.get("ab");
		String jbs 			= body.get("jbs");
		String pp 			= body.get("pp");
		String mh 			= body.get("mh");
		String fs 			= body.get("fs");
		String alle 		= body.get("alle");
		String ct 			= body.get("ct");
		String hep 			= body.get("hep");
		String std 			= body.get("std");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		
		return mhRepository.addMedhis(trans, pid, asth, tb, dia, hb, hp, kp, ab, jbs, pp,
    		mh, fs, alle, ct, hep, std, cdate, udate);
    }
	
	@PostMapping("/updateMedhis")
	public int UpdateMedHis(@RequestBody Map<String, String>body) {
		String asth 			= body.get("asth");
		String tb 				= body.get("tb");
		String dia 				= body.get("dia");
		String hb 				= body.get("hb");
		String hp 				= body.get("hp");
		String kp 				= body.get("kp");
		String ab 				= body.get("ab");
		String jbs 				= body.get("jbs");
		String pp 				= body.get("pp");
		String mh 				= body.get("mh");
		String fs 				= body.get("fs");
		String alle 			= body.get("alle");
		String ct 				= body.get("ct");
		String hep 				= body.get("hep");
		String std 				= body.get("std");
		String cdate 			= body.get("creationDate");
		String udate 			= body.get("dateUpdate");
		return mhRepository.updateMedhis(asth, tb, dia, hb, hp, kp, ab, jbs, pp, mh,
				fs, alle, ct, hep, std, cdate, udate);
	}
	
	
}