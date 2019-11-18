package qis.MarkerOption;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MarkerOptionRepository  extends JpaRepository<MarkerOption, String> {
	// Get marker
	@Query(value = " SELECT * FROM qpd_marker_option WHERE type=?1", nativeQuery = true)
	List<MarkerOption> getMarkerOptions(String marker);
	
	// Get Film size
	@Query(value = " SELECT * FROM qpd_marker_option WHERE type='Film Size' AND status='true'", nativeQuery = true)
	List<MarkerOption> getFilmSize();
	
	// Get Radtech
	@Query(value = " SELECT * FROM qpd_marker_option WHERE type='RadTech' AND status='true'", nativeQuery = true)
	List<MarkerOption> getRadtech();
	
	// Get Bodyparts
	@Query(value = " SELECT * FROM qpd_marker_option WHERE type='Bodypart' AND status='true'", nativeQuery = true)
	List<MarkerOption> getBodypart();
	
	// Add MarkerOption
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_marker_option (name, type) VALUES(?1, ?2)", nativeQuery = true)
	int addMarkerOption(String name, String type);
	
	// Deactivate MarkerOption
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_marker_option SET status='false' WHERE id=?1", nativeQuery = true)
	int deactivateMarkerOption(String id);
	
	// Activate MarkerOption
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_marker_option SET status='true' WHERE id=?1", nativeQuery = true)
	int activateMarkerOption(String id);
}
