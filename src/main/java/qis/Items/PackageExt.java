package qis.Items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_packext")
public class PackageExt {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int packExtID;
	private String PackageName;
	private int ItemID;
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
	}
	public int getPackExtID() {
		return packExtID;
	}
	public void setPackExtID(int packExtID) {
		this.packExtID = packExtID;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	
	
	
}
