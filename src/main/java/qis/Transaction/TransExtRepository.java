package qis.Transaction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TransExtRepository extends JpaRepository<TransExt, Integer> {
	@Query(value = "Select * from qpd_transext", nativeQuery = true)
	List<TransExt> viewtrans();
	
	@Query(value = "Select * from qpd_transext where TransactionID = ?1", nativeQuery = true)
	List<TransExt> transrefbyID(int id);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_transext (TransactionID, ItemID, PackageName, ItemQTY, ItemDisc)"
				 + " VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	int addtransext(int tid,Integer iid, String pname, int qty, int disc);
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_transext SET ItemQTY = ?1, ItemDisc = ?2"
			+ " WHERE TransactionID = 1386 ", nativeQuery = true)
	int updatetransext(int qty, int disc);
	
	
}
