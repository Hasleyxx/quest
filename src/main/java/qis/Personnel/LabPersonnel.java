package qis.Personnel;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("\n----- Employee Information-----\n");
	        sb.append("ID: " + getPersonnelID() + "\n");
	        sb.append("Name: " + getFirstName() + "\n");
	        sb.append("Age: " + getMiddleName() + "\n");
	        sb.append("Salary: $" + getLastName() + "\n");
	        sb.append("Designation: " + getLicenseNO() + "\n");
	        sb.append("Phone Numbers: " + getPosition() + "\n");
	        sb.append("Address: " + getPositionEXT() + "\n");
	       	        sb.append("*****************************");
	        return sb.toString();
	    }
}


