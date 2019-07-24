package qis.Accounting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="acc_payment")
public class Accounting {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int apID;	
	 
	 private Integer TransactionID;
	 private Integer BillID;
	 private int CompanyID;
	 private double Debit;
	 private String PaymentType;
	 private String PaymentCur;
	 private String CheckNo;
	 private String Bank;
	 private String CheckDate;
	 private String PaymentDate;
	 
	public int getApID() {
		return apID;
	}
	public void setApID(int apID) {
		this.apID = apID;
	}
	public Integer getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(@Nullable Integer transactionID) {
		TransactionID = transactionID;
	}
	public Integer getBillID() {
		return BillID;
	}
	public void setBillID(@Nullable Integer billID) {
		BillID = billID;
	}
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public double getDebit() {
		return Debit;
	}
	public void setDebit(double debit) {
		Debit = debit;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getPaymentCur() {
		return PaymentCur;
	}
	public void setPaymentCur(String paymentCur) {
		PaymentCur = paymentCur;
	}
	public String getCheckNo() {
		return CheckNo;
	}
	public void setCheckNo(String checkNo) {
		CheckNo = checkNo;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getCheckDate() {
		return CheckDate;
	}
	public void setCheckDate(String checkDate) {
		CheckDate = checkDate;
	}
	 
	public String getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	
	public Accounting() {  }
	
	public Accounting(
		int transactionID, int billID, int companyID, int debit, String paymentType,
		String paymentCur, String checkNo, String bank, String checkDate, String paymentDate	
	) { 
		this.setTransactionID(transactionID);
		this.setBillID(billID);
		this.setCompanyID(companyID);
		this.setDebit(debit);
		this.setPaymentType(paymentType);
		this.setPaymentCur(paymentCur);
		this.setCheckNo(checkNo);
		this.setBank(bank);
		this.setCheckDate(checkDate);
		this.setPaymentDate(paymentDate);
	}
	
}
