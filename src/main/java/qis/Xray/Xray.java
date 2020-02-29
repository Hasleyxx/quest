package qis.Xray;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="qpd_xray")
public class Xray {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int XrayID;
	private int TransactionID;
	private int PatientID;
	private String Comment;
	private String Impression;
	private String Radiologist;
	private String QA;
	private String imgXray;
	@Nullable
	private String patientIdRef;
	private int userID;
	private String CreationDate;
	private String DateUpdate;
	public int getXrayID() {
		return XrayID;
	}
	public void setXrayID(int xrayID) {
		XrayID = xrayID;
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
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getImpression() {
		return Impression;
	}
	public void setImpression(String impression) {
		Impression = impression;
	}
	public String getRadiologist() {
		return Radiologist;
	}
	public void setRadiologist(String radiologist) {
		Radiologist = radiologist;
	}
	public String getQA() {
		return QA;
	}
	public void setQA(String qA) {
		QA = qA;
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
	public String getImgXray() {
		return imgXray;
	}
	public void setImgXray(String imgXray) {
		this.imgXray = imgXray;
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
