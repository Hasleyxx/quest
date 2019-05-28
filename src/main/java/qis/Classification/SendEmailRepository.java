package qis.Classification;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SendEmailRepository extends JpaRepository <SendEmail, Integer> {
	@Query(value = "SELECT * from qpd_sendemail", nativeQuery = true)
	List<SendEmail> EmailList();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_sendemail(PatientID, TransactionID, RecipientsEmail,"
				 + " Subject, CreatedOn, CreatedBy, ModifiedOn, ModifiedBy)"
				 + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
	int addEmail(int pid, int trans, String re, String sub, String co, String cb,
			String mo, int mb);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_sendemail SET RecipientsEmail = ?1, Subject = ?2, CreatedOn = ?3,"
				 + " CreatedBy = ?4, ModifiedOn = ?5, ModifiedBy = ?6 "
				 + " where SendEmailID = 1", nativeQuery = true)
	int updateEmail(String re, String sub, String co, String cb,
			String mo, int mb);
}
