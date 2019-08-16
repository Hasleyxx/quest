package qis.Accounting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer>{
	
	@Query(value = " SELECT * from acc_billing", nativeQuery = true)
	List<Billing> bilList();
	
	@Query(value = " SELECT * from acc_billing where BillID = ?1", nativeQuery = true)
	List<Billing> bilBID(int bid);
	
	@Query(value = " SELECT * from acc_billing where CompanyID = ?1", nativeQuery = true)
	List<Billing> bilCID(int cid);
	
	@Query(value = " SELECT * from acc_billing where soaCode = ?1", nativeQuery = true)
	List<Billing> bilSC(int sc);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into acc_billing( CompanyID, Address, soaCode, fromDate,"
			+ "toDate, soaDate, TransIds , Attention, Prepared, Verified, Validated )"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7 , ?8, ?9, ?10, ?11)", nativeQuery = true)
	int addBil( int cid, String add, String sc, String fd, String td,String sd, String tids, String att, 
			String pre, String ver, String vali);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE acc_billing set CompanyID = ?1 , Address = ?2, soaCode = ?3, "
			+ "fromDate = ?4, toDate = ?5, soaDate = ?6, TransIds = ?7, Attention = ?8, "
			+ "Prepared = ?9, Verified = ?10, Validated = ?11 where BillID = ?12", nativeQuery = true)
	int updateBil( int cid, String add, String sc, String fd, String td,String sd, String tids, String att,
			String pre, String ver, String vali, int bid);
}
