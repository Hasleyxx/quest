package qis.Serology;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerologyController {
	@Autowired
	LabInSerologyRepository LabInSerologyRepository;
	
	@GetMapping("/getSerology/{id}")
    public  @ResponseBody List<LabIndustrialSerology> serologyview(@PathVariable String id){
    	int pid = Integer.parseInt(id);
        return LabInSerologyRepository.serologyview(pid);   
    }
	
	@PostMapping("/addSerology")
	public int serologyadd(@RequestBody Map<String, String> body) {
		
		String hbsag           = body.get("hbsAG");
		String antihav         = body.get("antiHav");
		String seroot          = body.get("seroOt");
		String vdrl            = body.get("vdrl");
		String psanti          = body.get("psanti");
		String antihbs         = body.get("antiHBS");	
		String hbeag           = body.get("hbeAG");	
		String antihbe         = body.get("antiHBE");
		String antihbc         = body.get("antiHBC");
		String tydotigm        = body.get("tydotigM");
		String tydotigg        = body.get("tydotigG");
		String cea    	       = body.get("cea");
		String afp             = body.get("afp");
		String ca125           = body.get("ca125");
		String ca19            = body.get("ca19");
		String ca15            = body.get("ca15");
		String tsh             = body.get("tsh");
		String ft3        	   = body.get("ft3");
		String ft4             = body.get("ft4");
		String crpdil          = body.get("crpdil");
		String crpres          = body.get("crpres");
		String hiv1            = body.get("hiv1");
		String hiv2            = body.get("hiv2");	
		String creationdate    = body.get("creationDate");
		String dateupdate      = body.get("dateUpdate");
		
		//int seroid     = 	Integer.parseInt(body.get("seroID")); 
		int transid    =	Integer.parseInt(body.get("transactionID"));
		int pid        =	Integer.parseInt(body.get("patientID"));
		int pathid     = 	Integer.parseInt(body.get("pathID"));
	    int medid      =	Integer.parseInt(body.get("medID"));
		int qualityid  =	Integer.parseInt(body.get("qualityID"));
		try {
			return LabInSerologyRepository.Serologyadd(transid, pid, hbsag, antihav, seroot,
				vdrl, psanti , antihbs , hbeag, antihbe , antihbc, tydotigm, tydotigg, 
				cea, afp, ca125, ca19, ca15, tsh, ft3, ft4, crpdil, crpres, hiv1, hiv2,
				pathid, medid, qualityid, creationdate, dateupdate);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}

	}
	@PostMapping("/updateSerology")
	public int serologyupdate(@RequestBody Map<String, String> body) {
		
		String hbsag           = body.get("hbsAG");
		String antihav         = body.get("antiHav");
		String seroot          = body.get("seroOt");
		String vdrl            = body.get("vdrl");
		String psanti          = body.get("psanti");
		String antihbs         = body.get("antiHBS");	
		String hbeag           = body.get("hbeAG");	
		String antihbe         = body.get("antiHBE");
		String antihbc         = body.get("antiHBC");
		String tydotigm        = body.get("tydotigM");
		String tydotigg        = body.get("tydotigG");
		String cea    	       = body.get("cea");
		String afp             = body.get("afp");
		String ca125           = body.get("ca125");
		String ca19            = body.get("ca19");
		String ca15            = body.get("ca15");
		String tsh             = body.get("tsh");
		String ft3        	   = body.get("ft3");
		String ft4             = body.get("ft4");
		String crpdil          = body.get("crpdil");
		String crpres          = body.get("crpres");
		String hiv1            = body.get("hiv1");
		String hiv2            = body.get("hiv2");
		String creationdate    = body.get("creationDate");
		String dateupdate      = body.get("dateUpdate");
		
		int seroid     = 	Integer.parseInt(body.get("seroID")); 
		int transid    =	Integer.parseInt(body.get("transactionID"));
		int pid        =	Integer.parseInt(body.get("patientID"));
		int pathid     = 	Integer.parseInt(body.get("pathID"));
	    int medid      =	Integer.parseInt(body.get("medID"));
		int qualityid  =	Integer.parseInt(body.get("qualityID"));
		try {
			return LabInSerologyRepository.Serologyupdate(transid, pid, hbsag, antihav, seroot,
					vdrl, psanti , antihbs , hbeag, antihbe , antihbc, tydotigm, tydotigg, cea, 
					afp, ca125, ca19, ca15, tsh, ft3, ft4, crpdil, crpres, hiv1, hiv2, pathid,
					medid, qualityid, creationdate, dateupdate, seroid);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
		}
}
