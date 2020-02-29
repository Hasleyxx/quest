package qis.Toxicology;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="lab_chemistry")
public class LabIndustrialToxicology {


	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int toxicID;
	 private int PatientID;
	 private int TransactionID;
	 private String Meth;
	 private String Tetra;
	 private String Drugtest;
	 private int PathID;
	 private int MedID;
	 private int QualityID;
	 @Nullable
	 private String patientIdRef;
	 private String CreationDate;
	 private String DateUpdate;
	 

	public int getToxicID() {
		return toxicID;
	}
	public void setToxicID(int toxicID) {
		this.toxicID = toxicID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getMeth() {
		return Meth;
	}
	public void setMeth(String meth) {
		Meth = meth;
	}
	public String getTetra() {
		return Tetra;
	}
	public void setTetra(String tetra) {
		Tetra = tetra;
	}
	public String getDrugtest() {
		return Drugtest;
	}
	public void setDrugtest(String drugtest) {
		Drugtest = drugtest;
	}
	public int getPathID() {
		return PathID;
	}
	public void setPathID(int pathID) {
		PathID = pathID;
	}
	public int getMedID() {
		return MedID;
	}
	public void setMedID(int medID) {
		MedID = medID;
	}
	public int getQualityID() {
		return QualityID;
	}
	public void setQualityID(int qualityID) {
		QualityID = qualityID;
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
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public String getPatientIdRef() {
		return patientIdRef;
	}
	public void setPatientIdRef(String patientIdRef) {
		this.patientIdRef = patientIdRef;
	}
	 
	 
}
