package com.lab.industrial;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.quest.tables.LabMicroscopy;

public interface LabMicroRepository extends JpaRepository <LabMicroscopy, Integer> {
	@Transactional
	@Modifying
	@Query(value = " UPDATE lab_microscopy SET TransactionID  = ?1, PatientID = ?2, FecColor = ?3,"
			+ " FecCon = ?4, FecMicro = ?5, FecOt = ?6, UriColor = ?7, UriTrans = ?8,"
			+ " UriPh = ?9, UriSp = ?10, UriPro = ?11, UriGLu = ?12, RBC = ?13, WBC = ?14, BAC = ?15,"
			+ " MThreads = ?16, ECells = ?17, Amorph = ?18, CoAx = ?19, UriOt = ?20, LE = ?21,"
			+ " NIT = ?22, URO = ?23, BLD = ?24, KET = ?25, BIL = ?26, PregTest = ?27, AFBVA1 = ?28,"
			+ " AFBVA2 = ?29, AFBR1 = ?30, AFBR2 = ?31, AFBD = ?32, OccultBLD = ?33, PathID = ?34,"
			+ " MedID = ?35, QualityID = ?36 , CreationDate = ?37, DateUpdate = ?38 "
			+ " where microID = 874", nativeQuery = true)
	int updatemicroscopy(int trans, int pid, String fcolor, String fcon, String fmicro, String fot,
			String ucolor, String utrans, String uph, String usp, String upro, String uglu,
			String rbc, String wbc, String bac, String mthreads, String ecells, String amorph,
			String coax, String uot, String le, String nit, String uro, String bld, String ket,
			String bil, String ptest, String a1, String a2, String af1, String af2, String afbd,
			String obld, int pathid, int medid, int qid, String cdate, String dupdate);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO lab_microscopy (TransactionID, PatientID, FecColor, FecCon, FecMicro,"
			+ " FecOt, UriColor, UriTrans, UriPh, UriSp, UriPro, UriGlu , RBC, WBC, BAC, MThreads,"
			+ " ECells, Amorph, CoAx, UriOt, LE, NIT, URO, BLD, KET, BIL, PregTest, AFBVA1, AFBVA2,"
			+ " AFBR1, AFBR2, AFBD, OccultBLD, PathID, MedID, QualityID, CreationDate, DateUpdate)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16,"
			+ " ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31, ?32,"
			+ " ?33, ?34, ?35, ?36, ?37, ?38 )", nativeQuery = true)
	int addmicroscopy(int trans, int pid, String fcolor, String fcon, String fmicro, String fot,
			String ucolor, String utrans, String uph, String usp, String upro, String uglu,
			String rbc, String wbc, String bac, String mthreads, String ecells, String amorph,
			String coax, String uot, String le, String nit, String uro, String bld, String ket,
			String bil, String ptest, String a1, String a2, String af1, String af2, String afbd,
			String obld, int pathid, int medid, int qid, String cdate, String dupdate);
	
	@Query(value = " SELECT * FROM qpd_trans t, qpd_patient p, lab_microscopy m "
			+ " WHERE t.TransactionID= m.TransactionID and p.PatientID = m.PatientID"
			+ " and m.TransactionID = ?1" , nativeQuery = true)
	List<LabMicroscopy> getmirco(int id);
	
	
}
