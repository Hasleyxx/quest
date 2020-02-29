package qis.Pe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity 
@Table(name="qpd_medhis")
public class MedicalHistory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int MedHisID;
	private int TransactionID;
	private int PatientID;
	private String asth;
	private String tb;
	private String dia;
	private String hb;
	private String hp;
	private String kp;
	private String ab;
	private String jbs;
	private String pp;
	private String mh;
	private String fs;
	private String alle;
	private String ct;
	private String hep;
	private String std;
	@Nullable
	private String patientIdRef;
	private String CreationDate;
	private String DateUpdate;
	public int getMedHisID() {
		return MedHisID;
	}
	public void setMedHisID(int medHisID) {
		MedHisID = medHisID;
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
	public String getAsth() {
		return asth;
	}
	public void setAsth(String asth) {
		this.asth = asth;
	}
	public String getTb() {
		return tb;
	}
	public void setTb(String tb) {
		this.tb = tb;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHb() {
		return hb;
	}
	public void setHb(String hb) {
		this.hb = hb;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getKp() {
		return kp;
	}
	public void setKp(String kp) {
		this.kp = kp;
	}
	public String getAb() {
		return ab;
	}
	public void setAb(String ab) {
		this.ab = ab;
	}
	public String getJbs() {
		return jbs;
	}
	public void setJbs(String jbs) {
		this.jbs = jbs;
	}
	public String getPp() {
		return pp;
	}
	public void setPp(String pp) {
		this.pp = pp;
	}
	public String getMh() {
		return mh;
	}
	public void setMh(String mh) {
		this.mh = mh;
	}
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	public String getAlle() {
		return alle;
	}
	public void setAlle(String alle) {
		this.alle = alle;
	}
	public String getCt() {
		return ct;
	}
	public void setCt(String ct) {
		this.ct = ct;
	}
	public String getHep() {
		return hep;
	}
	public void setHep(String hep) {
		this.hep = hep;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	public String getDateUpdate() {
		return DateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		DateUpdate = dateUpdate;
	}
	public String getPatientIdRef() {
		return patientIdRef;
	}
	public void setPatientIdRef(String patientIdRef) {
		this.patientIdRef = patientIdRef;
	}
	
}
