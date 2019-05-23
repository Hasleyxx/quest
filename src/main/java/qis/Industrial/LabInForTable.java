package qis.Industrial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="qpd_trans")
@SecondaryTable(name="lab_hematology")
@SecondaryTable(name="lab_microscopy")
@SecondaryTable(name="lab_toxicolgy")
@SecondaryTable(name="lab_serology")

public class LabInForTable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 //lab_hematology
	 private String WhiteBlood;
	 private String Hemoglobin;
	 private String HemoNR;
	 private String Hematocrit;
	 private String HemaNR;
	 private String Neutrophils;
	 private String Lymphocytes;
	 private String Monocytes;
	 private String CBCOt;
	 
	 //lab_microscopy
	 private String FecColor;
	 private String FecCon;
	 private String FecMicro;
	 private String FecOt;
	 private String UriColor;
	 private String UriTrans;
	 private String UriPh;
	 private String Sp;
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
	 private String PregTest;
	 
	 //lab_toxicology
	 private String Meth;
	 private String Tetra;
	 private String Drugtest;
	 
	 //lab_sorology
	 private String HBsAG;
	 private String SeroOt;
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
	public String getSp() {
		return Sp;
	}
	public void setSp(String sp) {
		Sp = sp;
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
	public void setUriGlu(String uriGlu) {
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
	public String getPregTest() {
		return PregTest;
	}
	public void setPregTest(String pregTest) {
		PregTest = pregTest;
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
	public String getHBsAG() {
		return HBsAG;
	}
	public void setHBsAG(String hBsAG) {
		HBsAG = hBsAG;
	}
	public String getSeroOt() {
		return SeroOt;
	}
	public void setSeroOt(String seroOt) {
		SeroOt = seroOt;
	}
	 
}
