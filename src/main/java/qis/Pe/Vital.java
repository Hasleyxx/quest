package qis.Pe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_vital")
public class Vital {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int VitalsID;
	private int TransactionID;
	private int PatientID;
	private String height;
	private String weight;
	private String bmi;
	private String bp;
	private String pr;
	private String rr;
	private String uod;
	private String uos;
	private String cod;
	private String cos;
	private String cv;
	private String hearing;
	private String hosp;
	private String opr;
	private String pm;
	private String smoker;
	private String ad;
	private String lmp;
	private String Notes;
	private String CreationDate;
	private String DateUpdate;
	public int getVitalsID() {
		return VitalsID;
	}
	public void setVitalsID(int vitalsID) {
		VitalsID = vitalsID;
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
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBmi() {
		return bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getPr() {
		return pr;
	}
	public void setPr(String pr) {
		this.pr = pr;
	}
	public String getRr() {
		return rr;
	}
	public void setRr(String rr) {
		this.rr = rr;
	}
	public String getUod() {
		return uod;
	}
	public void setUod(String uod) {
		this.uod = uod;
	}
	public String getUos() {
		return uos;
	}
	public void setUos(String uos) {
		this.uos = uos;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getCos() {
		return cos;
	}
	public void setCos(String cos) {
		this.cos = cos;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getHearing() {
		return hearing;
	}
	public void setHearing(String hearing) {
		this.hearing = hearing;
	}
	public String getHosp() {
		return hosp;
	}
	public void setHosp(String hosp) {
		this.hosp = hosp;
	}
	public String getOpr() {
		return opr;
	}
	public void setOpr(String opr) {
		this.opr = opr;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getSmoker() {
		return smoker;
	}
	public void setSmoker(String smoker) {
		this.smoker = smoker;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getLmp() {
		return lmp;
	}
	public void setLmp(String lmp) {
		this.lmp = lmp;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
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
	
	

}
