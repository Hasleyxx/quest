package qis.Pe;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PeRepository extends JpaRepository <PE, Integer>{
	@Query(value = "SELECT * from qpd_pe", nativeQuery = true )
	List<PE> PeList();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_pe(TransactionID, PatientID, skin, hn, cbl, ch, abdo,"
			+ " extre, ot, find, Doctor, License, CreationDate, DateUpdate)"
			+ " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12 , ?13,"
			+ " ?14)", nativeQuery = true)
	int addPe(int trans, int pid, String skin, String hn, String cbl, String ch,
			String abdo, String extre, String ot, String find, String doctor,
			int license, String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_pe SET skin = ?1, hn = ?2, cbl = ?3, ch = ?4, abdo = ?5,"
			+ " extre = ?6, ot = ?7, find = ?8, Doctor = ?9, License = ?10,"
			+ " CreationDate = ?11, DateUpdate = ?12 where PExamID = 553 ", nativeQuery = true )
	int updatePe(String skin, String hn, String cbl, String ch, String abdo, String extre,
			String ot, String find, String doctor, int license, String cdate, String udate);
}
