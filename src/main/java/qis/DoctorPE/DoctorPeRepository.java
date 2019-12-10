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
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_pe (patientID, bp, hr, hn, cl, cardiac, abd, ext, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
	int addDocPe(int pid, String bp, String hr, String hn, String cl, String cardiac, String abd, String ext, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_pe SET bp=?1, hr=?2, hn=?3, cl=?4, cardiac=?5, abd=?6, ext=?7, "
			+ " dateCreated=?8 WHERE docPatientID=?9", nativeQuery = true)
	int updateDocPe( String bp, String hr, String hn, String cl, String cardiac, String abd, String ext, String dateCreated,
			int dpid);
	
	
	
	
	
	
	
	
	
	
}
