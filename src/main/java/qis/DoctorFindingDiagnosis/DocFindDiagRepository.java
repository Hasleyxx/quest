package qis.DoctorFindingDiagnosis;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DocFindDiagRepository extends JpaRepository<DocFindDiag, Integer> {
	
	@Query(value = "SELECT * FROM doc_find_diag WHERE patientID=?1 ORDER BY docId DESC", nativeQuery = true)
	List<DocFindDiag> getFindDiagPid(int pid);
	
	@Query(value = "SELECT * FROM doc_find_diag WHERE docId=?1", nativeQuery = true)
	List<DocFindDiag> getFindDiagByDate(int docId);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO doc_find_diag (patientID, CreationDate, findings, diagnosis) "
			+ " VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
	int addFindDiag(int patientID, String CreationDate, String findings, String diagnosis);
}
