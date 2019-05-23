package qis.Toxicology;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import qis.Chemistry.LabIndChemTable;

public interface LabIndToxTabRepository extends JpaRepository <LabIndToxTable, Integer> {
	@Query(value = " SELECT t.TransactionID, t.PatientID, t.TransactionDate, p.CompanyName, "
			+ " CONCAT(LastName, ',', FirstName,' ',MiddleName) as PatientName,\n"  
			+ " (CASE \n "
			+ " WHEN lt.toxicID IS NOT NULL AND ls.seroID IS NOT NULL THEN 'Add'\n "
			+ " ELSE 'Edit'\n "
			+ " END) AS Action From qpd_patient p join qpd_trans t on p.patientID = t.patientID "
			+ " LEFT JOIN lab_toxicology lt on lt.TransactionID = t.TransactionID "
			+ " LEFT JOIN lab_serology ls on ls.TransactionID = t.TransactionID", nativeQuery = true)
	List<LabIndToxTable> sertoxtable();
}
