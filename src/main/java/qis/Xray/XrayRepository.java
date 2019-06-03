package qis.Xray;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface XrayRepository extends JpaRepository<Xray, Integer> {
	@Query(value = " SELECT * from qpd_xray", nativeQuery = true)
	List<Xray> XrayList();

}
