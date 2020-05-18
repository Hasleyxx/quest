package qis.DoctorCovid;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorCovidRepository extends JpaRepository<DoctorCovid, Integer> {
	
	@Query(value = "SELECT * FROM doc_covid WHERE patientId = ?1", nativeQuery = true)
	List<DoctorCovid> getCovidHistory(int patientId);
	
	@Query(value = "SELECT * FROM doc_covid WHERE docCovidId = ?1", nativeQuery = true)
	DoctorCovid getCovidHistoryOne(int docCovidId);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO doc_covid (patientId, result, userID) "
			+ "VALUES (?1, ?2, ?3)", nativeQuery = true)
	int addCovid(int patientId, String result, int userID);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE doc_covid SET result = ?2, userID = ?3, DateUpdate = ?4 WHERE docCovidId = ?1", nativeQuery = true)
	int updateCovid(int docCovidId, String result, int userID, String dateUpdate);

}
