package qis.Chemistry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="lab_chemistry")
public class LabIndustrialChem {

	 private int PatientID;
	 private int TransactionID;
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int chemID;
	 private int PathID;
	 private int MedID;
	 private int QualityID;
	 
	 private String FBS;
	 private String FBScon;
	 private String BUA;
	 private String BUAcon;
	 private String CREA;
	 private String CREAcon;
	 private String CHOL;
	 private String CHOLcon;
	 private String TRIG;
	 private String TRIGcon;
	 private String HDL;
	 private String HDLcon;
	 private String LDL;
	 private String LDLcon;
	 private String CH;
	 private String VLDL;
	 private String Na;
	 private String K;
	 private String Cl;
	 private String ALT;
	 private String AST;
	 private String HB;
	 private String ALP;
	 private String PSA;
	 private String RBS;
	 private String RBScon;
	 private String GGTP;
	 private String LDH;
	 private String Calcium;
	 private String Amylase;
	 private String Lipase;
	 private String InPhos;
	 private String Protein;
	 private String Albumin;
	 private String Globulin;
	 private String Magnesium;
	 private String OGTT1;
	 private String OGTT1con;
	 private String OGTT2;
	 private String OGTT2con;
	 private String OGCT;
	 private String OGCTcon;
	 private String CPKMB;
	 private String CPKMM;
	 private String totalCPK;
	 private String IonCalcium;
	 private String BILTotal;
	 private String BILDirect;
	 private String BILIndirect;
	 private String AGRatio;
	 private String CreationDate;
	 private String DateUpdate;
	 private String BUN;
	 private String BUNcon;
	 private String chemNotes;
	 @Nullable
	 private String patientIdRef;
	 
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public int getChemID() {
		return chemID;
	}
	public void setChemID(int chemID) {
		this.chemID = chemID;
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
	public String getFBS() {
		return FBS;
	}
	public void setFBS(String fBS) {
		FBS = fBS;
	}
	public String getFBScon() {
		return FBScon;
	}
	public void setFBScon(String fBScon) {
		FBScon = fBScon;
	}
	public String getBUA() {
		return BUA;
	}
	public void setBUA(String bUA) {
		BUA = bUA;
	}
	public String getBUAcon() {
		return BUAcon;
	}
	public void setBUAcon(String bUAcon) {
		BUAcon = bUAcon;
	}
	public String getCREA() {
		return CREA;
	}
	public void setCREA(String cREA) {
		CREA = cREA;
	}
	public String getCREAcon() {
		return CREAcon;
	}
	public void setCREAcon(String cREAcon) {
		CREAcon = cREAcon;
	}
	public String getCHOL() {
		return CHOL;
	}
	public void setCHOL(String cHOL) {
		CHOL = cHOL;
	}
	public String getCHOLcon() {
		return CHOLcon;
	}
	public void setCHOLcon(String cHOLcon) {
		CHOLcon = cHOLcon;
	}
	public String getTRIG() {
		return TRIG;
	}
	public void setTRIG(String tRIG) {
		TRIG = tRIG;
	}
	public String getTRIGcon() {
		return TRIGcon;
	}
	public void setTRIGcon(String tRIGcon) {
		TRIGcon = tRIGcon;
	}
	public String getHDL() {
		return HDL;
	}
	public void setHDL(String hDL) {
		HDL = hDL;
	}
	public String getHDLcon() {
		return HDLcon;
	}
	public void setHDLcon(String hDLcon) {
		HDLcon = hDLcon;
	}
	public String getLDL() {
		return LDL;
	}
	public void setLDL(String lDL) {
		LDL = lDL;
	}
	public String getLDLcon() {
		return LDLcon;
	}
	public void setLDLcon(String lDLcon) {
		LDLcon = lDLcon;
	}
	public String getCH() {
		return CH;
	}
	public void setCH(String cH) {
		CH = cH;
	}
	public String getVLDL() {
		return VLDL;
	}
	public void setVLDL(String vLDL) {
		VLDL = vLDL;
	}
	public String getNa() {
		return Na;
	}
	public void setNa(String na) {
		Na = na;
	}
	public String getK() {
		return K;
	}
	public void setK(String k) {
		K = k;
	}
	public String getCl() {
		return Cl;
	}
	public void setCl(String cl) {
		Cl = cl;
	}
	public String getALT() {
		return ALT;
	}
	public void setALT(String aLT) {
		ALT = aLT;
	}
	public String getAST() {
		return AST;
	}
	public void setAST(String aST) {
		AST = aST;
	}
	public String getHB() {
		return HB;
	}
	public void setHB(String hB) {
		HB = hB;
	}
	public String getALP() {
		return ALP;
	}
	public void setALP(String aLP) {
		ALP = aLP;
	}
	public String getPSA() {
		return PSA;
	}
	public void setPSA(String pSA) {
		PSA = pSA;
	}
	public String getRBS() {
		return RBS;
	}
	public void setRBS(String rBS) {
		RBS = rBS;
	}
	public String getRBScon() {
		return RBScon;
	}
	public void setRBScon(String rBScon) {
		RBScon = rBScon;
	}
	public String getGGTP() {
		return GGTP;
	}
	public void setGGTP(String gGTP) {
		GGTP = gGTP;
	}
	public String getLDH() {
		return LDH;
	}
	public void setLDH(String lDH) {
		LDH = lDH;
	}
	public String getCalcium() {
		return Calcium;
	}
	public void setCalcium(String calcium) {
		Calcium = calcium;
	}
	public String getAmylase() {
		return Amylase;
	}
	public void setAmylase(String amylase) {
		Amylase = amylase;
	}
	public String getLipase() {
		return Lipase;
	}
	public void setLipase(String lipase) {
		Lipase = lipase;
	}
	public String getInPhos() {
		return InPhos;
	}
	public void setInPhos(String inPhos) {
		InPhos = inPhos;
	}
	public String getProtein() {
		return Protein;
	}
	public void setProtein(String protein) {
		Protein = protein;
	}
	public String getAlbumin() {
		return Albumin;
	}
	public void setAlbumin(String albumin) {
		Albumin = albumin;
	}
	public String getGlobulin() {
		return Globulin;
	}
	public void setGlobulin(String globulin) {
		Globulin = globulin;
	}
	public String getMagnesium() {
		return Magnesium;
	}
	public void setMagnesium(String magnesium) {
		Magnesium = magnesium;
	}
	public String getOGTT1() {
		return OGTT1;
	}
	public void setOGTT1(String oGTT1) {
		OGTT1 = oGTT1;
	}
	public String getOGTT1con() {
		return OGTT1con;
	}
	public void setOGTT1con(String oGTT1con) {
		OGTT1con = oGTT1con;
	}
	public String getOGTT2() {
		return OGTT2;
	}
	public void setOGTT2(String oGTT2) {
		OGTT2 = oGTT2;
	}
	public String getOGTT2con() {
		return OGTT2con;
	}
	public void setOGTT2con(String oGTT2con) {
		OGTT2con = oGTT2con;
	}
	public String getOGCT() {
		return OGCT;
	}
	public void setOGCT(String oGCT) {
		OGCT = oGCT;
	}
	public String getOGCTcon() {
		return OGCTcon;
	}
	public void setOGCTcon(String oGCTcon) {
		OGCTcon = oGCTcon;
	}
	public String getCPKMB() {
		return CPKMB;
	}
	public void setCPKMB(String cPKMB) {
		CPKMB = cPKMB;
	}
	public String getCPKMM() {
		return CPKMM;
	}
	public void setCPKMM(String cPKMM) {
		CPKMM = cPKMM;
	}
	public String getTotalCPK() {
		return totalCPK;
	}
	public void setTotalCPK(String totalCPK) {
		this.totalCPK = totalCPK;
	}
	public String getIonCalcium() {
		return IonCalcium;
	}
	public void setIonCalcium(String ionCalcium) {
		IonCalcium = ionCalcium;
	}
	public String getBILTotal() {
		return BILTotal;
	}
	public void setBILTotal(String bILTotal) {
		BILTotal = bILTotal;
	}
	public String getBILDirect() {
		return BILDirect;
	}
	public void setBILDirect(String bILDirect) {
		BILDirect = bILDirect;
	}
	public String getBILIndirect() {
		return BILIndirect;
	}
	public void setBILIndirect(String bILIndirect) {
		BILIndirect = bILIndirect;
	}
	public String getAGRatio() {
		return AGRatio;
	}
	public void setAGRatio(String aGRatio) {
		AGRatio = aGRatio;
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
	 
	public String getBUN() {
		return BUN;
	}
	public void setBUN(String bUN) {
		BUN = bUN;
	}
	public String getBUNcon() {
		return BUNcon;
	}
	public void setBUNcon(String bUNcon) {
		BUNcon = bUNcon;
	}
	public String getChemNotes() {
		return chemNotes;
	}
	public void setChemNotes(String chemNotes) {
		this.chemNotes = chemNotes;
	}
	
	public LabIndustrialChem() {}
	public LabIndustrialChem(int patientID, int transactionID, int chemID, int pathID,
			int medID, int qualityID, String patientIdRef, String fBS, String fBScon, String bUA, String bUAcon,
			String cREA, String cREAcon, String cHOL, String cHOLcon, String tRIG, String tRIGcon,
			String hDL, String hDLcon, String lDL, String lDLcon, String cH, String vLDL,
			String na, String k, String cl, String aLT, String aST, String hB, String aLP,
			String pSA, String rBS, String rBScon, String gGTP, String lDH, String calcium,
			String amylase, String lipase, String inPhos, String protein, String albumin,
			String globulin, String magnesium, String oGTT1, String oGTT1con, String oGTT2,
			String oGTT2con, String oGCT, String oGCTcon, String cPKMB, String cPKMM,
			String totalCPK, String ionCalcium, String bILTotal, String bILDirect, String bILIndirect,
			String aGRatio, String creationDate, String dateUpdate, String bUN, String bUNcon, String chemNotes) {
		super();
		PatientID = patientID;
		TransactionID = transactionID;
		this.chemID = chemID;
		PathID = pathID;
		MedID = medID;
		QualityID = qualityID;
		patientIdRef = patientIdRef;
		FBS = fBS;
		FBScon = fBScon;
		BUA = bUA;
		BUAcon = bUAcon;
		CREA = cREA;
		CREAcon = cREAcon;
		CHOL = cHOL;
		CHOLcon = cHOLcon;
		TRIG = tRIG;
		TRIGcon = tRIGcon;
		HDL = hDL;
		HDLcon = hDLcon;
		LDL = lDL;
		LDLcon = lDLcon;
		CH = cH;
		VLDL = vLDL;
		Na = na;
		K = k;
		Cl = cl;
		ALT = aLT;
		AST = aST;
		HB = hB;
		ALP = aLP;
		PSA = pSA;
		RBS = rBS;
		RBScon = rBScon;
		GGTP = gGTP;
		LDH = lDH;
		Calcium = calcium;
		Amylase = amylase;
		Lipase = lipase;
		InPhos = inPhos;
		Protein = protein;
		Albumin = albumin;
		Globulin = globulin;
		Magnesium = magnesium;
		OGTT1 = oGTT1;
		OGTT1con = oGTT1con;
		OGTT2 = oGTT2;
		OGTT2con = oGTT2con;
		OGCT = oGCT;
		OGCTcon = oGCTcon;
		CPKMB = cPKMB;
		CPKMM = cPKMM;
		this.totalCPK = totalCPK;
		IonCalcium = ionCalcium;
		BILTotal = bILTotal;
		BILDirect = bILDirect;
		BILIndirect = bILIndirect;
		AGRatio = aGRatio;
		CreationDate = creationDate;
		DateUpdate = dateUpdate;
		BUN = bUN;
		BUNcon = bUNcon;
		this.chemNotes = chemNotes;
	}
	public String getPatientIdRef() {
		return patientIdRef;
	}
	public void setPatientIdRef(String patientIdRef) {
		this.patientIdRef = patientIdRef;
	}
	
	
	 
}
