package qis.Xray;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface XrayRepository extends JpaRepository<Xray, Integer> {
	@Query(value = " SELECT * from qpd_xray", nativeQuery = true)
	List<Xray> XrayList();

	@Query(value = "SELECT * from qpd_xray where XrayID =?1" , nativeQuery = true)
	List<Xray> Xrayid(int id);
	
	@Query(value =" SELECT * FROM qpd_xray WHERE TransactionID=?1", nativeQuery = true)
	Xray getOneXray(String tid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_xray(TransactionID, PatientID, Comment, Impression,"
			     + " Radiologist, QA, CreationDate, DateUpdate)"
			     + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8) ", nativeQuery = true)
	int addXray(int trans, int pid, String com, String impre, String rad,
			String qa, String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_xray SET imgXray = ?1 WHERE TransactionID = ?2", nativeQuery = true)
	int addXrayImage(String fileName, int pid);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_xray Set Comment = ?1, Impression = ?2, Radiologist = ?3,"
				 + " QA = ?4, CreationDate = ?5, DateUpdate = ?6"
				 + " where XrayID = ?7", nativeQuery = true)
	int updateXray(String com, String impre, String rad, String qa,
			String cdate, String udate, int xid);
}


