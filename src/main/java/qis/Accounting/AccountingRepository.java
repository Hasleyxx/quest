package qis.Accounting;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountingRepository extends JpaRepository<Accounting, Integer> {
	
	@Query(value = " SELECT * from qpd_accounting", nativeQuery = true)
	List<Accounting> accList();
	
	@Query(value = " SELECT * from qpd_accounting where TransactionID = ?1", nativeQuery = true)
	List<Accounting> accListbyTID(int tid);
	
	@Query(value = " SELECT * from qpd_accounting where PatientID = ?1", nativeQuery = true)
	List<Accounting> accListbyPID(int pid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_accounting(TransactionID, PaidCur, PaidDate, TimeLimit, PatientID)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	int addAcc(int tid, String cur, String pdate, String tdate, int pid);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_accounting SET PaidCur = ?1, PaidDate = ?2, TimeLimit = ?3 "
			+ "where accID = ?4", nativeQuery = true)
	int updateAcc(String cur, String pdate, String tdate, int aid);

}