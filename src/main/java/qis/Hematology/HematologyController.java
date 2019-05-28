package qis.Hematology;

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
public class HematologyController {
	@Autowired
	LabHemaRepository LabHemaRepository;
	@Autowired
	LabInHemaRepository LabInHemaRepository;
	
	@GetMapping("/getHemat/{id}")
	public  @ResponseBody List<LabIndustrialHema> LabHemaView(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabInHemaRepository.gethema(pid);
    }
	
	@GetMapping("/getHema")
	public @ResponseBody List<LabHema> LabHema() {
		return LabHemaRepository.gethema();
	}
	@PostMapping("/addIndustrial")
    public int LabIndustrialADD(@RequestBody Map<String, String> body){  
		int qid 			= Integer.parseInt(body.get("qualityID"));
		int medid 			= Integer.parseInt(body.get("medID"));
		int pathid 			= Integer.parseInt(body.get("pathID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		
		String wb 				= body.get("whiteBlood");
		String hemog 			= body.get("hemoglobin");
		String hemo 			= body.get("hemoNR");
		String tocrit 			= body.get("hematocrit");
		String hema 			= body.get("hemaNR");
		String neutro 			= body.get("neutrophils");
		String lympho 			= body.get("lymphocytes");
		String mono 			= body.get("monocytes");
		String cbcot 			= body.get("cbcot");
		String eos 				= body.get("eos");
		String bas 				= body.get("bas");
		String cbcrbc 			= body.get("cbcrbc");
		String plt 				= body.get("plt");
		String ptime 			= body.get("ptime");
		String ptcontrol		= body.get("ptcontrol");
		String apercent 		= body.get("actPercent");
		String inr 				= body.get("inr");
		String pr131 			= body.get("pr131");
		String aptt 			= body.get("apttime");
		String aptc 			= body.get("aptcontrol");
		String ptnv 			= body.get("ptimeNV");
		String ptcnv 			= body.get("ptcontrolNV");
		String apnv 			= body.get("actPercentNV");
		String inrnv 			= body.get("inrnv");
		String apttnv 			= body.get("apttimeNV");
		String aptcnv 			= body.get("aptcontrolNV");
		String ms 				= body.get("ms");
		String esr	 			= body.get("esr");
		String esrmethod 		= body.get("esrmethod");
		String cdate 			= body.get("creationDate");
	    String dupdate 			= body.get("dateUpdate");
	    try {
	    	return LabInHemaRepository.addHemaRepo(trans, pid, wb,hemog, hemo, tocrit, hema, neutro,
	    		lympho, mono, cbcot, eos, bas, cbcrbc, plt, ptime, ptcontrol, apercent, inr, pr131,
	    		aptt, aptc, ptnv, ptcnv, apttnv, apnv, inrnv, aptcnv, ms, esr, esrmethod, pathid,
	    		medid, qid, cdate, dupdate);
	    }catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	@PostMapping("/updateIndustrial") 
    public int LabIndustrialUPDATE(@RequestBody Map<String, String> body){
		
		int qid 			= Integer.parseInt(body.get("qualityID"));
		int medid 			= Integer.parseInt(body.get("medID"));
		int pathid 			= Integer.parseInt(body.get("pathID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		
		String wb 				= body.get("whiteBlood");
		String hemog 			= body.get("hemoglobin");
		String hemo 			= body.get("hemoNR");
		String tocrit 			= body.get("hematocrit");
		String hema 			= body.get("hemaNR");
		String neutro 			= body.get("neutrophils");
		String lympho 			= body.get("lymphocytes");
		String mono 			= body.get("monocytes");
		String cbcot 			= body.get("cbcot");
		String eos	 			= body.get("eos");
		String bas  			= body.get("bas");
		String cbcrbc 			= body.get("cbcrbc");
		String plt	 			= body.get("plt");
		String ptime 			= body.get("ptime");
		String ptcontrol 		= body.get("ptcontrol");
		String apercent 		= body.get("actPercent");
		String inr	 			= body.get("inr");
		String pr131 			= body.get("pr131");
		String aptt 			= body.get("apttime");
		String aptc 			= body.get("aptcontrol");
		String ptnv 			= body.get("ptimeNV");
		String ptcnv 			= body.get("ptcontrolNV");
		String apnv 			= body.get("actPercentNV");
		String inrnv 			= body.get("inrnv");
		String apttnv 			= body.get("apttimeNV");
		String aptcnv 			= body.get("aptcontrolNV");
		String ms 				= body.get("ms");
		String esr	 			= body.get("esr");
		String esrmethod		= body.get("esrmethod");
		String cdate 			= body.get("creationDate");
	    String dupdate	 		= body.get("dateUpdate");
	    try {
	    	return LabInHemaRepository.updateHemaRepo(trans, pid, wb, hemog, hemo, tocrit, hema,
	    			neutro, lympho, mono, cbcot, eos, bas, cbcrbc, plt, ptime, ptcontrol, apercent,
	    			inr, pr131, aptt, aptc, ptnv, ptcnv, apttnv, apnv, inrnv, aptcnv, ms, esr,
	    			esrmethod, pathid, medid, qid, cdate, dupdate);
	    }catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
}
