package qis.Microscopy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="lab_microscopy")
public class LabMicroscopy {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id  
	 private int MicroID;
	 private int TransactionID;
	 private int PatientID;
	 private String FecColor;
	 private String FecCon;
	 private String FecMicro;
	 private String FecOt;
	 private String UriColor;
	 private String UriTrans;
	 private String UriPh;
	 private String UriSp;
	 private String UriPro;
	 private String UriGlu;
	 private String RBC;
	 private String WBC;
	 private String Bac;
	 private String MThreads;
	 private String ECells;
	 private String Amorph;
	 private String CoAx;
	 private String UriOt;
	 private String LE;
	 private String NIT;
	 private String URO;
	 private String BLD;
	 private String KET;
	 private String BIL;
	 private String PregTest;
	 private String AFBVA1;
	 private String AFBVA2;
	 private String AFBR1;
	 private String AFBR2;
	 private String AFBD;
	 private String OccultBLD;
	 private String PathID;
	 private String MedID;
	 private String QualityID;
	 @Nullable
	 private String patientIdRef;
	 private String CreationDate;
	 private String DateUpdate;
	 
	public int getMicroID() {
		return MicroID;
	}
	public void setMicroID(int microID) {
		MicroID = microID;
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
	public String getFecColor() {
		return FecColor;
	}
	public void setFecColor(String fecColor) {
		FecColor = fecColor;
	}
	public String getFecCon() {
		return FecCon;
	}
	public void setFecCon(String fecCon) {
		FecCon = fecCon;
	}
	public String getFecMicro() {
		return FecMicro;
	}
	public void setFecMicro(String fecMicro) {
		FecMicro = fecMicro;
	}
	public String getFecOt() {
		return FecOt;
	}
	public void setFecOt(String fecOt) {
		FecOt = fecOt;
	}
	public String getUriColor() {
		return UriColor;
	}
	public void setUriColor(String uriColor) {
		UriColor = uriColor;
	}
	public String getUriTrans() {
		return UriTrans;
	}
	public void setUriTrans(String uriTrans) {
		UriTrans = uriTrans;
	}
	public String getUriPh() {
		return UriPh;
	}
	public void setUriPh(String uriPh) {
		UriPh = uriPh;
	}
	public String getUriSp() {
		return UriSp;
	}
	public void setUriSp(String uriSp) {
		UriSp = uriSp;
	}
	public String getUriPro() {
		return UriPro;
	}
	public void setUriPro(String uriPro) {
		UriPro = uriPro;
	}
	public String getUriGlu() {
		return UriGlu;
	}
	public void setUriGlo(String uriGlu) {
		UriGlu = uriGlu;
	}
	public String getRBC() {
		return RBC;
	}
	public void setRBC(String rBC) {
		RBC = rBC;
	}
	public String getWBC() {
		return WBC;
	}
	public void setWBC(String wBC) {
		WBC = wBC;
	}
	public String getBac() {
		return Bac;
	}
	public void setBac(String bac) {
		Bac = bac;
	}
	public String getMThreads() {
		return MThreads;
	}
	public void setMThreads(String mThreads) {
		MThreads = mThreads;
	}
	public String getECells() {
		return ECells;
	}
	public void setECells(String eCells) {
		ECells = eCells;
	}
	public String getAmorph() {
		return Amorph;
	}
	public void setAmorph(String amorph) {
		Amorph = amorph;
	}
	public String getCoAx() {
		return CoAx;
	}
	public void setCoAx(String coAx) {
		CoAx = coAx;
	}
	public String getUriOt() {
		return UriOt;
	}
	public void setUriOt(String uriOt) {
		UriOt = uriOt;
	}
	public String getLE() {
		return LE;
	}
	public void setLE(String lE) {
		LE = lE;
	}
	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nIT) {
		NIT = nIT;
	}
	public String getURO() {
		return URO;
	}
	public void setURO(String uRO) {
		URO = uRO;
	}
	public String getBLD() {
		return BLD;
	}
	public void setBLD(String bLD) {
		BLD = bLD;
	}
	public String getKET() {
		return KET;
	}
	public void setKET(String kET) {
		KET = kET;
	}
	public String getBIL() {
		return BIL;
	}
	public void setBIL(String bIL) {
		BIL = bIL;
	}
	public String getPregTest() {
		return PregTest;
	}
	public void setPregTest(String pregTest) {
		PregTest = pregTest;
	}
	public String getAFBVA1() {
		return AFBVA1;
	}
	public void setAFBVA1(String aFBVA1) {
		AFBVA1 = aFBVA1;
	}
	public String getAFBVA2() {
		return AFBVA2;
	}
	public void setAFBVA2(String aFBVA2) {
		AFBVA2 = aFBVA2;
	}
	public String getAFBR1() {
		return AFBR1;
	}
	public void setAFBR1(String aFBR1) {
		AFBR1 = aFBR1;
	}
	public String getAFBR2() {
		return AFBR2;
	}
	public void setAFBR2(String aFBR2) {
		AFBR2 = aFBR2;
	}
	public String getAFBD() {
		return AFBD;
	}
	public void setAFBD(String aFBD) {
		AFBD = aFBD;
	}
	public String getOccultBLD() {
		return OccultBLD;
	}
	public void setOccultBLD(String occultBLD) {
		OccultBLD = occultBLD;
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
	public void setDateUpdate(String dataUpdate) {
		DateUpdate = dataUpdate;
	}
	public String getPatientIdRef() {
		return patientIdRef;
	}
	public void setPatientIdRef(String patientIdRef) {
		this.patientIdRef = patientIdRef;
	}
	 
}
