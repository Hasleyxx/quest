package qis.ClinicalMicroscopy;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClinicalMicroscopyController {
	@Autowired
	LabMicroRepository LabMicroRepository;
	
	@GetMapping("/labmicroscopy/{id}")
	public  @ResponseBody List<LabMicroscopy> Microscopy(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabMicroRepository.getmirco(pid);
    }
	
	@PostMapping("/labmicroscopyadd")
    public int LabMicroscopyADD(@RequestBody Map<String, String> body){  
		
		int qid 			= Integer.parseInt(body.get("qualityID"));
		int medid 			= Integer.parseInt(body.get("medID"));
		int pathid 			= Integer.parseInt(body.get("pathID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		
		String fcolor 			= body.get("fecColor");
		String fcon 			= body.get("fecCon");
		String fmicro 			= body.get("fecMicro");
		String fot	 			= body.get("fecOt");
		String ucolor 			= body.get("uriColor");
		String utrans 			= body.get("uriTrans");
		String uph	 			= body.get("uriPh");
		String usp 				= body.get("uriSp");
		String upro 			= body.get("uriPro");
		String uglu 			= body.get("uriGlu");
		String rbc	 			= body.get("rbc");
		String wbc	 			= body.get("wbc");
		String bac	 			= body.get("bac");
		String mthreads 		= body.get("mthreads");
		String ecells 			= body.get("ecells");
		String amorph 			= body.get("amorph");
		String coax 			= body.get("coAx");
		String uot	 			= body.get("occultBLD");
		String le 				= body.get("le");
		String nit	 			= body.get("nit");
		String uro	 			= body.get("uro");
		String bld 				= body.get("bld");
		String ket	 			= body.get("ket");
		String bil	 			= body.get("bil");
		String ptest 			= body.get("pregTest");
		String a1 				= body.get("afbva1");
		String a2 				= body.get("afbva2");
		String af1	 			= body.get("afbr1");
		String af2	 			= body.get("afbr2");
		String afbd 			= body.get("afbd");
		String obld 			= body.get("occultBLD");
		String cdate 			= body.get("creationDate");
		String dupdate 			= body.get("dateUpdate");
	   
	    return LabMicroRepository.addmicroscopy(trans, pid, fcolor, fcon, fmicro, fot, ucolor,
				utrans, uph, usp, upro, uglu, rbc, wbc, bac, mthreads, ecells, amorph, coax, uot,
				le, nit, uro, bld, ket, bil, ptest, a1, a2, af1, af2, afbd, obld, pathid, medid,
				qid, cdate, dupdate);		
	    
	}
	
	@PostMapping("/labmicroscopyupdate")
    public int LabMicroscopyUPDATE(@RequestBody Map<String, String> body){
		
		int qid 			= Integer.parseInt(body.get("qualityID"));
		int medid 			= Integer.parseInt(body.get("medID"));
		int pathid 			= Integer.parseInt(body.get("pathID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		
		String fcolor 			= body.get("fecColor");
		String fcon 			= body.get("fecCon");
		String fmicro 			= body.get("fecMicro");
		String fot	 			= body.get("fecOt");
		String ucolor 			= body.get("uriColor");
		String utrans 			= body.get("uriTrans");
		String uph	 			= body.get("uriPh");
		String usp	 			= body.get("uriSp");
		String upro				= body.get("uriPro");
		String uglu 			= body.get("uriGlu");
		String rbc	 			= body.get("rbc");
		String wbc	 			= body.get("wbc");
		String bac	 			= body.get("bac");
		String mthreads 		= body.get("mthreads");
		String ecells 			= body.get("ecells");
		String amorph 			= body.get("amorph");
		String coax 			= body.get("coAx");
		String uot	 			= body.get("occultBLD");
		String le 				= body.get("le");
		String nit	 			= body.get("nit");
		String uro	 			= body.get("uro");
		String bld	 			= body.get("bld");
		String ket	 			= body.get("ket");
		String bil	 			= body.get("bil");
		String ptest 			= body.get("pregTest");
		String a1 				= body.get("afbva1");
		String a2 				= body.get("afbva2");
		String af1	 			= body.get("afbr1");
		String af2	 			= body.get("afbr2");
		String afbd 			= body.get("afbd");
		String obld 			= body.get("occultBLD");
		String cdate 			= body.get("creationDate");
	    String dupdate	 		= body.get("dateUpdate");
	    
		return LabMicroRepository.updatemicroscopy(trans, pid, fcolor, fcon, fmicro, fot, ucolor,
				utrans, uph, usp, upro, uglu, rbc, wbc, bac, mthreads, ecells, amorph, coax, uot,
				le, nit, uro, bld, ket, bil, ptest, a1, a2, af1, af2, afbd, obld, pathid, medid,
				qid, cdate, dupdate);			
	
	}

}
