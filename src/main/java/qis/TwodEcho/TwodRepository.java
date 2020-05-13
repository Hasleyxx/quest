package qis.TwodEcho;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TwodRepository extends JpaRepository<Twod, Integer> {
	@Query(value = "SELECT * FROM qpd_echo WHERE TransactionID = ?1", nativeQuery = true)
	Twod getTwod(int tid);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO qpd_echo (transactionID ,patientID ,echoCarID ,qualityID ,cardioID ,userID ,"
			+ "lvedd ,lvedv ,laap ,lvesd ,lvesv ,larl ,lveddbsa ,sv ,labsa ,lvesdbsa ,co ,a1 ,ivsd ,efm ,a2 ,"
			+ "ivss ,efs ,lavi ,pwd ,fs ,aorta ,pws ,epss ,lvot ,lvmi ,lvet ,mva ,rwt ,rvm ,tva ,rarl ,rvfac ,"
			+ "rvot ,rabsa ,tapse ,mpa ,rvwt) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, "
			+ "?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31, ?32, "
			+ "?33, ?34, ?35, ?36, ?37, ?38, ?39, ?40, ?41, ?42, ?43)", nativeQuery = true)
	int addTwod(int transactionID, int patientID, int echoCarID, int qualityID, int cardioID, int userID, 
			String lvedd, String lvedv, String laap, String lvesd, String lvesv, String larl, String lveddbsa, 
			String sv, String labsa, String lvesdbsa, String co, String a1, String ivsd, String efm, String a2, 
			String ivss, String efs, String lavi, String pwd, String fs, String aorta, String pws, String epss, 
			String lvot, String lvmi, String lvet, String mva, String rwt, String rvm, String tva, String rarl, 
			String rvfac, String rvot, String rabsa, String tapse, String mpa, String rvwt);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_echo SET echoCarID=?2, qualityID=?3, cardioID=?4, userID=?5, lvedd=?6, lvedv=?7, laap=?8, "
			+ "lvesd=?9, lvesv=?10, larl=?11, lveddbsa=?12, sv=?13, labsa=?14, lvesdbsa=?15, co=?16, a1=?17, ivsd=?18, "
			+ "efm=?19, a2=?20, ivss=?21, efs=?22, lavi=?23, pwd=?24, fs=?25, aorta=?26, pws=?27, epss=?28, lvot=?29, "
			+ "lvmi=?30, lvet=?31, mva=?32, rwt=?33, rvm=?34, tva=?35, rarl=?36, rvfac=?37, rvot=?38, rabsa=?39, tapse=?40, "
			+ "mpa=?41, rvwt=?42, dateUpdate=?43 WHERE echoID = ?1", nativeQuery = true)
	int updateTwod(int echoID, int echoCarID, int qualityID, int cardioID, int userID, 
			String lvedd, String lvedv, String laap, String lvesd, String lvesv, String larl, String lveddbsa, 
			String sv, String labsa, String lvesdbsa, String co, String a1, String ivsd, String efm, String a2, 
			String ivss, String efs, String lavi, String pwd, String fs, String aorta, String pws, String epss, 
			String lvot, String lvmi, String lvet, String mva, String rwt, String rvm, String tva, String rarl, 
			String rvfac, String rvot, String rabsa, String tapse, String mpa, String rvwt, String dateUpdate);
}
