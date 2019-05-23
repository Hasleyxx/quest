package qis.Chemistry;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LabInChemRepository extends JpaRepository <LabIndustrialChem, Integer> {

@Transactional
@Modifying
@Query
(value  = " INSERT into lab_chemistry (PatientID,TransactionID,chemID,PathID, MedID, QualityID,"
		+ " FBS, FBScon, BUA, BUAcon, CREA, CREAcon, CHOL, CHOLcon, TRIG, TRIGcon, HDL, HDLcon,"
		+ " LDL, LDLcon, CH, VLDL, Na, K, Cl, ALT, AST, HB, ALP, PSA, RBS, RBScon, GGTP, LDH,"
		+ " Calcium, Amylase, Lipase, InPhos, Protein, Albumin, Globulin, Magnesium, OGTT1,"
		+ " OGTT1con, OGTT2, OGTT2con, OGCT, OGCTcon, CPKMB, CPKMM, totalCPK, IonCalcium, "
		+ " BILTotal, BILDirect, BILIndirect, AGRatio, CreationDate, DateUpdate, BUN, BUNcon)"
		+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, \n"  
		+ " ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, \n" 
		+ " ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, \n"  
		+ " ?26, ?27, ?28, ?29, ?30, ?31, ?32, ?33, \n"  
		+ " ?34, ?35, ?36, ?37, ?38, ?39, ?40, ?41, \n"  
		+ " ?42, ?43, ?44, ?45, ?46, ?47, ?48, ?49, \n"  
		+ " ?50, ?51, ?52, ?53, ?54, ?55, ?56, ?57, \n"  
		+ " ?58, ?59, ?60)",nativeQuery = true )
int chemistryadd(int pid, int transid, int chemid, int pathid, int medid, int qid, String fbs,
		String fbscon, String bua, String buacon, String crea, String creacon, String chol,
		String cholcon, String trig, String trigcon, String hdl, String hdlcon, String ldl,
		String ldlcon, String ch, String vldl, String na, String k, String cl, String alt,
		String ast, String hb, String alp, String psa, String rbs, String rbscon, String ggtp,
		String ldh, String calcium, String amylase, String lipase, String inphos, String protein,
		String albumin, String glubolin, String magnesium, String ogtt1, String ogtt1con,
		String ogtt2, String ogtt2con, String ogct, String ogctcon, String cpkmb, String cpkmm,
		String stotalcpk, String ioncalcium, String biltotal, String bildirect, String bilindirect,
		String agratio, String creationdate, String dateupdate, String bun, String buncon);

@Transactional
@Modifying
@Query
 (value = " UPDATE lab_chemistry SET PatientID = ?1, TransactionID = ?2, PathID = ?4, MedID = ?5,"
		+ " QualityID = ?6, FBS = ?7, FBScon = ?8, BUA = ?9, BUAcon = ?10, CREA = ?11,"
		+ " CREAcon = ?12, CHOL = ?13, CHOLcon = ?14, TRIG = ?15, TRIGcon = ?16, HDL = ?17,"
		+ " HDLcon = ?18, LDL = ?19, LDLcon = ?20, CH = ?21, VLDL = ?22, Na = ?23, K = ?24,"
		+ " Cl = ?25, ALT = ?26, AST = ?27, HB = ?28, ALP = ?29, PSA = ?30, RBS = ?31, RBScon = ?32,"
		+ " GGTP = ?33, LDH = ?34, Calcium = ?35, Amylase = ?36, Lipase = ?37, InPhos = ?38,"
		+ " Protein = ?39, Albumin = ?40, Globulin = ?41, Magnesium = ?42, OGTT1 = ?43,"
		+ " OGTT1con = ?44, OGTT2 = ?45, OGTT2con = ?46, OGCT = ?47, OGCTcon = ?48, CPKMB = ?49,"
		+ " CPKMM = ?50, totalCPK = ?51, IonCalcium = ?52, BILTotal = ?53, BILDirect = ?54,"
		+ " BILIndirect = ?55, AGRatio = ?56, CreationDate = ?57, DateUpdate = ?58, BUN = ?59,"
		+ " BUNcon = ?60 WHERE chemID = ?3 ",nativeQuery = true )
int chemistryupdate(int pid, int transid, int chemid, int pathid, int medid, int qid, String fbs,
		String fbscon, String bua, String buacon, String crea, String creacon, String chol,
		String cholcon, String trig, String trigcon, String hdl, String hdlcon, String ldl, 
		String ldlcon, String ch, String vldl, String na, String k, String cl, String alt,
		String ast, String hb, String alp, String psa, String rbs, String rbscon, String ggtp,
		String ldh, String calcium, String amylase, String lipase, String inphos, String protein,
	    String albumin, String glubolin, String magnesium, String ogtt1, String ogtt1con,
	    String ogtt2, String ogtt2con, String ogct, String ogctcon, String cpkmb, String cpkmm,
	    String stotalcpk, String ioncalcium, String biltotal, String bildirect, String bilindirect,
	    String agratio, String creationdate, String dateupdate, String bun, String buncon);

}
