package com.quest.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lab_chemistry")
public class LabIndustrialSerology {


	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int seroID;
	 private int TransactionID;
	 private int PatientID;
	 
	 private String HBsAG;
	 private String AntiHav;
	 private String SeroOt;
	 private String VDRL;
	 private String PSAnti;
	 private String AntiHBS;
	 private String HBeAG;
	 private String AntiHBE;
	 private String AntiHBC;
	 private String TYDOTIgM;
	 private String TYDOTIgG;
	 private String CEA;
	 private String AFP;
	 private String CA125;
	 private String CA19;
	 private String CA15;
	 private String TSH;
	 private String FT3;
	 private String FT4;
	 private String CRPdil;
	 private String CRPRes;
	 private String HIV1;
	 private String HIV2;
	 
	 private int PathID;
	 private int MedID;
	 private int QualityID;
	 private String CreationDate;
	 private String DateUpdate;
	public int getSeroID() {
		return seroID;
	}
	public void setSeroID(int seroID) {
		this.seroID = seroID;
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
	public String getHBsAG() {
		return HBsAG;
	}
	public void setHBsAG(String hBsAG) {
		HBsAG = hBsAG;
	}
	public String getAntiHav() {
		return AntiHav;
	}
	public void setAntiHav(String antiHav) {
		AntiHav = antiHav;
	}
	public String getSeroOt() {
		return SeroOt;
	}
	public void setSeroOt(String seroOt) {
		SeroOt = seroOt;
	}
	public String getVDRL() {
		return VDRL;
	}
	public void setVDRL(String vDRL) {
		VDRL = vDRL;
	}
	public String getPSAnti() {
		return PSAnti;
	}
	public void setPSAnti(String pSAnti) {
		PSAnti = pSAnti;
	}
	public String getAntiHBS() {
		return AntiHBS;
	}
	public void setAntiHBS(String antiHBS) {
		AntiHBS = antiHBS;
	}
	public String getHBeAG() {
		return HBeAG;
	}
	public void setHBeAG(String hBeAG) {
		HBeAG = hBeAG;
	}
	public String getAntiHBE() {
		return AntiHBE;
	}
	public void setAntiHBE(String antiHBE) {
		AntiHBE = antiHBE;
	}
	public String getAntiHBC() {
		return AntiHBC;
	}
	public void setAntiHBC(String antiHBC) {
		AntiHBC = antiHBC;
	}
	public String getTYDOTIgM() {
		return TYDOTIgM;
	}
	public void setTYDOTIgM(String tYDOTIgM) {
		TYDOTIgM = tYDOTIgM;
	}
	public String getTYDOTIgG() {
		return TYDOTIgG;
	}
	public void setTYDOTIgG(String tYDOTIgG) {
		TYDOTIgG = tYDOTIgG;
	}
	public String getCEA() {
		return CEA;
	}
	public void setCEA(String cEA) {
		CEA = cEA;
	}
	public String getAFP() {
		return AFP;
	}
	public void setAFP(String aFP) {
		AFP = aFP;
	}
	public String getCA125() {
		return CA125;
	}
	public void setCA125(String cA125) {
		CA125 = cA125;
	}
	public String getCA19() {
		return CA19;
	}
	public void setCA19(String cA19) {
		CA19 = cA19;
	}
	public String getCA15() {
		return CA15;
	}
	public void setCA15(String cA15) {
		CA15 = cA15;
	}
	public String getTSH() {
		return TSH;
	}
	public void setTSH(String tSH) {
		TSH = tSH;
	}
	public String getFT3() {
		return FT3;
	}
	public void setFT3(String fT3) {
		FT3 = fT3;
	}
	public String getFT4() {
		return FT4;
	}
	public void setFT4(String fT4) {
		FT4 = fT4;
	}
	public String getCRPdil() {
		return CRPdil;
	}
	public void setCRPdil(String cRPdil) {
		CRPdil = cRPdil;
	}
	public String getCRPRes() {
		return CRPRes;
	}
	public void setCRPRes(String cRPRes) {
		CRPRes = cRPRes;
	}
	public String getHIV1() {
		return HIV1;
	}
	public void setHIV1(String hIV1) {
		HIV1 = hIV1;
	}
	public String getHIV2() {
		return HIV2;
	}
	public void setHIV2(String hIV2) {
		HIV2 = hIV2;
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
	  
	 
}
