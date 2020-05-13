package qis.TwodEcho;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "qpd_echo")
public class Twod {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int echoID;
	private int TransactionID;
	private int PatientID;
	private int echoCarID;
	private int qualityID;
	private int cardioID;
	private int userID;
	private String lvedd;
	private String lvedv;
	private String laap;
	private String lvesd;
	private String larl;
	private String lveddbsa;
	private String sv;
	private String lvesdbsa;
	private String co;
	private String a1;
	private String ivsd;
	private String efm;
	private String a2;
	private String ivss;
	private String efs;
	private String lavi;
	private String pwd;
	private String fs;
	private String aorta;
	private String pws;
	private String epss;
	private String lvot;
	private String lvmi;
	private String lvet;
	private String mva;
	private String rwt;
	private String rvm;
	private String tva;
	private String rarl;
	private String rvfac;
	private String rvot;
	private String rabsa;
	private String tapse;
	private String mpa;
	private String rvwt;
	
	private String creationDate;
	@Nullable
	private String dateUpdate;
	
	public int getEchoID() {
		return echoID;
	}
	public void setEchoID(int echoID) {
		this.echoID = echoID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getLvedd() {
		return lvedd;
	}
	public void setLvedd(String lvedd) {
		this.lvedd = lvedd;
	}
	public String getLvedv() {
		return lvedv;
	}
	public void setLvedv(String lvedv) {
		this.lvedv = lvedv;
	}
	public String getLaap() {
		return laap;
	}
	public void setLaap(String laap) {
		this.laap = laap;
	}
	public String getLvesd() {
		return lvesd;
	}
	public void setLvesd(String lvesd) {
		this.lvesd = lvesd;
	}
	public String getLarl() {
		return larl;
	}
	public void setLarl(String larl) {
		this.larl = larl;
	}
	public String getLveddbsa() {
		return lveddbsa;
	}
	public void setLveddbsa(String lveddbsa) {
		this.lveddbsa = lveddbsa;
	}
	public String getSv() {
		return sv;
	}
	public void setSv(String sv) {
		this.sv = sv;
	}
	public String getLvesdbsa() {
		return lvesdbsa;
	}
	public void setLvesdbsa(String lvesdbsa) {
		this.lvesdbsa = lvesdbsa;
	}
	public String getCo() {
		return co;
	}
	public void setCo(String co) {
		this.co = co;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getIvsd() {
		return ivsd;
	}
	public void setIvsd(String ivsd) {
		this.ivsd = ivsd;
	}
	public String getEfm() {
		return efm;
	}
	public void setEfm(String efm) {
		this.efm = efm;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	public String getIvss() {
		return ivss;
	}
	public void setIvss(String ivss) {
		this.ivss = ivss;
	}
	public String getEfs() {
		return efs;
	}
	public void setEfs(String efs) {
		this.efs = efs;
	}
	public String getLavi() {
		return lavi;
	}
	public void setLavi(String lavi) {
		this.lavi = lavi;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	public String getAorta() {
		return aorta;
	}
	public void setAorta(String aorta) {
		this.aorta = aorta;
	}
	public String getPws() {
		return pws;
	}
	public void setPws(String pws) {
		this.pws = pws;
	}
	public String getEpss() {
		return epss;
	}
	public void setEpss(String epss) {
		this.epss = epss;
	}
	public String getLvot() {
		return lvot;
	}
	public void setLvot(String lvot) {
		this.lvot = lvot;
	}
	public String getLvmi() {
		return lvmi;
	}
	public void setLvmi(String lvmi) {
		this.lvmi = lvmi;
	}
	public String getLvet() {
		return lvet;
	}
	public void setLvet(String lvet) {
		this.lvet = lvet;
	}
	public String getMva() {
		return mva;
	}
	public void setMva(String mva) {
		this.mva = mva;
	}
	public String getRwt() {
		return rwt;
	}
	public void setRwt(String rwt) {
		this.rwt = rwt;
	}
	public String getRvm() {
		return rvm;
	}
	public void setRvm(String rvm) {
		this.rvm = rvm;
	}
	public String getTva() {
		return tva;
	}
	public void setTva(String tva) {
		this.tva = tva;
	}
	public String getRarl() {
		return rarl;
	}
	public void setRarl(String rarl) {
		this.rarl = rarl;
	}
	public String getRvfac() {
		return rvfac;
	}
	public void setRvfac(String rvfac) {
		this.rvfac = rvfac;
	}
	public String getRvot() {
		return rvot;
	}
	public void setRvot(String rvot) {
		this.rvot = rvot;
	}
	public String getRabsa() {
		return rabsa;
	}
	public void setRabsa(String rabsa) {
		this.rabsa = rabsa;
	}
	public String getTapse() {
		return tapse;
	}
	public void setTapse(String tapse) {
		this.tapse = tapse;
	}
	public String getMpa() {
		return mpa;
	}
	public void setMpa(String mpa) {
		this.mpa = mpa;
	}
	public String getRvwt() {
		return rvwt;
	}
	public void setRvwt(String rvwt) {
		this.rvwt = rvwt;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public int getEchoCarID() {
		return echoCarID;
	}
	public void setEchoCarID(int echoCarID) {
		this.echoCarID = echoCarID;
	}
	public int getQualityID() {
		return qualityID;
	}
	public void setQualityID(int qualityID) {
		this.qualityID = qualityID;
	}
	public int getCardioID() {
		return cardioID;
	}
	public void setCardioID(int cardioID) {
		this.cardioID = cardioID;
	}
}
