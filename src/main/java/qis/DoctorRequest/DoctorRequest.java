package qis.DoctorRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doc_request")
public class DoctorRequest {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docRequestID;
	private int patientID;
	String category;
	String test;
	String otherTest;
	String requestRef;
	String dateCreated;
	
	public int getDocRequestID() {
		return docRequestID;
	}
	public void setDocRequestID(int docRequestID) {
		this.docRequestID = docRequestID;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getOtherTest() {
		return otherTest;
	}
	public void setOtherTest(String otherTest) {
		this.otherTest = otherTest;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getRequestRef() {
		return requestRef;
	}
	public void setRequestRef(String requestRef) {
		this.requestRef = requestRef;
	}
}
