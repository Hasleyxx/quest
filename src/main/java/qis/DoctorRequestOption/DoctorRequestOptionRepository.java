package qis.DoctorRequestOption;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRequestOptionRepository extends JpaRepository <DoctorRequestOption, Integer> {
	@Query(value = "SELECT * from doc_request_option WHERE status=1", nativeQuery = true)
	List<DoctorRequestOption> getDocRequestOption();
	
	@Query(value = "SELECT * from doc_request_option WHERE category=?1 AND status=1", nativeQuery = true)
	List<DoctorRequestOption> getDocRequestOptions(int Category);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_request_option (option, category)"
			+ " VALUES (?1, ?2)", nativeQuery = true)
	int addDocRequestOption(String option, int category);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_request_option SET status=?1 WHERE docReqOptionId=?2", nativeQuery = true)
	int updateDocRequestOption(String Status, int DocReqOptionId);
}
