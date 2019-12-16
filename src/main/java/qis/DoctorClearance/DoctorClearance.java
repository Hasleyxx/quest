package qis.DoctorClearance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doc_clearance")
public class DoctorClearance {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docClearanceID;
	
	Integer patientID;
	String dataRef;
	String pastmedHis;
	String socialHis;
	String allergies;
	String prevSurgery;
	String rOs;
	String workUp;
	String assesmentPlan;
	String dateCreated;
	
	public int getDocClearanceID() {
		return docClearanceID;
	}
	public void setDocClearanceID(int docClearanceID) {
		this.docClearanceID = docClearanceID;
	}
	public Integer getPatientID() {
		return patientID;
	}
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	public String getDataRef() {
		return dataRef;
	}
	public void setDataRef(String dataRef) {
		this.dataRef = dataRef;
	}
	public String getPastmedHis() {
		return pastmedHis;
	}
	public void setPastmedHis(String pastmedHis) {
		this.pastmedHis = pastmedHis;
	}
	public String getSocialHis() {
		return socialHis;
	}
	public void setSocialHis(String socialHis) {
		this.socialHis = socialHis;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getPrevSurgery() {
		return prevSurgery;
	}
	public void setPrevSurgery(String prevSurgery) {
		this.prevSurgery = prevSurgery;
	}
	public String getrOs() {
		return rOs;
	}
	public void setrOs(String rOs) {
		this.rOs = rOs;
	}
	public String getWorkUp() {
		return workUp;
	}
	public void setWorkUp(String workUp) {
		this.workUp = workUp;
	}
	public String getAssesmentPlan() {
		return assesmentPlan;
	}
	public void setAssesmentPlan(String assesmentPlan) {
		this.assesmentPlan = assesmentPlan;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated ) {
		this.dateCreated = dateCreated;
	}
	
	
	
}
