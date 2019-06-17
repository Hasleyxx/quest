package qis.Transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;


@Entity
@Table(name="qpd_transext")
public class TransExt {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int transExtID;
	 private int TransactionID;
	 private Integer ItemID;
	 private String PackageName;
	 private int ItemQTY;
	 private int ItemDisc;
	 
	
	public int getTransExtID() {
		return transExtID;
	}
	public void setTransExtID(int transExtID) {
		this.transExtID = transExtID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public Integer getItemID() {
		return ItemID;
	}
	public void setItemID(@Nullable Integer itemID) {		
        ItemID = itemID;
	}
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(@Nullable String packageName) {		
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
