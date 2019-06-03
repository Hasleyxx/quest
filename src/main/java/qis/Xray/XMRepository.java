package qis.Xray;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface XMRepository extends JpaRepository<XrayMarkers, Integer>{
	
	@Query(value = " SELECT * from xray_markers", nativeQuery = true)
	List<XrayMarkers> MarkerList();
	
	@Query(value = "SELECT * from xray_markers where markerID =?1" , nativeQuery = true)
	List<XrayMarkers> Markerid(int id);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into xray_markers(PatientID, TransactionID, xrayFilm,"
				 + " xrayType, radTech, totalCount)"
				 + " VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addMarker(int pid, int trans, String film, String type, String rad, int tc);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE xray_markers(xrayFilm = ?1, xrayType = ?2, radTech = ?3,"
			     + " totalCount = ?4 where markerID = ?5)", nativeQuery = true)
	int updateMarker(String film, String type, String rad, int tc, int mid);

}
