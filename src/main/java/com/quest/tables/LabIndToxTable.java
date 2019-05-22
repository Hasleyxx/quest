package com.quest.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="qpd_trans")
@SecondaryTable(name="qpd_patient")
//@SecondaryTable(name="")

public class LabIndToxTable {


	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int PatientID;
	 private String CompanyName;
	 private String PatientName;
	 private int TransactionID;
	 private String TransactionDate;
	 private String Action;	 
	 
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}	 
	 
	 	 
}
