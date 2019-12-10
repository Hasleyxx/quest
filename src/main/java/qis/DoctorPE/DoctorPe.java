package qis.DoctorPE;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doc_pe")

public class DoctorPe {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docPeID;
	
	Integer patientID;
	String bp;
	String hr;
	String hn;
	String cl;
	String cardiac;
	String abd;
	String ext;
	String dateCreated;
	
	
	public int getDocPeID() {
		return docPeID;
	}
	public void setDocPeID(int docPeID) {
		this.docPeID = docPeID;
	}
	public Integer getPatientID() {
		return patientID;
	}
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getHr() {
		return hr;
	}
	public void setHr(String hr) {
		this.hr = hr;
	}
	public String getHn() {
		return hn;
	}
	public void setHn(String hn) {
		this.hn = hn;
	}
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	public String getCardiac() {
		return cardiac;
	}
	public void setCardiac(String cardiac) {
		this.cardiac = cardiac;
	}
	public String getAbd() {
		return abd;
	}
	public void setAbd(String abd) {
		this.abd = abd;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
	
}
