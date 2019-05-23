package qis.Hematology;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LabHemaRepository extends JpaRepository <LabHema, Integer> {
	@Query(value = " SELECT t.TransactionID, t.TransactionDate, p.CompanyName, "
			+ " p.LastName, p.FirstName, p.MiddleName, p.PatientID, "
			+ " CONCAT (p.LastName ,', ', p.FirstName,' ', p.MiddleName) as FullName,"
			+ " (CASE when h.hemaID is null then 'ADD' "
			+ " ELSE 'EDIT' END) as ACTION "
			+ " FROM qpd_trans t join qpd_patient p on t.patientID = p.PatientID "
			+ " left join lab_hematology h ON t.TransactionID = h.TransactionID " , nativeQuery = true)
	List<LabHema> gethema();
}
