package qis.Transaction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface TransactionRepository extends JpaRepository <Transaction, Integer> {
	@Query(value = "Select * from qpd_trans", nativeQuery = true)
	List<Transaction> viewtrans();
	
	@Query(value = "SELECT * from qpd_trans where TransactionID =?1" , nativeQuery = true)
	List<Transaction> Transactionid(int id);
	
	@Query(value = "SELECT * from qpd_trans where TransactionRef =?1" , nativeQuery = true)
	List<Transaction> TransRefId(int id);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_trans (TransactionRef, PatientID, userID, TransactionType,"
			+ " Biller, TotalPrice, PaidIn, PaidOut, GrandTotal, TransactionDate, status, SalesType,"
			+ " LOE, AN, AC, Notes)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16)"
			, nativeQuery = true)
	int addTransaction(String tRef, int pId, int uId, String tType, String bil, String tPrice,
			double pIn, double pOut, double gTotal, String tDate, int status, String sType,
			String loe, String an, String ac, String notes);
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_trans SET TransactionType = ?1, Biller = ?2, TotalPrice = ?3,"
			+ " PaidIn = ?4, PaidOut = ?5, GrandTotal = ?6, TransactionDate = ?7, status = ?8,"
			+ " SalesType = ?9, LOE = ?10, AN = ?11, AC = ?12, Notes = ?13"
			+ " WHERE TransactionID = 1386 ", nativeQuery = true)
	int updateTransaction(String tType, String bil, String tPrice, double pIn, double pOut,
			double gTotal, String tDate, int status, String sType, String loe, String an,
			String ac, String notes);
	
	

}
