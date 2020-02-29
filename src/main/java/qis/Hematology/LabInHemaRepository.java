package qis.Hematology;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LabInHemaRepository extends JpaRepository <LabIndustrialHema, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE lab_hematology SET TransactionID  = ?1, PatientID = ?2,WhiteBlood = ?3,"
			+ " Hemoglobin = ?4, HemoNR = ?5, Hematocrit = ?6, HemaNR = ?7, Neutrophils = ?8,"
			+ " Lymphocytes = ?9, Monocytes = ?10, CBCOt = ?11, EOS = ?12, BAS = ?13, CBCRBC = ?14,"
			+ " PLT = ?15, PTime = ?16, PTControl = ?17, ActPercent = ?18, INR = ?19, PR131 = ?20,"
			+ " APTTime= ?21, APTControl= ?22, PTimeNV = ?23, PTControlNV = ?24, ActPercentNV= ?25,"
			+ " INRNV = ?26, APTTimeNV = ?27, APTControlNV = ?28, MS = ?29, ESR = ?30, ESRMethod = ?31,"
			+ " PathID = ?32, MedID= ?33, QualityID = ?34 , CreationDate = ?35, DateUpdate = ?36, "
			+ " bloodType = ?37, rh = ?38, clottingTime = ?39, bleedingTime = ?40, userID = ?42"
			+ " where hemaID = ?41", nativeQuery = true)
	int updateHemaRepo(int trans, int pid, String wb, String hemog, String hemo, String tocrit,
			String hema, String neutro, String lympho, String mono, String cbcot, String eos,
			String bas,String cbcrbc, String plt, String ptime, String ptcontrol, String apercent,
			String inr, String pr131, String aptt, String aptc, String ptnv, String ptcnv,
			String apttnv, String apnv, String inrnv, String aptcnv, String ms, String esr,
			String esrmethod, int pathid, int medid, int qid, String cdate, String dupdate, String bloodType,
			String rh, String ct, String bleedTime, int hemaID, int userID);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO lab_hematology (TransactionID, PatientID, WhiteBlood, Hemoglobin,"
			+ " HemoNR, Hematocrit, HemaNR, Neutrophils, Lymphocytes, Monocytes, CBCOt, EOS, BAS,"
			+ " CBCRBC, PLT, PTime, PTControl, ActPercent, INR, PR131, APTTime, APTControl, PTimeNV,"
			+ " PTControlNV, ActPercentNV, INRNV, APTTimeNV, APTControlNV, MS, ESR, ESRMethod, PathID,"
			+ " MedID, QualityID, patientIdRef, userID, CreationDate, DateUpdate, bloodType, rh, clottingTime, bleedingTime)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17,"
			+ " ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31, ?32,"
			+ " ?33, ?34, ?35, ?36,?37,?38,?39, ?40, ?41, ?42 )", nativeQuery = true)
	
	
	int addHemaRepo(int trans, int pid, String wb, String hemog, String hemo, String tocrit,
			String hema, String neutro, String lympho, String mono, String cbcot, String eos,
			String bas,String cbcrbc, String plt, String ptime, String ptcontrol, String apercent,
			String inr, String pr131, String aptt, String aptc, String ptnv, String ptcnv,
			String apttnv, String apnv, String inrnv, String aptcnv, String ms, String esr,
			String esrmethod, int pathid, int medid, int qid, String patientIdRef, int userID, String cdate, String dupdate,
			String bloodType, String rh, String ct, String bleedTime);

	
	@Query(value = " SELECT * FROM qpd_trans t, qpd_patient p, lab_hematology h "
			+ " WHERE t.TransactionID = h.TransactionID and p.PatientID = h.PatientID "
			+ " and h.TransactionID = ?1 " , nativeQuery = true)
	List<LabIndustrialHema> gethema(int id);
	
	@Query(value = " SELECT * from lab_hematology", nativeQuery = true)
	List<LabIndustrialHema> gethema();
	
	
	
	
}
