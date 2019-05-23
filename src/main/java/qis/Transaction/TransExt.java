package qis.Transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="qpd_transext")
public class TransExt {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int TransactionID;
	 private int ItemID;
	 private String PackageName;
	 private int ItemQTY;
	 private int ItemDisc;
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
	}
	public int getItemQTY() {
		return ItemQTY;
	}
	public void setItemQTY(int itemQTY) {
		ItemQTY = itemQTY;
	}
	public int getItemDisc() {
		return ItemDisc;
	}
	public void setItemDisc(int itemDisc) {
		ItemDisc = itemDisc;
	}
	 
}
