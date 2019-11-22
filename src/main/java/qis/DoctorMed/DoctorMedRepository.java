package qis.DoctorMed;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorMedRepository extends JpaRepository <DoctorMed, Integer> {
	@Query(value = " SELECT * FROM doc_medication", nativeQuery = true)
	List<DoctorMed> docMed();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_medication (patientID, genericName, brandName, quantity, "
			+ "dosage, sched, duration, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
	int addDocMed(int pid, String genericName, String brandName, String quantity, 
			String dosage, String rOssched, String duration, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_medication SET genericName=?1, brandName=?2, quantity=?3, dosage=?4, "
			+ "sched=?5, duration=?6, dateCreated=?7 WHERE docMedID=?8", nativeQuery = true)
	int updateDocMed(String genericName, String brandName, String quantity, 
			String dosage, String rOssched, String duration, String dateCreated, int dmId);
}
