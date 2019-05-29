package qis.Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_users")
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	private String userName;
	private String userEmail;
	private String userPass;
	private String userStatus;
	private String tokenCode;
	private String _class;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getTokenCode() {
		return tokenCode;
	}
	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	

}
