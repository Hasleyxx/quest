package qis.DoctorTransaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "doc_trans")
public class DocTransaction {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionDocId;
	private String transactionRef;
	private int userId;
	private int patientId;
	private String totalPrice;
	private double paidIn;
	private double paidOut;
	private double grandTotal;
	private int status;
	private String salesType;
	@Nullable
	private String itemId;
	private String transactionDocDate;
	private String date_paid;
	
	public int getTransactionDocId() {
		return transactionDocId;
	}
	public void setTransactionDocId(int transactionDocId) {
		this.transactionDocId = transactionDocId;
	}
	public String getTransactionRef() {
		return transactionRef;
	}
	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getPaidIn() {
		return paidIn;
	}
	public void setPaidIn(double paidIn) {
		this.paidIn = paidIn;
	}
	public double getPaidOut() {
		return paidOut;
	}
	public void setPaidOut(double paidOut) {
		this.paidOut = paidOut;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSalesType() {
		return salesType;
	}
	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}
	public String getTransactionDocDate() {
		return transactionDocDate;
	}
	public void setTransactionDocDate(String transactionDocDate) {
		this.transactionDocDate = transactionDocDate;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getDate_paid() {
		return date_paid;
	}
	public void setDate_paid(String date_paid) {
		this.date_paid = date_paid;
	}
}
