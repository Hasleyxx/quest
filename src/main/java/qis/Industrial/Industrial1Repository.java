package qis.Industrial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Industrial1Repository  extends JpaRepository <LabIndustrial1, Integer> {
	@Query(value = " SELECT t.TransactionID, t.TransactionDate, p.CompanyName, "
			+ " p.LastName, p.FirstName, p.MiddleName, p.PatientID, "
			+ " CONCAT (p.LastName ,', ', p.FirstName,' ', p.MiddleName) as FullName,"
			+ " (CASE when h.hemaID and m.microID and x.toxicID and s.seroID is null then 'ADD'"
			+ " ELSE 'VIEW' END) as ACTION "
			+ " FROM qpd_trans t join qpd_patient p on t.patientID = p.PatientID "
			+ " left join lab_hematology h ON t.TransactionID = h.TransactionID "
			+ " left join lab_microscopy m on t.TransactionID = m.TransactionID "
			+ " left join lab_toxicology x on t.TransactionID = x.TransactionID "
			+ " left join lab_serology s on t.TransactionID = s.TransactionID " , nativeQuery = true)
	List<LabIndustrial1> getinfo();	
}
