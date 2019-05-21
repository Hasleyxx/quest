package com.lab.industrial;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quest.tables.LabIndChemTable;

public interface LabIndChemTabRepository extends JpaRepository <LabIndChemTable, Integer> {
	@Query(value = " SELECT t.transactionID, p.patientID, t.TransactionDate, p.CompanyName, "
			+ " CONCAT(p.LastName,', ',p.FirstName,' ',p.MiddleName) as FullName, \n" 
			+ " (CASE WHEN c.chemID is not NULL THEN \"EDIT\"\n"  
			+ "	  ELSE \"ADD\"\n"  
			+ " END) as Action FROM qpd_patient p JOIN qpd_trans t"
			+ " on p.PatientID = t.PatientID LEFT JOIN lab_chemistry c"
			+ " on t.TransactionID = c.transactionID ORDER by TransactionID"
			+ "",nativeQuery = true)
	List<LabIndChemTable> chemtable();

}
