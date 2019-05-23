package qis.Industrial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
@Entity
@Table(name="qpd_trans")
@SecondaryTable(name="qpd_patient")
@SecondaryTable(name="qpd_transext")
@SecondaryTable(name="qpd_items")

public class LabIndustrial {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="PatientID")
	 //table qpd_trans
	 private int id;
	 private int TransactionID;
	 private String TransactionDate;
	 private String TransactionType;
	 //table qpd_patient
	 private String LastName;
	 private String FirstName;
	 private String MiddleName;
	 private String FullName;
	 private String CompanyName;
	 private String Gender;
	 //table qpd_item
	 @Id
	 private int ItemID;
	 private String ItemName;
	 private String ItemDescription;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		this.MiddleName = middleName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		this.FullName = fullName;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	/* public String fullName()
	    {
	    	String fullname = lastName + ", " + firstName + " " + middleName;
	    	return fullname;
	    }*/

	  
}
