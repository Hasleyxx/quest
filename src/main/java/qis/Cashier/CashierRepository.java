package qis.Cashier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashierRepository extends JpaRepository<Cashier, Integer> {
	
	@Query(value = " SELECT CONCAT (f.LastName, ', ', f.FirstName, ' ', f.MiddleName) as fullname,"
				 + " f.*, t.* FROM qpd_patient f, qpd_trans t  WHERE f.PatientID = t.PatientID AND"
				 + " status = '1' ORDER BY t.TransactionDate DESC", nativeQuery = true)
	List<Cashier> findTransactionList();

	@Query(value = " SELECT CONCAT (f.LastName, ', ', f.FirstName, ' ', f.MiddleName) as fullname,"
			     + " f.*, t.* FROM qpd_patient f, qpd_trans t WHERE f.PatientID = t.PatientID and"
			     + " t.AN != '' ORDER BY t.TransactionID DESC", nativeQuery = true)
	List<Cashier> findHMOList();

}


