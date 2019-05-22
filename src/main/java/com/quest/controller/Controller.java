package com.quest.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.quest.tables.LabIndustrial;
import com.quest.tables.LabIndustrial1;
import com.quest.tables.LabIndustrialChem;
import com.quest.tables.LabIndustrialHema;
import com.quest.tables.LabIndustrialSerology;
import com.quest.tables.LabIndustrialToxicology;
import com.quest.tables.LabMicroscopy;
import com.quest.tables.LabPersonnel;
import com.quest.tables.Transaction;
import qis.Cashier.CashierPatientRepository;
import qis.Cashier.CashierRepository;
import qis.Company.CompanyRepository;
import qis.Items.ItemsRepository;
import qis.Transaction.TransactionRepository;
import com.lab.industrial.Industrial1Repository;
import com.lab.industrial.IndustrialForTableRepository;
import com.lab.industrial.IndustrialRepository;
import com.lab.industrial.LabHemaRepository;
import com.lab.industrial.LabInChemRepository;
import com.lab.industrial.LabInHemaRepository;
import com.lab.industrial.LabInSerologyRepository;
import com.lab.industrial.LabInToxicologyRepository;
import com.lab.industrial.LabIndChemTabRepository;
import com.lab.industrial.LabIndToxTabRepository;
import com.lab.industrial.LabMicroRepository;
import com.lab.industrial.LabPersonnelRepository;
import com.quest.tables.Cashier;
import com.quest.tables.Items;
import com.quest.tables.LabHema;
import com.quest.tables.LabInForTable;
import com.quest.tables.LabIndChemTable;
import com.quest.tables.LabIndToxTable;
import com.quest.tables.Cashier1;

@EntityScan("com.quest.tables")
@RestController
public class Controller {
	@Autowired
	CashierRepository cashierRespository;
	@Autowired
	CashierPatientRepository patientRepository;
	@Autowired
    ItemsRepository itemsRepository;
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	IndustrialRepository IrRespository;
	@Autowired
	Industrial1Repository IrRespository1;
	@Autowired
	LabInHemaRepository LabInHemaRepository;
	@Autowired
	LabMicroRepository LabMicroRepository;
	@Autowired
	LabPersonnelRepository LabPerRepository;
	@Autowired
	LabHemaRepository LabHemaRepository;
	@Autowired
	IndustrialForTableRepository FourTable;
	@Autowired
	LabInChemRepository LabInChemRepository;
	@Autowired
	LabInToxicologyRepository LabInToxicologyRepository;
	@Autowired
	LabIndChemTabRepository LabIndChemTabRepository;
	@Autowired
	LabIndToxTabRepository LabIndToxTabRepository;
	@Autowired
	LabInSerologyRepository LabInSerologyRepository;
	
	//********** GET MAPPING***********************
	@GetMapping("/Cash1")
    public  @ResponseBody List<Cashier1> ListPatient() {
        return patientRepository.findPatient();
	}
	@GetMapping("/industrial")
    public  @ResponseBody List<LabIndustrial> Industial() {
        return IrRespository.getinfo();
	}
	@GetMapping("/industrial1")
    public  @ResponseBody List<LabIndustrial1> Industial1() {
        return IrRespository1.getinfo();
	}
	@GetMapping("/labindustrialview/{id}")
    public  @ResponseBody List<LabInForTable> IndustialView(@PathVariable String id) {
        int pid = Integer.parseInt(id);
		return FourTable.gethinfo(pid);
	}
	
	@GetMapping("/labhemaview/{id}")
	public  @ResponseBody List<LabIndustrialHema> LabHemaView(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabInHemaRepository.gethema(pid);
    }
	
	@GetMapping("/labhema")
	public @ResponseBody List<LabHema> LabHema() {
		return LabHemaRepository.gethema();
	}
	
	@GetMapping("/labmicroscopy/{id}")
	public  @ResponseBody List<LabMicroscopy> Microscopy(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabMicroRepository.getmirco(pid);
    }
	@GetMapping("/labpersonnel/{id}")
	public  @ResponseBody List<LabPersonnel> LabPersonnel(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabPerRepository.getpersonnel(pid);
    }
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/TransactionList")
	public List<Cashier> findTransactionList() {
	    	return cashierRespository.findTransactionList();
	}
	    
