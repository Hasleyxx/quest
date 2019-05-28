package qis.Classification;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_sendemail")
public class SendEmail {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int SendEmailID;
	private int PatientID;
	private int TransactionID;
	private String RecipientsEmail;
	private String Subject;
	private String CreatedOn;
	private String CreatedBy;
	private String ModifiedOn;
	private int ModifiedBy;
	public int getSendEmailID() {
		return SendEmailID;
	}
	public void setSendEmailID(int sendEmailID) {
		SendEmailID = sendEmailID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public String getRecipientsEmail() {
		return RecipientsEmail;
	}
	public void setRecipientsEmail(String recipientsEmail) {
		RecipientsEmail = recipientsEmail;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getModifiedOn() {
		return ModifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		ModifiedOn = modifiedOn;
	}
	public int getModifiedBy() {
		return ModifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		ModifiedBy = modifiedBy;
	}
	
}
