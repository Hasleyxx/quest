package com.quest.tables;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="lab_hematology")
@SecondaryTable(name="qpd_trans")
@SecondaryTable(name="qpd_patient")
public class LabIndustrialHema {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 //@Column(name="PatientID")
	 //table qpd_trans
	 @Id
	 private int PatientID;
	 private int hemaID;
	 private int TransactionID;
	 private String WhiteBlood;
	 private String Hemoglobin;
	 private String HemoNR;
	 private String Hematocrit;
	 private String HemaNR;
	 private String Neutrophils;
	 private String Lymphocytes;
	 private String Monocytes;
	 private String CBCOt;
	 private String EOS;
	 private String BAS;
	 private String CBCRBC;
	 private String PLT;
	 private String PTime;
	 private String PTControl;
	 private String ActPercent;
	 private String INR;
	 private String PR131;
	 private String APTTime;
	 private String APTControl;
	 private String PTimeNV;
	 private String PTControlNV;
	 private String ActPercentNV;
	 private String INRNV;
	 private String APTTimeNV;
	 private String APTControlNV;
	 private String MS;
	 private String ESR;
	 private String ESRMethod;
	 private String PathID;
	 private String MedID;
	 private String QualityID;
	 private String CreationDate;
	 private String DateUpdate;
	 
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getHemaID() {
		return hemaID;	
	}
	public void setHemaID(int hemaID) {
		this.hemaID = hemaID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public String getWhiteBlood() {
		return WhiteBlood;
	}
	public void setWhiteBlood(String whiteBlood) {
		WhiteBlood = whiteBlood;
	}
	public String getHemoglobin() {
		return Hemoglobin;
	}
	public void setHemoglobin(String hemoglobin) {
		Hemoglobin = hemoglobin;
	}
	public String getHemoNR() {
		return HemoNR;
	}
	public void setHemoNR(String hemoNR) {
		HemoNR = hemoNR;
	}
	public String getHematocrit() {
		return Hematocrit;
	}
	public void setHematocrit(String hematocrit) {
		Hematocrit = hematocrit;
	}
	public String getHemaNR() {
		return HemaNR;
	}
	public void setHemaNR(String hemaNR) {
		HemaNR = hemaNR;
	}
	public String getNeutrophils() {
		return Neutrophils;
	}
	public void setNeutrophils(String neutrophils) {
		Neutrophils = neutrophils;
	}
	public String getLymphocytes() {
		return Lymphocytes;
	}
	public void setLymphocytes(String lymphocytes) {
		Lymphocytes = lymphocytes;
	}
	public String getMonocytes() {
		return Monocytes;
	}
	public void setMonocytes(String monocytes) {
		Monocytes = monocytes;
	}
	public String getCBCOt() {
		return CBCOt;
	}
	public void setCBCOt(String cBCOt) {
		CBCOt = cBCOt;
	}
	public String getEOS() {
		return EOS;
	}
	public void setEOS(String eOS) {
		EOS = eOS;
	}
	public String getBAS() {
		return BAS;
	}
	public void setBAS(String bAS) {
		BAS = bAS;
	}
	public String getCBCRBC() {
		return CBCRBC;
	}
	public void setCBCRBC(String cBCRBC) {
		CBCRBC = cBCRBC;
	}
	public String getPLT() {
		return PLT;
	}
	public void setPLT(String pLT) {
		PLT = pLT;
	}
	public String getPTime() {
		return PTime;
	}
	public void setPTime(String pTime) {
		PTime = pTime;
	}
	public String getPTControl() {
		return PTControl;
	}
	public void setPTControl(String pTControl) {
		PTControl = pTControl;
	}
	public String getActPercent() {
		return ActPercent;
	}
	public void setActPercent(String actPercent) {
		ActPercent = actPercent;
	}
	public String getINR() {
		return INR;
	}
	public void setINR(String iNR) {
		INR = iNR;
	}
	public String getPR131() {
		return PR131;
	}
	public void setPR131(String pR131) {
		PR131 = pR131;
	}
	public String getAPTTime() {
		return APTTime;
	}
	public void setAPTTime(String aPTTime) {
		APTTime = aPTTime;
	}
	public String getAPTControl() {
		return APTControl;
	}
	public void setAPTControl(String aPTControl) {
		APTControl = aPTControl;
	}
	public String getPTimeNV() {
		return PTimeNV;
	}
	public void setPTimeNV(String pTimeNV) {
		PTimeNV = pTimeNV;
	}
	public String getPTControlNV() {
		return PTControlNV;
	}
	public void setPTControlNV(String pTControlNV) {
		PTControlNV = pTControlNV;
	}
	public String getActPercentNV() {
		return ActPercentNV;
	}
	public void setActPercentNV(String actPercentNV) {
		ActPercentNV = actPercentNV;
	}
	public String getINRNV() {
		return INRNV;
	}
	public void setINRNV(String iNRNV) {
		INRNV = iNRNV;
	}
	public String getAPTTimeNV() {
		return APTTimeNV;
	}
	public void setAPTTimeNV(String aPTTimeNV) {
		APTTimeNV = aPTTimeNV;
	}
	public String getAPTControlNV() {
		return APTControlNV;
	}
	public void setAPTControlNV(String aPTControlNV) {
		APTControlNV = aPTControlNV;
	}
	public String getMS() {
		return MS;
	}
	public void setMS(String mS) {
		MS = mS;
	}
	public String getESR() {
		return ESR;
	}
	public void setESR(String eSR) {
		ESR = eSR;
	}
	public String getESRMethod() {
		return ESRMethod;
	}
	public void setESRMethod(String eSRMethod) {
		ESRMethod = eSRMethod;
	}
	public String getPathID() {
		return PathID;
	}
	public void setPathID(String pathID) {
		PathID = pathID;
	}
	public String getMedID() {
		return MedID;
	}
	public void setMedID(String medID) {
		MedID = medID;
	}
	public String getQualityID() {
		return QualityID;
	}
	public void setQualityID(String qualityID) {
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
	 
}
