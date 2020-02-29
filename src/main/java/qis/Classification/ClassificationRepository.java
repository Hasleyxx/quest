package qis.Classification;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface ClassificationRepository extends JpaRepository<Classification, Integer> {
	@Query(value = "SELECT * from qpd_class", nativeQuery = true)
	List<Classification> getclass();
	
	@Query(value =" SELECT * FROM qpd_class WHERE TransactionID=?1", nativeQuery = true)
	Classification getOneClass(String tid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_class(TransactionID, PatientID, MedicalClass,"
				 + " Notes, QC, QCLicense, userID, CreationDate) "
				 + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
	int addClass(int trans, int pid, String med, String notes, String qc, int qcl, int userID, String cdate);

	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_class SET MedicalClass = ?1, Notes = ?2, QC = ?3,"
			+ " QCLicense = ?4, CreationDate = ?5, userID = ?7 where classId=?6", nativeQuery = true)
	int updateClass(String med, String notes, String qc, int qcl, String cdate, int classId, int userID);
}
