package qis.DoctorMedcert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doc_medcert")
public class DoctorMedcert {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int medcertID;
	
	Integer patientID;
	String due;
	String diagnosis;
	String remarks;
	String dateCreated;
	
	public int getMedcertID() {
		return medcertID;
	}
	public void setMedcertID(int medcertID) {
		this.medcertID = medcertID;
	}
	public Integer getPatientID() {
		return patientID;
	}
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
}
