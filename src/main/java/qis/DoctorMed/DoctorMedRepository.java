package qis.DoctorMed;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorMedRepository extends JpaRepository <DoctorMed, Integer> {
	@Query(value = " SELECT * FROM doc_medication", nativeQuery = true)
	List<DoctorMed> docMed();

	@Query(value = " SELECT * FROM doc_medication WHERE patientID=?1", nativeQuery = true)
	List<DoctorMed> doctorMedId(int pid);

	@Query(value = " SELECT * FROM doc_medication WHERE docMedID=?1", nativeQuery = true)
	List<DoctorMed> doctorMedUid(int uid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_medication (patientID, genericName, brandName, quantity, "
			+ "dosage, sched, duration, notes, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
	int addDocMed(int pid, String genericName, String brandName, String quantity, 
			String dosage, String rOssched, String duration, String notes, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_medication SET genericName=?1, brandName=?2, quantity=?3, dosage=?4, "
			+ "sched=?5, duration=?6, notes=?7, dateCreated=?8 WHERE docMedID=?9", nativeQuery = true)
	int updateDocMed(String genericName, String brandName, String quantity, 
			String dosage, String rOssched, String duration, String notes, String dateCreated, int dmId);
	
	@Transactional
	@Modifying
	@Query(value = " DELETE FROM doc_medication WHERE docMedID=?1", nativeQuery = true)
	int deleteDocMed(int id);
}
