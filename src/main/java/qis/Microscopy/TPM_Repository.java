package qis.Microscopy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TPM_Repository extends JpaRepository<TP_Microscopy, Integer>{
	
	@Query(value = " SELECT t.TransactionID, t.TransactionDate, p.CompanyName, p.LastName,"
				 + " p.FirstName, p.MiddleName, p.PatientID, CONCAT (p.LastName ,', ',"
				 + " p.FirstName,' ', p.MiddleName) as FullName,"
				 + " (CASE when m.microID is null then 'ADD' ELSE 'EDIT' END) as ACTION"
				 + " FROM qpd_trans t join qpd_patient p on t.patientID = p.PatientID"
				 + " left join lab_microscopy m ON t.TransactionID = m.TransactionID"
				 , nativeQuery = true)
	List<TP_Microscopy> TPM_List();

}
