package qis.DoctorRequestCategory;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRequestCategoryRepository extends JpaRepository <DoctorRequestCategory, Integer> {
	@Query(value = "SELECT * from doc_request_category WHERE status=1", nativeQuery = true)
	List<DoctorRequestCategory> docRequestCategory();
	
	@Query(value = "SELECT * from doc_request_category WHERE docReqCatId=?1 AND status=1", nativeQuery = true)
	List<DoctorRequestCategory> docRequestCategoryId(int DocReqCatId);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_request_category (category)"
			+ " VALUES (?1)", nativeQuery = true)
	int addDocRequestCategory(String Category);

	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_request_category SET status=?1 WHERE docReqCatId=?2", nativeQuery = true)
	int docRequestCategoryUpdate(String Status, int DocReqCatId);
}
