package qis.Transaction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface TransactionRepository extends JpaRepository <Transaction, Integer> {
	@Query(value = " SELECT * from qpd_trans where status != 2", nativeQuery = true)
	List<Transaction> viewtrans();
	
	@Query(value = " SELECT * from qpd_trans where TransactionID = ?1 and status != 2" , nativeQuery = true)
	List<Transaction> Transactionid(int id);
	
	@Query(value = " SELECT * from qpd_trans where TransactionRef = ?1 and status != 2" , nativeQuery = true)
	List<Transaction> TransRefId(int id);
	
	// Added by Michael
	@Query(value = " SELECT * FROM qpd_trans WHERE PatientID=?1 AND TransactionID=?2", nativeQuery = true)
	List<Transaction> checkTransactionPatient(String pid, String tid);
	
	// Added by Michael
	@Query(value = " SELECT * FROM qpd_trans WHERE TransactionDate LIKE %?1%", nativeQuery = true)
	List<Transaction> getTransactionYear(String year);
	
	@Query(value = " SELECT * from qpd_trans where status = 0 " , nativeQuery = true)
	List<Transaction> status();
	
	@Query(value = " SELECT * from qpd_trans where TransactionDate BETWEEN ?1 and ?2 and status = 1", nativeQuery = true)
	List<Transaction> getTransactionDate(String v1, String v2);
	
	@Query(value = " SELECT * from qpd_trans where TransactionID BETWEEN ?1 and ?2 and status = 1", nativeQuery = true)
	List<Transaction> getTransactionId(String v1, String v2);
	
	@Query(value = " SELECT * from qpd_trans where TransactionType = ?1 and status = 1", nativeQuery = true)
	List<Transaction> getTransactionType(String type);
	
	@Query(value = " SELECT * from qpd_trans where TransactionType = ?1 and "
				 + " TransactionDate BETWEEN ?2 and ?3 and status = 1", nativeQuery = true)
	List<Transaction> getTransactionTypeDate(String type, String v1, String v2);
	
	@Query(value = " SELECT * from qpd_trans where "
			+ "TransactionDate BETWEEN ?1 and ?2 and TransactionType = 'ACCOUNT' || "
			+ "TransactionDate BETWEEN ?1 and ?2 and TransactionType = 'APE' || "
			+ "TransactionDate BETWEEN ?1 and ?2 and TransactionType = 'HMO'"
			+ " and status = 1", nativeQuery = true)
	List<Transaction> getTransactionBillingDate( String v1, String v2 );
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_trans (TransactionRef, PatientID, userID, TransactionType,"
			+ " Biller, TotalPrice, PaidIn, PaidOut, GrandTotal, TransactionDate, status, SalesType,"
			+ " LOE, AN, AC, Notes, Currency)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13,"
			+ " ?14, ?15, ?16, ?17)", nativeQuery = true)
	int addTransaction(String tRef, int pId, int uId, String tType, String bil, String tPrice,
			double pIn, double pOut, double gTotal, String tDate, int status, String sType,
			String loe, String an, String ac, String notes, String cur);
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_trans SET PatientID = ?1, userID = ?2, TransactionType = ?3,"
			+ " Biller = ?4, TotalPrice = ?5, PaidIn = ?6, PaidOut = ?7, GrandTotal = ?8,"
			+ " TransactionDate = ?9, status = ?10, SalesType = ?11, LOE = ?12, AN = ?13,"
			+ " AC = ?14, Notes = ?15, currency = ?16 WHERE TransactionID = ?17 ", nativeQuery = true)
	int updateTransaction(int pId, int uId, String tType, String bil, String tPrice, double pIn,
			double pOut, double gTotal, String tDate, int status, String sType, String loe,
			String an, String ac, String notes, String cur, int trans);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_trans SET status = ?1 WHERE TransactionID = ?2", nativeQuery = true )
	int updateStatus(int status, int trans);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_trans SET AC = ?1, AN = ?2, LOE = ?3, TransactionDate = ?4 "
				 + " WHERE TransactionID = ?5", nativeQuery = true)
	int updateACANLOE(String ac, String an, String loe, String tdate, int tid);
	

}
