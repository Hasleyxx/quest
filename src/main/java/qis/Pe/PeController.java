package qis.Pe;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeController {
	@Autowired
	PeRepository peRepository;
	@Autowired
	mHistoryRepository mhRepository;
	@Autowired
	VitalRepository vitalRepository;
	
	@GetMapping("/pelist")
    public List<PE> PeList(){
    	return peRepository.PeList();
    }
	
	@GetMapping("/getOnePe/{tid}")
	public PE getOnePe(@PathVariable String tid) {
		String Tid = tid;
		return peRepository.getOnePe(Tid);
	}
	
	@GetMapping("/checkPe/{pid}/{tid}")
	public List<PE> checkPe(@PathVariable String pid, @PathVariable String tid) {
		return peRepository.checkPe(pid, tid);
	}
	
	@GetMapping("/getMedicalHistory")
	public List<MedicalHistory> MedList(){
    	return mhRepository.MedList();
    }
	
	@GetMapping("/getOneMedicalHistory/{tid}")
	public MedicalHistory getOneMedicalHistory(@PathVariable String tid) {
		String Tid = tid;
		return mhRepository.getOneMedicalHistory(Tid);
	}
	
	@GetMapping("/getVital")
	public List<Vital> VitalList(){
		return vitalRepository.VitalList();
	}
	
	@GetMapping("/getOneVital/{tid}")
	public Vital getOneVital(@PathVariable String tid) {
		String Tid = tid;
		return vitalRepository.getOneVital(Tid);
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
		String ApeID		= body.get("ApeID");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
    	try {
    		return peRepository.addPe(trans, pid, skin, hn, cbl, ch, abdo, extre, ot, find,
    		doctor, license, ApeID, cdate, udate);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
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
		String pexamID		= body.get("pexamID");
		try {
			return peRepository.updatePe(skin, hn, cbl, ch, abdo, extre, ot, find,
			doctor, license, cdate, udate, pexamID);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
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
		String ApeID		= body.get("ApeID");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		try {
			return mhRepository.addMedhis(trans, pid, asth, tb, dia, hb, hp, kp, ab, jbs, pp,
    		mh, fs, alle, ct, hep, std, ApeID, cdate, udate);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
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
		String medHisID			= body.get("medHisID");
		
		try {
			return mhRepository.updateMedhis(asth, tb, dia, hb, hp, kp, ab, jbs, pp, mh,
				fs, alle, ct, hep, std, cdate, udate, medHisID);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/addVital")
	public int addVital(@RequestBody Map<String, String>body) {
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String hei 			= body.get("height");
		String wei 			= body.get("weight");
		String bmi 			= body.get("bmi");
		String bp 			= body.get("bp");
		String pr 			= body.get("pr");
		String rr 			= body.get("rr");
		String uod 			= body.get("uod");
		String uos 			= body.get("uos");
		String cod 			= body.get("cod");
		String cos 			= body.get("cos");
		String cv 			= body.get("cv");
		String hearing 		= body.get("hearing");
		String hosp 		= body.get("hosp");
		String opr 			= body.get("opr");
		String pm 			= body.get("pm");
		String smoker 		= body.get("smoker");
		String ad 			= body.get("ad");
		String lmp 			= body.get("lmp");
		String notes 		= body.get("notes");
		String ApeID		= body.get("ApeID");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		try {
			return vitalRepository.addVital(trans, pid, hei, wei, bmi, bp, pr, rr, uod, uos,
					cod, cos, cv, hearing, hosp, opr, pm, smoker, ad, lmp, notes, ApeID, cdate, udate);
		}catch(DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@PostMapping("/updateVital")
	public int updateVital(@RequestBody Map<String, String>body) {
		String hei 			= body.get("height");
		String wei 			= body.get("weight");
		String bmi 			= body.get("bmi");
		String bp 			= body.get("bp");
		String pr 			= body.get("pr");
		String rr 			= body.get("rr");
		String uod 			= body.get("uod");
		String uos 			= body.get("uos");
		String cod 			= body.get("cod");
		String cos 			= body.get("cos");
		String cv 			= body.get("cv");
		String hearing 		= body.get("hearing");
		String hosp 		= body.get("hosp");
		String opr 			= body.get("opr");
		String pm 			= body.get("pm");
		String smoker 		= body.get("smoker");
		String ad 			= body.get("ad");
		String lmp 			= body.get("lmp");
		String notes 		= body.get("notes");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		String vitalsID		= body.get("vitalsID");
		try {
			return vitalRepository.updateVital(hei, wei, bmi, bp, pr, rr, uod, uos,
					cod, cos, cv, hearing, hosp, opr, pm, smoker, ad, lmp, notes, cdate, udate, vitalsID);
		}catch(DataIntegrityViolationException e) {
			return 0;
		}
	}
}