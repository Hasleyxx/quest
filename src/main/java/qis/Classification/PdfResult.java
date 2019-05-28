package qis.Classification;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_pe")
public class PdfResult {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Receipient;
	private String Title;
	private String ResultFiles;
	private String SendDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceipient() {
		return Receipient;
	}
	public void setReceipient(String receipient) {
		Receipient = receipient;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getResultFiles() {
		return ResultFiles;
	}
	public void setResultFiles(String resultFiles) {
		ResultFiles = resultFiles;
	}
	public String getSendDate() {
		return SendDate;
	}
	public void setSendDate(String sendDate) {
		SendDate = sendDate;
	}
	
}
