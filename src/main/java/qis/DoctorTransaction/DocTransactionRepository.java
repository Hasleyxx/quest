package qis.DoctorTransaction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DocTransactionRepository extends JpaRepository<DocTransaction, Integer> {
	
	@Query(value = " SELECT * FROM doc_trans WHERE transactionDocDate BETWEEN ?1 AND ?2 AND status = 1", nativeQuery = true)
	List<DocTransaction> getDocTransactions(String date1, String date2);
	
	@Query(value = " SELECT * FROM doc_trans WHERE transactionDocId = ?1", nativeQuery = true)
	DocTransaction getOneDocTransaction(int tid);
	
	@Query(value = " SELECT * FROM doc_trans WHERE transactionDocDate BETWEEN ?1 AND ?2 AND status = 0", nativeQuery = true)
	List<DocTransaction> getDocTransactionsCanceled(String date1, String date2);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_trans (transactionRef, userId, patientId, totalPrice, paidIn, paidOut, grandTotal) VALUES "
			+ "(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
	int addDocTransaction(String transactionRef, int userId, int patientId, String totalPrice, double paidIn, double paidout
			, double grandTotal);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_trans SET status = 0 WHERE transactionDocId = ?1", nativeQuery = true)
	int cancelDocTransaction(int transactionDocId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE doc_trans SET totalPrice = ?2, paidIn = ?3, paidOut = ?4, grandTotal = ?5, itemId = ?6, date_paid = ?7 "
			+ "WHERE transactionDocId = ?1", nativeQuery = true)
	int updateDocTransaction(int transactionDocId, String totalPrice, double paidIn, double paidOut, double grandTotal, 
			String itemId, String date_paid);
}
