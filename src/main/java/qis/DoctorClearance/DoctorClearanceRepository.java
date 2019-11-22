package qis.DoctorClearance;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorClearanceRepository extends JpaRepository <DoctorClearance, Integer> {
	@Query(value = " SELECT * FROM doc_clearance", nativeQuery = true)
	List<DoctorClearance> doctorClearance();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_clearance (patientID, pastmedHis, socialHis, allergies, "
			+ "prevSurgery, rOs, pe, workUp, assesmentPlan, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	int addDocClearance(int pid, String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String pe, String workUp, String assesmentPlan, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_clearance SET pastmedHis=?1, socialHis=?2, allergies=?3, prevSurgery=?4, "
			+ "rOs=?5, pe=?6, workUp=?7, assesmentPlan=?8, dateCreated=?9 WHERE docClearanceID=?11", nativeQuery = true)
	int updateDocClearance(String pastmedHis, String socialHis, String allergies, 
			String prevSurgery, String rOs, String pe, String workUp, String assesmentPlan, String dateCreated,
			int docClearanceID);
}
