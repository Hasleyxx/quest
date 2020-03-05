package qis.DoctorRequest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRequestRepository extends JpaRepository <DoctorRequest, Integer> {
	@Query(value = " SELECT * FROM doc_request", nativeQuery = true)
	List<DoctorRequest> docRequest();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_request (patientID, category, test, otherTest, requestRef, dateCreated)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addDocRequest(int pid, String category, String test, String otherTest, String requestRef, String dateCreated);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_request SET category=?1, test=?2, otherTest=?3, dateCreated=?4 "
			+ " WHERE docRequestID=?5", nativeQuery = true)
	int updateDocRequest(String category, String test, String otherTest, String dateCreated, int drid);
}
