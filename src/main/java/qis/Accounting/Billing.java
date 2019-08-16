package qis.Accounting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_billing")
public class Billing {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int BillID;
	 
	 private int CompanyID;
	 private String Address;
	 private String soaCode;
	 private String fromDate;
	 private String toDate;
	 private String soaDate;
	 private String transIds;
	 private String Attention;
	 private String Prepared;
	 private String Verified;
	 private String Validated;
	 
	
	public int getBillID() {
		return BillID;
	}
	public void setBillID(int billID) {
		BillID = billID;
	}
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getSoaCode() {
		return soaCode;
	}
	public void setSoaCode(String soaCode) {
		this.soaCode = soaCode;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSoaDate() {
		return soaDate;
	}
	public void setSoaDate(String soaDate) {
		this.soaDate = soaDate;
	}
	public String getTransIds() {
		return transIds;
	}
	public void setTransIds(String transIds) {
		this.transIds = transIds;
	}
	public String getAttention() {
		return Attention;
	}
	public void setAttention(String attention) {
		Attention = attention;
	}
	
	public String getPrepared() {
		return Prepared;
	}
	public void setPrepared(String prepared) {
		Prepared = prepared;
	}
	public String getVerified() {
		return Verified;
	}
	public void setVerified(String verified) {
		Verified = verified;
	}
	public String getValidated() {
		return Validated;
	}
	public void setValidated(String validated) {
		Validated = validated;
	}
	 
}
