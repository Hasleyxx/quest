package qis.Toxicology;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LabInToxicologyRepository extends JpaRepository <LabIndustrialToxicology, Integer> {
	@Query(value ="Select * From lab_toxicology where TransactionID = ?1",nativeQuery = true)
	List<LabIndustrialToxicology> toxicologyview(int pid);

	@Transactional
	@Modifying
	@Query(value = "INSERT INTO lab_toxicology (TransactionID, PatientID,"
			+ " Meth, Tetra, Drugtest, PathID, MedID, QualityID, patientIdRef, userID, CreationDate, DateUpdate)\n" + 
			" VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12)", nativeQuery = true)
	int toxicologyadd( int transid, int pid, String meth, String tetra, String drugtest, int pathid,
			int medid, int qualityid, String patientIdRef, int userID, String creationdate, String dateupdate);

	@Transactional
	@Modifying
	@Query(value = " UPDATE lab_toxicology SET TransactionID = ?2, PatientID = ?3,"
			+ " Meth = ?4, Tetra = ?5, Drugtest = ?6, PathID = ?7, MedID = ?8, QualityID = ?9,"
			+ " CreationDate = ?10, DateUpdate = ?11, userID = ?12 WHERE toxicID = ?1", nativeQuery = true)	
	int toxicologyupdate(int toxicid, int transid, int pid, String meth, String tetra,
			String drugtest, int pathid, int medid, int qualityid, String creationdate,
			String dateupdate, int userID);
}
