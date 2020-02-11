package qis.Passwords;

import javax.persistence.*;

@Entity
@Table(name="tbl_passwords")
public class Password {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String password;
    private String creationDate;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
}
