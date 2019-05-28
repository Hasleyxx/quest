package qis.Classification;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qpd_pdfresult")
public class PdfResult {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Recipient;
	private String Title;
	private String ResultFiles;
	private String SendDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecipient() {
		return Recipient;
	}
	public void setRecipient(String recipient) {
		Recipient = recipient;
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
