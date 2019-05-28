package qis.Classification;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_class")
public class Classification {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ClassID;
	private int TransactionID;
	private int PatientID;
	private String MedicalClass;
	private String Notes;
	private String QC;
	private int QCLicense;
	private String CreationDate;
	public int getClassID() {
		return ClassID;
	}
	public void setClassID(int classID) {
		ClassID = classID;
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
	public String getMedicalClass() {
		return MedicalClass;
	}
	public void setMedicalClass(String medicalClass) {
		MedicalClass = medicalClass;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getQC() {
		return QC;
	}
	public void setQC(String qC) {
		QC = qC;
	}
	public int getQCLicense() {
		return QCLicense;
	}
	public void setQCLicense(int qCLicense) {
		QCLicense = qCLicense;
	}
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	
	
	

}
