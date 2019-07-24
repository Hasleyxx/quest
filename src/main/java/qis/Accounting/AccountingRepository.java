package qis.Accounting;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountingRepository extends JpaRepository<Accounting, Integer> {
	
	@Query(value = " SELECT * from acc_payment", nativeQuery = true)
	List<Accounting> accList();
	
	@Query(value = " SELECT * from acc_payment where TransactionID = ?1", nativeQuery = true)
	List<Accounting> accListbyTID(int tid);
	
	@Query(value = " SELECT * from acc_payment where BillID = ?1", nativeQuery = true)
	List<Accounting> accListbyBID(int bid);
	
	@Query(value = " SELECT * from acc_payment where CompanyID = ?1", nativeQuery = true)
	List<Accounting> accListbyCID(int cid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into acc_payment(TransactionID, BillID, CompanyID, Debit, PaymentType, "
			+ "PaymentCur, CheckNo, Bank, CheckDate, PaymentDate )"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	int addAcc(Integer tid, Integer bid, int cid, double debit, String pt, String pc, 
			String cn, String bank,String cd, String pd);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE acc_payment SET TransactionID = ?1, BillID = ?2, CompanyID = ?3, Debit = ?4, "
			+ "PaymentType = ?5, PaymentCur = ?6, CheckNo = ?7, Bank = ?8, CheckDate = ?9, PaymentDate = ?10 "
			+ "where apID = ?11", nativeQuery = true)
	int updateAcc(Integer tid, Integer bid, int cid, double debit, String pt, String pc, 
			String cn, String bank,String cd, String pd, int aid);

}