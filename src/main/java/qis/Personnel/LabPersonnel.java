package qis.Personnel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lab_personnel")
public class LabPersonnel {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id  
	 private String personnelID;
	 private String FirstName;
	 private String MiddleName;
	 private String LastName;
	 private String LicenseNO;
	 private String Position;
	 private String PositionEXT;
	public String getPersonnelID() {
		return personnelID;
	}
	public void setPersonnelID(String personnelID) {
		this.personnelID = personnelID;
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
	public String getLicenseNO() {
		return LicenseNO;
	}
	public void setLicenseNO(String licenseNO) {
		LicenseNO = licenseNO;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getPositionEXT() {
		return PositionEXT;
	}
	public void setPositionEXT(String positionEXT) {
		PositionEXT = positionEXT;
	}
	 
}
