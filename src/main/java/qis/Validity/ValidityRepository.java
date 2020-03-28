package qis.Validity;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ValidityRepository extends JpaRepository<Validity, Integer> {
	@Query(value = "SELECT * FROM tbl_validity", nativeQuery = true)
	Validity getValidity();
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE tbl_validity SET validity=?1 WHERE id=?2", nativeQuery = true)
	int updateValidity(String validity, int id);
}
