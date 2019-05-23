package qis.Toxicology;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ToxicologyController {
	@Autowired
	LabInToxicologyRepository LabInToxicologyRepository;
	@Autowired
	LabIndToxTabRepository LabIndToxTabRepository;
	@GetMapping("/sertoxtable")
    public List<LabIndToxTable> sertoxtable() {
	        return LabIndToxTabRepository.sertoxtable();
	}
   
    @GetMapping("/toxicologyview/{id}")
    public  @ResponseBody List<LabIndustrialToxicology> toxicologyview(@PathVariable String id){
    	int pid = Integer.parseInt(id);
        return LabInToxicologyRepository.toxicologyview(pid);   
    }
    @PostMapping("/toxicologyadd")
    public int toxicologyadd(@RequestBody Map<String, String> body) {
    	
    	String stoxicid	       = body.get("toxicID");
    	String meth            = body.get("meth");
    	String tetra           = body.get("tetra");
    	String drugtest        = body.get("drugtest");
    	String creationdate    = body.get("creationDate");
    	String dateupdate      = body.get("dateUpdate");
    	
    	int toxicid    = 	Integer.parseInt(stoxicid); 
    	int transid    =	Integer.parseInt(body.get("transactionID"));
    	int pid        =	Integer.parseInt(body.get("patientID"));
    	int pathid     = 	Integer.parseInt(body.get("pathID"));
        int medid      =	Integer.parseInt(body.get("medID"));
    	int qualityid  =	Integer.parseInt(body.get("qualityID"));

       return LabInToxicologyRepository.toxicologyadd(transid, pid, meth, tetra, drugtest,
    		   pathid, medid, qualityid, creationdate, dateupdate);

    }
    @PatchMapping("/toxicologyupdate")
    public int toxicologyupdate(@RequestBody Map<String, String> body) {
    	
    	String stoxicid	       = body.get("toxicID");
    	String meth            = body.get("meth");
    	String tetra           = body.get("tetra");
    	String drugtest        = body.get("drugtest");
    	String creationdate    = body.get("creationDate");
    	String dateupdate      = body.get("dateUpdate");
    	
    	int toxicid    = 	Integer.parseInt(stoxicid); 
    	int transid    =	Integer.parseInt(body.get("transactionID"));
    	int pid        =	Integer.parseInt(body.get("patientID"));
    	int pathid     = 	Integer.parseInt(body.get("pathID"));
        int medid      =	Integer.parseInt(body.get("medID"));
    	int qualityid  =	Integer.parseInt(body.get("qualityID"));


    	return LabInToxicologyRepository.toxicologyupdate(toxicid, transid, pid, meth,
    				tetra, drugtest, pathid, medid, qualityid, creationdate, dateupdate);
    }


}
