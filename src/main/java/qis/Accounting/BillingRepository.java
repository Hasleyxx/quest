package qis.Accounting;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer>{
	
	@Query(value = " SELECT * from acc_billing", nativeQuery = true)
	List<Accounting> bilList();
	
	@Query(value = " SELECT * from acc_billing where BillID = ?1", nativeQuery = true)
	List<Accounting> bilBID(int bid);
	
	@Query(value = " SELECT * from acc_billing where CompanyID = ?1", nativeQuery = true)
	List<Accounting> bilCID(int cid);
	
	@Query(value = " SELECT * from acc_billing where soaCode = ?1", nativeQuery = true)
	List<Accounting> bilSC(int sc);
}
