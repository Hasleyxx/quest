package qis.Pe;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface mHistoryRepository extends JpaRepository<MedicalHistory, Integer>{
	
	@Query(value = " SELECT * from qpd_medhis ", nativeQuery = true)
	List<MedicalHistory> MedList();
	
	@Query(value = " SELECT * FROM qpd_medhis WHERE TransactionID=?1", nativeQuery = true)
	MedicalHistory getOneMedicalHistory(String tid);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_medhis(TransactionID, PatientID, asth, tb, dia,"
				 + " hb, hp, kp, ab, jbs, pp, mh, fs, alle, ct, hep, std, ApeID, CreationDate, DateUpdate)"
				 + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12,"
				 + " ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20)", nativeQuery = true)
	int addMedhis(int trans, int pid, String asth, String tb, String dia, String hb, String hp,
			String kp, String ab, String jbs, String pp, String mh, String fs, String alle,
			String ct, String hep, String std, String ApeID, String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_medhis Set asth = ?1, tb = ?2, dia = ?3, hb = ?4, hp = ?5,"
			     + " kp = ?6, ab = ?7, jbs = ?8, pp = ?9, mh = ?10, fs = ?11, alle = ?12,"
			     + " ct = ?13, hep = ?14, std = ?15, CreationDate = ?16, DateUpdate = ?17 "
			     + " where MedHisID = ?18", nativeQuery = true )
	int updateMedhis(String asth, String tb, String dia, String hb, String hp, String kp,
			String ab, String jbs, String pp, String mh, String fs, String alle,
			String ct, String hep, String std, String cdate, String udate, String medHisID);	
	
}
