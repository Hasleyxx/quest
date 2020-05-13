package qis.ColorFlow;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ColorFlowRepository extends JpaRepository<ColorFlow, Integer> {
	@Query(value = " SELECT * FROM qpd_colorflow WHERE TransactionID=?1", nativeQuery = true)
	ColorFlow getColorFlow(int tid);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO qpd_colorflow (TransactionID, PatientID, userID, lvelocity, lpeakgrad, "
			+ "lvti, lvalve, lratio, ljetarea, lvc, avvelocity, avpeakgrad, avvti, avvalve, avratio, avjetarea, avvc, "
			+ "mvvelocity, mvpeakgrad, mvvti, mvvalve, mvratio, mvjetarea, mvvc, tvvelocity, tvpeakgrad, tvvti, tvvalve, "
			+ "tvratio, tvjetarea, tvvc, pvvelocity, pvpeakgrad, pvvti, pvvalve, pvratio, pvjetarea, pvvc, pat, rvat, "
			+ "trjet, ewave, ivrt, late, lata, mede, meda, e, a, eeratio) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, "
			+ "?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31, "
			+ "?32, ?33, ?34, ?35, ?36, ?37, ?38, ?39, ?40, ?41, ?42, ?43, ?44, ?45, ?46, ?47, ?48, ?49, ?50)", nativeQuery = true)
	int addColorFlow(int TransactionID, int PatientID, int userID, String lvelocity, 
			String lpeakgrad, String lvti, String lvalve, String lratio, String ljetarea, String lvc, 
			String avvelocity, String avpeakgrad, String avvti, String avvalve, String avratio, String avjetarea, 
			String avvc, String mvvelocity, String mvpeakgrad, String mvvti, String mvvalve, String mvratio, 
			String mvjetarea, String mvvc, String tvvelocity, String tvpeakgrad, String tvvti, String tvvalve, 
			String tvratio, String tvjetarea, String tvvc, String pvvelocity, String pvpeakgrad, String pvvti, 
			String pvvalve, String pvratio, String pvjetarea, String pvvc, String pat, String rvat, String trjet, 
			String ewave, String ivrt, String late, String lata, String mede, String meda, String e, String a, String eeratio);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_colorflow SET userID=?2, lvelocity=?3, lpeakgrad=?4, lvti=?5, lvalve=?6, lratio=?7, "
			+ "ljetarea=?8, lvc=?9, avvelocity=?10, avpeakgrad=?11, avvti=?12, avvalve=?13, avratio=?14, avjetarea=?15, "
			+ "avvc=?16, mvvelocity=?17, mvpeakgrad=?18, mvvti=?19, mvvalve=?20, mvratio=?21, mvjetarea=?22, mvvc=?23, "
			+ "tvvelocity=?24, tvpeakgrad=?25, tvvti=?26, tvvalve=?27, tvratio=?28, tvjetarea=?29, tvvc=?30, "
			+ "pvvelocity=?31, pvpeakgrad=?32, pvvti=?33, pvvalve=?34, pvratio=?35, pvjetarea=?36, pvvc=?37, "
			+ "pat=?38, rvat=?39, trjet=?40, ewave=?41, ivrt=?42, late=?43, lata=?44, mede=?45, meda=?46, e=?47, a=?48"
			+ "eeratio=?49, dateUpdate=?50 WHERE colorID=?1", nativeQuery = true)
	int updateColorFlow(int colorID, int userID, String lvelocity, 
			String lpeakgrad, String lvti, String lvalve, String lratio, String ljetarea, String lvc, 
			String avvelocity, String avpeakgrad, String avvti, String avvalve, String avratio, String avjetarea, 
			String avvc, String mvvelocity, String mvpeakgrad, String mvvti, String mvvalve, String mvratio, 
			String mvjetarea, String mvvc, String tvvelocity, String tvpeakgrad, String tvvti, String tvvalve, 
			String tvratio, String tvjetarea, String tvvc, String pvvelocity, String pvpeakgrad, String pvvti, 
			String pvvalve, String pvratio, String pvjetarea, String pvvc, String pat, String rvat, String trjet, 
			String ewave, String ivrt, String late, String lata, String mede, String meda, String e, String a, 
			String eeratio, String dateUpdate);
}
