package qis.Pe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="qpd_pe")
public class PE {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int PExamID;
	private int TransactionID;
	private int PatientID;
	private String skin;
	private String hn;
	private String cbl;
	private String ch;
	private String abdo;
	private String extre;
	private String ot;
	private String find;
	private String Doctor;
	private int License;
	@Nullable
	private String patientIdRef;
	private int userID;
	private String CreationDate;
	private String DateUpdate;
	public int getPExamID() {
		return PExamID;
	}
	public void setPExamID(int pExamID) {
		PExamID = pExamID;
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
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getHn() {
		return hn;
	}
	public void setHp(String hn) {
		this.hn = hn;
	}
	public String getCbl() {
		return cbl;
	}
	public void setCbl(String cbl) {
		this.cbl = cbl;
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}
	public String getAbdo() {
		return abdo;
	}
	public void setAbdo(String abdo) {
		this.abdo = abdo;
	}
	public String getExtre() {
		return extre;
	}
	public void setExtre(String extre) {
		this.extre = extre;
	}
	public String getOt() {
		return ot;
	}
	public void setOt(String ot) {
		this.ot = ot;
	}
	public String getFind() {
		return find;
	}
	public void setFind(String find) {
		this.find = find;
	}
	public String getDoctor() {
		return Doctor;
	}
	public void setDoctor(String doctor) {
		Doctor = doctor;
	}
	public int getLicense() {
		return License;
	}
	public void setLicense(int license) {
		License = license;
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
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	

}
