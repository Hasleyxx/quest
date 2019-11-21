package qis.DoctorPatient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doc_patient")
public class DoctorPatient {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docPatientID;
	
	Integer patientID;
	String famHis;
	String pastmedHis;
	String allergies;
	String medication;
	String dateCreated;
	
	public int getDocPatientID() {
		return docPatientID;
	}
	public void setDocPatientID(int docPatientID) {
		this.docPatientID = docPatientID;
	}
	public Integer getPatientID() {
		return patientID;
	}
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	public String getFamHis() {
		return famHis;
	}
	public void setFamHis(String famHis) {
		this.famHis = famHis;
	}
	public String getPastmedHis() {
		return pastmedHis;
	}
	public void setPastmedHis(String pastmedHis) {
		this.pastmedHis = pastmedHis;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
	
	
	
	
	
	
	
	
}
