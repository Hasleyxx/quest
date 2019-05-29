package qis.Pe;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface VitalRepository extends JpaRepository<Vital, Integer>{
	@Query(value = " SELECT * from qpd_vital", nativeQuery = true )
	List<Vital> VitalList();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_vital (TransactionID, PatientID, height,"
			     + " weight, bmi, bp, pr, rr, uod, uos, cod, cos, cv, hearing, hosp,"
			     + " opr, pm, smoker, ad, lmp, notes, CreationDate, DateUpdate)"
			     + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14,"
			     + " ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23)", nativeQuery = true)
	int addVital(int trans, int pid, String hei, String wei, String bmi, String bp,
			String pr, String rr, String uod, String uos, String cod, String cos, String cv,
			String hearing, String hosp, String opr, String pm, String smoker, String ad,
			String lmp, String notes, String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_vital SET height = ?1, weight = ?2, bmi = ?3, bp = ?4, "
				 + " pr = ?5, rr = ?6, uod = ?7, uos = ?8, cod = ?9, cos = ?10, cv = ?11,"
				 + " hearing = ?12, hosp = ?13, opr = ?14, pm = ?15, smoker = ?16, ad = ?17,"
				 + " lmp = ?18, notes = ?19, CreationDate = ?20, DateUpdate = ?21"
				 + " where VitalsID = 553", nativeQuery = true)
	int updateVital(String hei, String wei, String bmi, String bp, String pr, String rr,
			String uod, String uos, String cod, String cos, String cv, String hearing,
			String hosp, String opr, String pm, String smoker, String ad, String lmp,
			String notes, String cdate, String udate);

}