	@GetMapping("/HMOList")
	public List<Cashier> findHMOList(){
	    	return cashierRespository.findHMOList();
	}
    @GetMapping("/sertoxtable")
    public List<LabIndToxTable> sertoxtable() {
	        return LabIndToxTabRepository.sertoxtable();
	}
    @GetMapping("/chemdetails/{sid}")
    public Optional<LabIndustrialChem> cheminfo(@PathVariable String sid){
		int id = Integer.parseInt(sid);
        return LabInChemRepository.findById(id);
    }
    @GetMapping("/toxicologyview/{id}")
    public  @ResponseBody List<LabIndustrialToxicology> toxicologyview(@PathVariable String id){
    	int pid = Integer.parseInt(id);
        return LabInToxicologyRepository.toxicologyview(pid);   
    }
    @GetMapping("/serologyview/{id}")
    public  @ResponseBody List<LabIndustrialSerology> serologyview(@PathVariable String id){
    	int pid = Integer.parseInt(id);
        return LabInSerologyRepository.serologyview(pid);   
    }
    @GetMapping("/chemtable")
    public List<LabIndChemTable> chemtable(){
        return LabIndChemTabRepository.chemtable();
    }
    @GetMapping("/AllItems")
    public List<Items> findAllItems(){
    	return itemsRepository.findAllItems();
    }
    
    @GetMapping("/AccountItems")
    public List<Items> findAllAccountItems(){
    	return itemsRepository.findAllAccountItems();
    }
    
