package qis.DoctorClearance;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import qis.Pe.MedicalHistory;

public interface DoctorClearanceRepository extends JpaRepository <DoctorClearance, Integer> {
	@Query(value = " SELECT * FROM doc_clearance", nativeQuery = true)
	List<DoctorClearance> doctorClearance();
	
	@Query(value = " SELECT * FROM doc_clearance WHERE TransactionID=?1", nativeQuery = true)
	DoctorClearance getOneDocClearance(String tid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_clearance (patientID, pastmedHis, socialHis, allergies, "
			+ "prevSurgery, rOs, workUp, assesmentPlan, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
	int addDocClearance(int pid, String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String workUp, String assesmentPlan, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_clearance SET pastmedHis=?1, socialHis=?2, allergies=?3, prevSurgery=?4, "
			+ "rOs=?5, workUp=?6, assesmentPlan=?7, dateCreated=?8 WHERE docClearanceID=?10", nativeQuery = true)
	int updateDocClearance(String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String workUp, String assesmentPlan, String dateCreated,
			int docClearanceID);
}
