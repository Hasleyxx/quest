package qis.Patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="qpd_patient")
@SecondaryTable(name="qpd_company")
public class Patient{
	
		
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	private int PatientID;
	 	private String PatientRef;
	 	private String PatientType;
	 	private String CompanyName;
	 	private String Position;
	 	private String FirstName;
	 	private String MiddleName;
	 	private String LastName;
	 	private String FullName;
	 	private String Address;
	 	private String Birthdate;
	 	private String Email;
	 	private String Age;
	 	private String Gender;
	 	private String ContactNo;
	 	private String Notes;
	 	private String SID;
	 	private String CreationDate;
	 	private String DateUpdate;
	 	private int CompanyID;
	 	
	 
		public int getPatientID() {
			return PatientID;
		}
		public void setPatientID(int patientID) {
			PatientID = patientID;
		}
		public String getPatientRef() {
			return PatientRef;
		}
		public void setPatientRef(String patientRef) {
			PatientRef = patientRef;
		}
		public String getPatientType() {
			return PatientType;
		}
		public void setPatientType(String patientType) {
			PatientType = patientType;
		}
		public String getCompanyName() {
			return CompanyName;
		}
		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}
		public String getPosition() {
			return Position;
		}
		public void setPosition(String position) {
			Position = position;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getMiddleName() {
			return MiddleName;
		}
		public void setMiddleName(String middleName) {
			MiddleName = middleName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getFullName() {
			return FullName;
		}
		public void setFullName(String fullName) {
			FullName = fullName;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getBirthdate() {
			return Birthdate;
		}
		public void setBirthdate(String birthdate) {
			Birthdate = birthdate;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getAge() {
			return Age;
		}
		public void setAge(String age) {
			Age = age;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public String getContactNo() {
			return ContactNo;
		}
		public void setContactNo(String contactNo) {
			ContactNo = contactNo;
		}
		public String getNotes() {
			return Notes;
		}
		public void setNotes(String notes) {
			Notes = notes;
		}
		public String getSID() {
			return SID;
		}
		public void setSID(String sID) {
			SID = sID;
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
		
		public int getCompanyID() {
			return CompanyID;
		}
		public void setCompanyID(int companyID) {
			CompanyID = companyID;
		}
		 	

}
