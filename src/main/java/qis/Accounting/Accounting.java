package qis.Accounting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_trans")
public class Accounting {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int accID;	
	 
	 private int TransactionID;
	 private int PatientID;
	 private String PaidCur;
	 private String PaidDate;
	 private String TimeLimit;
	 
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
	public String getPaidCur() {
		return PaidCur;
	}
	public void setPaidCur(String paidCur) {
		PaidCur = paidCur;
	}
	public String getPaidDate() {
		return PaidDate;
	}
	public void setPaidDate(String paidDate) {
		PaidDate = paidDate;
	}
	public String getTimeLimit() {
		return TimeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		TimeLimit = timeLimit;
	}
	
	public Accounting() { }

	public Accounting( int TransactionID, int PatientID, 
			String PaidCur, String PaidDate, String TimeLimit ) {
		
		this.setTransactionID(TransactionID);
		this.setPatientID(PatientID);
		this.setPaidCur(PaidCur);
		this.setPaidDate(PaidDate);
		this.setTimeLimit(TimeLimit);
	}
	
}
