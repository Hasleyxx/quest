package qis.DoctorPatient;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorPatientRepository extends JpaRepository <DoctorPatient, Integer> {
	@Query(value = " SELECT * FROM doc_patient WHERE patientID = ?1", nativeQuery = true)
	List<DoctorPatient> docPatient(int pid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_patient (patientID, famHis, pastmedHis, allergies, medication, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addDocPatient(int pid, String famHis, String pastmedHis, String allergies, String medication, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_patient SET famHis=?1, pastmedHis=?2, allergies=?3, medication=?4, "
			+ " dateCreated=?5 WHERE docPatientID=?6", nativeQuery = true)
	int updateDocPatient(String famHis, String pastmedHis, String allergies, String medication, String dateCreated,
			int dmId);


}
