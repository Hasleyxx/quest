package qis.Items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="qpd_package")
public class Package {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String PackageName;
	private double PackagePrice;
	private String PackageDescription;
	private String PackageType;
	private int DeletedPackage;
	private String CreationDate;
	private String DateUpdate;
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
	}
	public double getPackagePrice() {
		return PackagePrice;
	}
	public void setPackagePrice(double packagePrice) {
		PackagePrice = packagePrice;
	}
	public String getPackageDescription() {
		return PackageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		PackageDescription = packageDescription;
	}
	public String getPackageType() {
		return PackageType;
	}
	public void setPackageType(String packageType) {
		PackageType = packageType;
	}
	public int getDeletedPackage() {
		return DeletedPackage;
	}
	public void setDeletedPackage(int deletedPackage) {
		DeletedPackage = deletedPackage;
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
	
	
}
