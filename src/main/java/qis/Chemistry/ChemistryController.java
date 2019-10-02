package qis.Chemistry;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChemistryController {
	@Autowired
	LabInChemRepository LabInChemRepository;
	@Autowired
	LabIndChemTabRepository LabIndChemTabRepository;
	
	 @GetMapping("/getChemistry/{sid}")
	    public List<LabIndustrialChem> getchem(@PathVariable String sid){
			int id = Integer.parseInt(sid);
	        return LabInChemRepository.getchem(id);
	    }
	 @GetMapping("/getChemistry")
	    public List<LabIndustrialChem> getchem(){
	        return LabInChemRepository.getchem();
	    }
	 @PostMapping("/addChem")	
		public LabIndustrialChem createchem(@RequestBody Map<String, String> body) {
			
			String stotalcpk       = body.get("totalCPK");
			String fbs             = body.get("fbs");
			String fbscon          = body.get("fbscon");
			String bua             = body.get("bua");
			String buacon          = body.get("buacon");
			String cl              = body.get("cl");
			String hb              = body.get("hb");
			String psa             = body.get("psa");
			String hdl             = body.get("hdl");
			String ldlcon          = body.get("ldlcon");
			String trig            = body.get("trig");
			String ch              = body.get("ch");
			String ldl             = body.get("ldl");
			String trigcon         = body.get("trigcon");
			String chol            = body.get("chol");
			String na              = body.get("na");
			String ast             = body.get("ast");
			String alt             = body.get("alt");
			String rbs             = body.get("rbs");
			String rbscon          = body.get("rbscon");
			String creacon         = body.get("creacon");
			String hdlcon          = body.get("hdlcon");
			String alp             = body.get("alp");
			String k               = body.get("k");
			String cholcon         = body.get("cholcon");
			String crea            = body.get("crea");
			String vldl            = body.get("vldl");
			String magnesium       = body.get("magnesium");
			String inphos          = body.get("inPhos");
			String ogtt2con        = body.get("ogtt2con");
			String cpkmb           = body.get("cpkmb");
			String glubolin        = body.get("globulin");
			String ldh             = body.get("ldh");
			String protein         = body.get("protein");
			String ogtt1con        = body.get("ogtt1con");
			String ogtt2           = body.get("ogtt2");
			String ogctcon         = body.get("ogctcon");
			String cpkmm           = body.get("cpkmm");
			String calcium         = body.get("calcium");
			String lipase          = body.get("lipase");
			String amylase         = body.get("amylase");
			String albumin         = body.get("albumin");
			String ggtp            = body.get("ggtp");
			String ogtt1           = body.get("ogtt1");
			String ogct            = body.get("ogct");
			String ioncalcium      = body.get("ionCalcium");
			String biltotal        = body.get("biltotal");
			String bildirect       = body.get("bildirect");
			String dateupdate      = body.get("dateUpdate");
			String creationdate    = body.get("creationDate");
			String agratio         = body.get("agratio");
			String bilindirect     = body.get("bilindirect");
			String bun			   = body.get("bun");
			String buncon		   = body.get("buncon");
			String chemNotes	   = body.get("chemNotes");

			int pid = 		Integer.parseInt(body.get("patientID")); 
			int transid =	Integer.parseInt(body.get("transactionID"));
			int chemid =	Integer.parseInt(body.get("chemID"));
			int pathid = 	Integer.parseInt(body.get("pathID"));
		    int medid =		Integer.parseInt(body.get("medID"));
			int qid	=		Integer.parseInt(body.get("qualityID"));

			
			try {
					return LabInChemRepository.save(new LabIndustrialChem(pid, transid, chemid,
					pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
					cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
					cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
					lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
					ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
					biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
					bun, buncon, chemNotes));
			}
			catch(Exception ex) {return null;}
		}
	 @PostMapping("/addChemistry")
	 public int chemistryadd(@RequestBody Map<String, String> body) {
	 	
	 	String stotalcpk       = body.get("totalCPK");
	 	String fbs             = body.get("fbs");
	 	String fbscon          = body.get("fbscon");
	 	String bua             = body.get("bua");
	 	String buacon          = body.get("buacon");
	 	String cl              = body.get("cl");
	 	String hb              = body.get("hb");
	 	String psa             = body.get("psa");
	 	String hdl             = body.get("hdl");
	 	String ldlcon          = body.get("ldlcon");
	 	String trig            = body.get("trig");
	 	String ch              = body.get("ch");
	 	String ldl             = body.get("ldl");
	 	String trigcon         = body.get("trigcon");
	 	String chol            = body.get("chol");
	 	String na              = body.get("na");
	 	String ast             = body.get("ast");
	 	String alt             = body.get("alt");
	 	String rbs             = body.get("rbs");
	 	String rbscon          = body.get("rbscon");
	 	String creacon         = body.get("creacon");
	 	String hdlcon          = body.get("hdlcon");
	 	String alp             = body.get("alp");
	 	String k               = body.get("k");
	 	String cholcon         = body.get("cholcon");
	 	String crea            = body.get("crea");
	 	String vldl            = body.get("vldl");
	 	String magnesium       = body.get("magnesium");
	 	String inphos          = body.get("inPhos");
	 	String ogtt2con        = body.get("ogtt2con");
	 	String cpkmb           = body.get("cpkmb");
	 	String glubolin        = body.get("globulin");
	 	String ldh             = body.get("ldh");
	 	String protein         = body.get("protein");
	 	String ogtt1con        = body.get("ogtt1con");
	 	String ogtt2           = body.get("ogtt2");
	 	String ogctcon         = body.get("ogctcon");
	 	String cpkmm           = body.get("cpkmm");
	 	String calcium         = body.get("calcium");
	 	String lipase          = body.get("lipase");
	 	String amylase         = body.get("amylase");
	 	String albumin         = body.get("albumin");
	 	String ggtp            = body.get("ggtp");
	 	String ogtt1           = body.get("ogtt1");
	 	String ogct            = body.get("ogct");
	 	String ioncalcium      = body.get("ionCalcium");
	 	String biltotal        = body.get("biltotal");
	 	String bildirect       = body.get("bildirect");
	 	String dateupdate      = body.get("dateUpdate");
	 	String creationdate    = body.get("creationDate");
	 	String agratio         = body.get("agratio");
	 	String bilindirect     = body.get("bilindirect");
	 	String bun			   = body.get("bun");
	 	String buncon		   = body.get("buncon");
	 	String chemNotes	   = body.get("chemNotes");

	 	int pid 			= Integer.parseInt(body.get("patientID")); 
	 	int transid 		= Integer.parseInt(body.get("transactionID"));
	 	int chemid 			= Integer.parseInt(body.get("chemID"));
	 	int pathid 			= Integer.parseInt(body.get("pathID"));
	    int medid 			= Integer.parseInt(body.get("medID"));
	 	int qid				= Integer.parseInt(body.get("qualityID"));
	 		try {
	 			return LabInChemRepository.chemistryadd(pid, transid, chemid,
	 			pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
	 			cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
	 			cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
	 			lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
	 			ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
	 			biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
	 			bun, buncon, chemNotes);
	 			}catch (DataIntegrityViolationException e) {
	 	    		return 0;
	 	    	}

	 }
	 @PatchMapping("/updateChemistry")
	 public int chemistryupdate(@RequestBody Map<String, String> body) {
	 	
	 	String stotalcpk       = body.get("totalCPK");
	 	String fbs             = body.get("fbs");
	 	String fbscon          = body.get("fbscon");
	 	String bua             = body.get("bua");
	 	String buacon          = body.get("buacon");
	 	String cl              = body.get("cl");
	 	String hb              = body.get("hb");
	 	String psa             = body.get("psa");
	 	String hdl             = body.get("hdl");
	 	String ldlcon          = body.get("ldlcon");
	 	String trig            = body.get("trig");
	 	String ch              = body.get("ch");
	 	String ldl             = body.get("ldl");
	 	String trigcon         = body.get("trigcon");
	 	String chol            = body.get("chol");
	 	String na              = body.get("na");
	 	String ast             = body.get("ast");
	 	String alt             = body.get("alt");
	 	String rbs             = body.get("rbs");
	 	String rbscon          = body.get("rbscon");
	 	String creacon         = body.get("creacon");
	 	String hdlcon          = body.get("hdlcon");
	 	String alp             = body.get("alp");
	 	String k               = body.get("k");
	 	String cholcon         = body.get("cholcon");
	 	String crea            = body.get("crea");
	 	String vldl            = body.get("vldl");
	 	String magnesium       = body.get("magnesium");
	 	String inphos          = body.get("inPhos");
	 	String ogtt2con        = body.get("ogtt2con");
	 	String cpkmb           = body.get("cpkmb");
	 	String glubolin        = body.get("globulin");
	 	String ldh             = body.get("ldh");
	 	String protein         = body.get("protein");
	 	String ogtt1con        = body.get("ogtt1con");
	 	String ogtt2           = body.get("ogtt2");
	 	String ogctcon         = body.get("ogctcon");
	 	String cpkmm           = body.get("cpkmm");
	 	String calcium         = body.get("calcium");
	 	String lipase          = body.get("lipase");
	 	String amylase         = body.get("amylase");
	 	String albumin         = body.get("albumin");
	 	String ggtp            = body.get("ggtp");
	 	String ogtt1           = body.get("ogtt1");
	 	String ogct            = body.get("ogct");
	 	String ioncalcium      = body.get("ionCalcium");
	 	String biltotal        = body.get("biltotal");
	 	String bildirect       = body.get("bildirect");
	 	String dateupdate      = body.get("dateUpdate");
	 	String creationdate    = body.get("creationDate");
	 	String agratio         = body.get("agratio");
	 	String bilindirect     = body.get("bilindirect");
	 	String bun			   = body.get("bun");
	 	String buncon		   = body.get("buncon");
	 	String chemNotes	   = body.get("chemNotes");

	 	int pid 			= Integer.parseInt(body.get("patientID")); 
	 	int transid 		= Integer.parseInt(body.get("transactionID"));
	 	int chemid 			= Integer.parseInt(body.get("chemID"));
	 	int pathid 			= Integer.parseInt(body.get("pathID"));
	    int medid 			= Integer.parseInt(body.get("medID"));
	 	int qid				= Integer.parseInt(body.get("qualityID"));
	 		try {
	 			return LabInChemRepository.chemistryupdate(pid, transid, chemid,
	 			pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
	 			cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
	 			cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
	 			lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
	 			ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
	 			biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
	 			bun, buncon, chemNotes);
	 			}catch (DataIntegrityViolationException e) {
	 				return 0;
	 			}

	 }
}
