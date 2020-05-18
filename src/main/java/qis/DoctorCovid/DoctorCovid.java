package qis.DoctorCovid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doc_covid")
public class DoctorCovid {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docCovidId;
	private int patientId;
	private String result;
	private int userID;
	private String CreationDate;
	private String DateUpdate;
	
	public int getDocCovidId() {
		return docCovidId;
	}
	public void setDocCovidId(int docCovidId) {
		this.docCovidId = docCovidId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
