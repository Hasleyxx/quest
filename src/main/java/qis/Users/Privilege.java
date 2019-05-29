package qis.Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_privilege")
public class Privilege {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int privID;
	private int UserID;
	private int Doctor;
	private int CashierAccount;
	private int CashierCash;
	private int Medical;
	private int Laboratory;
	private int Imaging;
	private int QualityControl;
	private int Admin;
	public int getPrivID() {
		return privID;
	}
	public void setPrivID(int privID) {
		this.privID = privID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getDoctor() {
		return Doctor;
	}
	public void setDoctor(int doctor) {
		Doctor = doctor;
	}
	public int getCashierAccount() {
		return CashierAccount;
	}
	public void setCashierAccount(int cashierAccount) {
		CashierAccount = cashierAccount;
	}
	public int getCashierCash() {
		return CashierCash;
	}
	public void setCashierCash(int cashierCash) {
		CashierCash = cashierCash;
	}
	public int getMedical() {
		return Medical;
	}
	public void setMedical(int medical) {
		Medical = medical;
	}
	public int getLaboratory() {
		return Laboratory;
	}
	public void setLaboratory(int laboratory) {
		Laboratory = laboratory;
	}
	public int getImaging() {
		return Imaging;
	}
	public void setImaging(int imaging) {
		Imaging = imaging;
	}
	public int getQualityControl() {
		return QualityControl;
	}
	public void setQualityControl(int qualityControl) {
		QualityControl = qualityControl;
	}
	public int getAdmin() {
		return Admin;
	}
	public void setAdmin(int admin) {
		Admin = admin;
	}
	
}
