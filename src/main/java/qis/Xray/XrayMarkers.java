package qis.Xray;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xray_markers")
public class XrayMarkers {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int markerID;
	private int TransactionID;
	private int PatientID;
	private String xrayFilm;
	private String xrayType;
	private String radTech;
	private int totalCount;
	public int getMarkerID() {
		return markerID;
	}
	public void setMarkerID(int markerID) {
		this.markerID = markerID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getXrayFilm() {
		return xrayFilm;
	}
	public void setXrayFilm(String xrayFilm) {
		this.xrayFilm = xrayFilm;
	}
	public String getXrayType() {
		return xrayType;
	}
	public void setXrayType(String xrayType) {
		this.xrayType = xrayType;
	}
	public String getRadTech() {
		return radTech;
	}
	public void setRadTech(String radTech) {
		this.radTech = radTech;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
}