    @GetMapping("/AccountItems/{id}")
    public List<Items> findAccountItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findAccountItemById(pID);
    }
    
    @GetMapping("/AllItems/{id}")
    public List<Items> findItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findItemById(pID);
    }
    
    @GetMapping("/Items/{type}")
    public List<Items> findItemByType(@PathVariable String type){
    	return itemsRepository.findItemByType(type);
    }
    
    @GetMapping("/NonAccountItems")
    public List<Items> findAllNonAccountItems()
    {
    	return itemsRepository.findAllNonAccountItems();
    	
    }
	//******************* POST MAPPING ADD ******************************
    @PostMapping("/TransactionList")
    public Transaction create(@RequestBody Map<String, String> body){
    	
	    	int patientId 					= Integer.parseInt(body.get("PatientID"));
	    	String transactionRef 			= body.get("TransactionRef");
	    	String transactionType 			= body.get("TransactionType");
	    	String biller 					= body.get("biller");
	    	String transactionDate 			= body.get("TransactionDate");
	    	int userId 						= Integer.parseInt(body.get("userID"));
	    	String totalPrice 				= body.get("TotalPrice");
	    	double paidIn 					= Double.parseDouble(body.get("PaidIn"));
	    	double paidOut 					= Double.parseDouble(body.get("PaidOut"));
	    	double grandTotal 				= Double.parseDouble(body.get("GrandTotal"));
	    	int status 						= Integer.parseInt(body.get("status"));
	    	String salesType 				= body.get("SalesType");
	    	String loe 						= body.get("LOE");
	    	String an 						= body.get("AN");
	    	String ac 						= body.get("AC");
	    	String notes					= body.get("Notes");
	   try {	
	    	return transactionRepository.save(new Transaction(patientId, transactionRef,
	    			transactionType, biller, transactionDate, userId, totalPrice, paidIn, 
	    			paidOut, grandTotal, status, salesType, loe, an, ac, notes));
    	}
    	catch(Exception ex) {return null;}
    }
	
	@PostMapping("/labmicroscopyadd")
    public int LabMicroscopyADD(@RequestBody Map<String, String> body){  
		
		String Spid 			= body.get("patientID");
		String transs 			= body.get("transactionID");
		String pathidc			= body.get("pathID");
		String medidc 			= body.get("medID");
		String qidc 			= body.get("qualityID");
		int pid 				= Integer.parseInt(Spid);
		int trans 				= Integer.parseInt(transs);
		int pathid 				= Integer.parseInt(pathidc);
		int medid 				= Integer.parseInt(medidc);
		int qid 				= Integer.parseInt(qidc);
		
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
	
	@PostMapping("/labindustrialadd1")
    public int LabIndustrialADD(@RequestBody Map<String, String> body){  
		
		String Spid 		= body.get("patientID");
		String transs 		= body.get("transactionID");
		String pathidc 		= body.get("pathID");
		String medidc 		= body.get("medID");
		String qidc 		= body.get("qualityID");
		int qid 			= Integer.parseInt(qidc);
		int medid 			= Integer.parseInt(medidc);
		int pathid 			= Integer.parseInt(pathidc);
		int pid 			= Integer.parseInt(Spid);
		int trans 			= Integer.parseInt(transs);
		
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
	    
	    return LabInHemaRepository.addHemaRepo(trans, pid, wb,hemog, hemo, tocrit, hema, neutro,
	    		lympho, mono, cbcot, eos, bas, cbcrbc, plt, ptime, ptcontrol, apercent, inr, pr131,
	    		aptt, aptc, ptnv, ptcnv, apttnv, apnv, inrnv, aptcnv, ms, esr, esrmethod, pathid,
	    		medid, qid, cdate, dupdate);
	}
	
	
	//***************** POST MAPPING UPDATE ***************************
	@PostMapping("/labmicroscopyupdate")
    public int LabMicroscopyUPDATE(@RequestBody Map<String, String> body){
		
		String Spid 		= body.get("patientID");
		String transs 		= body.get("transactionID");
		String pathidc 		= body.get("pathID");
		String medidc 		= body.get("medID");
		String qidc 		= body.get("qualityID");
		int pid 			= Integer.parseInt(Spid);
		int trans 			= Integer.parseInt(transs);
		int pathid 			= Integer.parseInt(pathidc);
		int medid 			= Integer.parseInt(medidc);
		int qid 			= Integer.parseInt(qidc);
		
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
	
	@PostMapping("/labindustrupdate") 
    public int LabIndustrialUPDATE(@RequestBody Map<String, String> body){
		
		String Spid 		= body.get("patientID");
		String transs 		= body.get("transactionID");
		String pathidc 		= body.get("pathID");
		String medidc 		= body.get("medID");
		String qidc 		= body.get("qualityID");
		int qid 			= Integer.parseInt(qidc);
		int medid 			= Integer.parseInt(medidc);
		int pathid 			= Integer.parseInt(pathidc);
		int pid 			= Integer.parseInt(Spid);
		int trans 			= Integer.parseInt(transs);
		
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
	    
		return LabInHemaRepository.updateHemaRepo(trans, pid, wb, hemog, hemo, tocrit, hema, neutro,
				lympho, mono, cbcot, eos, bas, cbcrbc, plt, ptime, ptcontrol, apercent, inr, pr131,
				aptt, aptc, ptnv, ptcnv, apttnv, apnv, inrnv, aptcnv, ms, esr, esrmethod, pathid,
				medid, qid, cdate, dupdate);
	}
	
	@PostMapping("/chemadd")
	public LabIndustrialChem createchem(@RequestBody Map<String, String> body) {
		
		String schemid	       = body.get("chemID");
		String stotalcpk       = body.get("totalCPK");
		String stransid        = body.get("transactionID");
		String spid            = body.get("patientID");
		String spathid         = body.get("pathID");
		String smedid          = body.get("medID");
		String sqid            = body.get("qualityID");
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

		int pid = 		Integer.parseInt(spid); 
		int transid =	Integer.parseInt(stransid);
		int chemid =	Integer.parseInt(schemid);
		int pathid = 	Integer.parseInt(spathid);
	    int medid =		Integer.parseInt(smedid);
		int qid	=		Integer.parseInt(sqid);

		
		try {
				return LabInChemRepository.save(new LabIndustrialChem(pid, transid, chemid,
				pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
				cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
				cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
				lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
				ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
				biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
				bun, buncon));
		}
		catch(Exception ex) {return null;}
	}

	
@PostMapping("/chemistryadd")
public int chemistryadd(@RequestBody Map<String, String> body) {
	
	String schemid	       = body.get("chemID");
	String stotalcpk       = body.get("totalCPK");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String sqid            = body.get("qualityID");
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

	int pid = 		Integer.parseInt(spid); 
	int transid =	Integer.parseInt(stransid);
	int chemid =	Integer.parseInt(schemid);
	int pathid = 	Integer.parseInt(spathid);
    int medid =		Integer.parseInt(smedid);
	int qid	=		Integer.parseInt(sqid);

			return LabInChemRepository.chemistryadd(pid, transid, chemid,
			pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
			cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
			cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
			lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
			ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
			biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
			bun, buncon);

}
@PatchMapping("/chemistryupdate")
public int chemistryupdate(@RequestBody Map<String, String> body) {
	
	String schemid	       = body.get("chemID");
	String stotalcpk       = body.get("totalCPK");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String sqid            = body.get("qualityID");
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

	int pid = 		Integer.parseInt(spid); 
	int transid =	Integer.parseInt(stransid);
	int chemid =	Integer.parseInt(schemid);
	int pathid = 	Integer.parseInt(spathid);
    int medid =		Integer.parseInt(smedid);
	int qid	=		Integer.parseInt(sqid);

			return LabInChemRepository.chemistryupdate(pid, transid, chemid,
			pathid, medid, qid, fbs, fbscon, bua, buacon, crea, creacon, chol,
			cholcon, trig, trigcon, hdl, hdlcon, ldl, ldlcon, ch, vldl, na, k,
			cl, alt, ast, hb, alp, psa, rbs, rbscon, ggtp, ldh, calcium, amylase,
			lipase, inphos, protein, albumin, glubolin, magnesium, ogtt1, ogtt1con,
			ogtt2, ogtt2con, ogct, ogctcon, cpkmb, cpkmm, stotalcpk, ioncalcium,
			biltotal, bildirect, bilindirect, agratio, creationdate, dateupdate,
			bun, buncon);

}

@PostMapping("/toxicologyadd")
public int toxicologyadd(@RequestBody Map<String, String> body) {
	
	String stoxicid	       = body.get("toxicID");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
	String meth            = body.get("meth");
	String tetra           = body.get("tetra");
	String drugtest        = body.get("drugtest");
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String squalityid      = body.get("qualityID");
	String creationdate    = body.get("creationDate");
	String dateupdate      = body.get("dateUpdate");
	
	int toxicid    = 	Integer.parseInt(stoxicid); 
	int transid    =	Integer.parseInt(stransid);
	int pid        =	Integer.parseInt(spid);
	int pathid     = 	Integer.parseInt(spathid);
    int medid      =	Integer.parseInt(smedid);
	int qualityid  =	Integer.parseInt(squalityid);

   return LabInToxicologyRepository.toxicologyadd(transid, pid, meth, tetra, drugtest,
		   pathid, medid, qualityid, creationdate, dateupdate);

}
@PatchMapping("/toxicologyupdate")
public int toxicologyupdate(@RequestBody Map<String, String> body) {
	
	String stoxicid	       = body.get("toxicID");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
	String meth            = body.get("meth");
	String tetra           = body.get("tetra");
	String drugtest        = body.get("drugtest");
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String squalityid      = body.get("qualityID");
	String creationdate    = body.get("creationDate");
	String dateupdate      = body.get("dateUpdate");
	
	int toxicid    = 	Integer.parseInt(stoxicid); 
	int transid    =	Integer.parseInt(stransid);
	int pid        =	Integer.parseInt(spid);
	int pathid     = 	Integer.parseInt(spathid);
    int medid      =	Integer.parseInt(smedid);
	int qualityid  =	Integer.parseInt(squalityid);

	return LabInToxicologyRepository.toxicologyupdate(toxicid, transid, pid, meth,
				tetra, drugtest, pathid, medid, qualityid, creationdate, dateupdate);
}




@PostMapping("/serologyadd")
public int serologyadd(@RequestBody Map<String, String> body) {
	
	String sseroid	       = body.get("seroID");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
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
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String squalityid      = body.get("qualityID");
	String creationdate    = body.get("creationDate");
	String dateupdate      = body.get("dateUpdate");
	
	int seroid     = 	Integer.parseInt(sseroid); 
	int transid    =	Integer.parseInt(stransid);
	int pid        =	Integer.parseInt(spid);
	int pathid     = 	Integer.parseInt(spathid);
    int medid      =	Integer.parseInt(smedid);
	int qualityid  =	Integer.parseInt(squalityid);

			return LabInSerologyRepository.Serologyadd(transid, pid, hbsag, antihav, seroot,
					vdrl, psanti , antihbs , hbeag, antihbe , antihbc, tydotigm, tydotigg, 
					cea, afp, ca125, ca19, ca15, tsh, ft3, ft4, crpdil, crpres, hiv1, hiv2,
					pathid, medid, qualityid, creationdate, dateupdate);

}

@PatchMapping("/serologyupdate")
public int serologyupdate(@RequestBody Map<String, String> body) {
	
	String sseroid	       = body.get("seroID");
	String stransid        = body.get("transactionID");
	String spid            = body.get("patientID");
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
	String spathid         = body.get("pathID");
	String smedid          = body.get("medID");
	String squalityid      = body.get("qualityID");
	String creationdate    = body.get("creationDate");
	String dateupdate      = body.get("dateUpdate");
	
	int seroid     = 	Integer.parseInt(sseroid); 
	int transid    =	Integer.parseInt(stransid);
	int pid        =	Integer.parseInt(spid);
	int pathid     = 	Integer.parseInt(spathid);
    int medid      =	Integer.parseInt(smedid);
	int qualityid  =	Integer.parseInt(squalityid);

	return LabInSerologyRepository.Serologyupdate(transid, pid, hbsag, antihav, seroot, vdrl, 
			psanti , antihbs , hbeag, antihbe , antihbc, tydotigm, tydotigg, cea, afp, ca125,
			ca19, ca15, tsh, ft3, ft4, crpdil, crpres, hiv1, hiv2, pathid, medid, qualityid,
			creationdate, dateupdate, seroid);
	}

@PostMapping("/addPatient")
public int AddPatient(@RequestBody Map<String, String>body){

	String pRef			 = body.get("patientRef");
	String pType		 = body.get("patientType");
	String com			 = body.get("companyName");
	String pos			 = body.get("position");
	String fn			 = body.get("firstName");
	String mn			 = body.get("middleName");
	String ln			 = body.get("lastName");
	String add			 = body.get("address");
	String bdate		 = body.get("birthdate");
	String email		 = body.get("email");
	String a			 = body.get("age");
	int age				 = Integer.parseInt(a);
	String gen			 = body.get("gender");
	String no			 = body.get("contactNo");
	String biller		 = body.get("patientBiller");
	String notes		 = body.get("notes");
	String sid			 = body.get("sid");
	String cdate		 = body.get("creationDate");
	String udate		 = body.get("dateUpdate");
	return patientRepository.addPatient(pRef, pType, com, pos, fn, mn, ln, add, bdate, email,
			age, gen, no, biller, notes, sid, cdate, udate);
}
@PostMapping("/updatePatient")
public int UpdatePatient(@RequestBody Map<String, String>body){

	String pRef			 = body.get("patientRef");
	String pType		 = body.get("patientType");
	String com			 = body.get("companyName");
	String pos			 = body.get("position");
	String fn			 = body.get("firstName");
	String mn			 = body.get("middleName");
	String ln			 = body.get("lastName");
	String add			 = body.get("address");
	String bdate		 = body.get("birthdate");
	String email		 = body.get("email");
	String a			 = body.get("age");
	int age				 = Integer.parseInt(a);
	String gen			 = body.get("gender");
	String no			 = body.get("contactNo");
	String biller		 = body.get("patientBiller");
	String notes		 = body.get("notes");
	String sid			 = body.get("sid");
	String cdate		 = body.get("creationDate");
	String udate		 = body.get("dateUpdate");
	return patientRepository.updatePatient(pRef, pType, com, pos, fn, mn, ln, add, bdate, email,
			age, gen, no, biller, notes, sid, cdate, udate);
}

@PostMapping("/addCompany")
public int AddCompany(@RequestBody Map<String, String>body){
	String cname		= body.get("nameCompany");
	String cadd			= body.get("companyAddress");
	return companyRepository.addCompany(cname, cadd);
}
@PostMapping("/updateCompany")
public int UpdateCompany(@RequestBody Map<String, String>body){
	String cname		= body.get("nameCompany");
	String cadd			= body.get("companyAddress");
	return companyRepository.updateCompany(cname, cadd);
}	
}
