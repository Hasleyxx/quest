package qis.Industrial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IndustrialForTableRepository extends JpaRepository <LabInFourTable, Integer>  {
	@Query(value = " select * FROM qpd_trans t join qpd_patient p on t.patientID = p.PatientID "
			+ " left join lab_hematology h ON t.TransactionID = h.TransactionID "
			+ " left join lab_microscopy m on t.TransactionID = m.TransactionID "
			+ " left join lab_toxicology x on t.TransactionID = x.TransactionID  "
			+ " left join lab_serology s on t.TransactionID = s.TransactionID "
			+ " and t.TransactionID = ?1 " , nativeQuery = true)
	List<LabInFourTable> gethinfo(int id);
	
}
