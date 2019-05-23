package qis.Company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="qpd_company")
public class Company {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 	private int CompanyID;
	String NameCompany;
	String CompanyAddress;
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getNameCompany() {
		return NameCompany;
	}
	public void setNameCompany(String nameCompany) {
		NameCompany = nameCompany;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	

}
