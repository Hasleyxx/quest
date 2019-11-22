package qis.DoctorMedcert;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface DoctorMedcertRepository extends JpaRepository <DoctorMedcert, Integer> {
	@Query(value = " SELECT * FROM doc_medcert", nativeQuery = true)
	List<DoctorMedcert> docMedcert();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_medcert (patientID, due, diagnosis, remarks, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	int addDocMedcert(int pid, String due, String diagnosis, String remarks, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_medcert SET due=?1, diagnosis=?2, remarks=?3, dateCreated=?4 "
			+ "WHERE docMedcertID=?5", nativeQuery = true)
	int updateDocMedcert(String due, String diagnosis, String remarks, String dateCreated, int dmId);
}
