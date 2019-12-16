package qis.DoctorPE;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import qis.DoctorPE.DoctorPe;

public interface DoctorPeRepository extends JpaRepository <DoctorPe, Integer>  {

	@Query(value = " SELECT * FROM doc_pe", nativeQuery = true)
	List<DoctorPe> docPe();

	@Query(value =" SELECT * FROM doc_pe WHERE dataRef=?1", nativeQuery = true)
	DoctorPe getDocPe(String dataRef);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_pe (patientID, dataRef, bp, hr, hn, cl, cardiac, abd, ext, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	int addDocPe(int pid, String dataRef, String bp, String hr, String hn, String cl, String cardiac, String abd, String ext, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_pe SET dataRef=?1, bp=?2, hr=?3, hn=?4, cl=?5, cardiac=?6, abd=?7, ext=?8, "
			+ " dateCreated=?9 WHERE docPatientID=?10", nativeQuery = true)
	int updateDocPe(String dataRef, String bp, String hr, String hn, String cl, String cardiac, String abd, String ext, String dateCreated,
			int dpid);
	
	
	
	
	
	
	
	
	
	
}
