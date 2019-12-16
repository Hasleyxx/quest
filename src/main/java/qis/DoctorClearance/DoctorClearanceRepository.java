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
	
	@Query(value = " SELECT * FROM doc_clearance WHERE docClearanceID=?1", nativeQuery = true)
	DoctorClearance getOneDocClearance(String id);
	
	@Query(value = " SELECT * FROM doc_clearance WHERE patientID=?1", nativeQuery = true)
	List<DoctorClearance> getPidDocClearance(String tid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_clearance (patientID, dataRef, pastmedHis, socialHis, allergies, "
			+ "prevSurgery, rOs, workUp, assesmentPlan, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	int addDocClearance(int pid, String dataRef, String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String workUp, String assesmentPlan, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_clearance SET dataRef=?1, pastmedHis=?2, socialHis=?3, allergies=?4, prevSurgery=?5, "
			+ "rOs=?6, workUp=?7, assesmentPlan=?8, dateCreated=?9 WHERE docClearanceID=?10", nativeQuery = true)
	int updateDocClearance(String dataRef, String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String workUp, String assesmentPlan, String dateCreated,
			int docClearanceID);
	
	
}
