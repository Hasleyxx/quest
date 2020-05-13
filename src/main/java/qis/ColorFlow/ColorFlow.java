package qis.ColorFlow;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "qpd_colorflow")
public class ColorFlow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int colorID;
	private int TransactionID;
	private int PatientID;
	private int userID;
	private String lvelocity;
	private String lpeakgrad;
	private String lvti;
	private String lvalve;
	private String lratio;
	private String ljetarea;
	private String lvc;
	private String avvelocity;
	private String avpeakgrad;
	private String avvti;
	private String avvalve;
	private String avratio;
	private String avjetarea;
	private String avvc;
	private String mvvelocity;
	private String mvpeakgrad;
	private String mvvti;
	private String mvvalve;
	private String mvratio;
	private String mvjetarea;
	private String mvvc;
	private String tvvelocity;
	private String tvpeakgrad;
	private String tvvti;
	private String tvvalve;
	private String tvratio;
	private String tvjetarea;
	private String tvvc;
	private String pvvelocity;
	private String pvpeakgrad;
	private String pvvti;
	private String pvvalve;
	private String pvratio;
	private String pvjetarea;
	private String pvvc;
	private String pat;
	private String rvat;
	private String trjet;
	private String ewave;
	private String ivrt;
	private String late;
	private String lata;
	private String mede;
	private String meda;
	private String e;
	private String a;
	private String eeratio;
	private String creationDate;
	@Nullable
	private String dateUpdate;
	
	public int getColorID() {
		return colorID;
	}
	public void setColorID(int colorID) {
		this.colorID = colorID;
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
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getLvelocity() {
		return lvelocity;
	}
	public void setLvelocity(String lvelocity) {
		this.lvelocity = lvelocity;
	}
	public String getLpeakgrad() {
		return lpeakgrad;
	}
	public void setLpeakgrad(String lpeakgrad) {
		this.lpeakgrad = lpeakgrad;
	}
	public String getLvti() {
		return lvti;
	}
	public void setLvti(String lvti) {
		this.lvti = lvti;
	}
	public String getLvalve() {
		return lvalve;
	}
	public void setLvalve(String lvalve) {
		this.lvalve = lvalve;
	}
	public String getLratio() {
		return lratio;
	}
	public void setLratio(String lratio) {
		this.lratio = lratio;
	}
	public String getLjetarea() {
		return ljetarea;
	}
	public void setLjetarea(String ljetarea) {
		this.ljetarea = ljetarea;
	}
	public String getLvc() {
		return lvc;
	}
	public void setLvc(String lvc) {
		this.lvc = lvc;
	}
	public String getAvvelocity() {
		return avvelocity;
	}
	public void setAvvelocity(String avvelocity) {
		this.avvelocity = avvelocity;
	}
	public String getAvpeakgrad() {
		return avpeakgrad;
	}
	public void setAvpeakgrad(String avpeakgrad) {
		this.avpeakgrad = avpeakgrad;
	}
	public String getAvvti() {
		return avvti;
	}
	public void setAvvti(String avvti) {
		this.avvti = avvti;
	}
	public String getAvvalve() {
		return avvalve;
	}
	public void setAvvalve(String avvalve) {
		this.avvalve = avvalve;
	}
	public String getAvratio() {
		return avratio;
	}
	public void setAvratio(String avratio) {
		this.avratio = avratio;
	}
	public String getAvjetarea() {
		return avjetarea;
	}
	public void setAvjetarea(String avjetarea) {
		this.avjetarea = avjetarea;
	}
	public String getAvvc() {
		return avvc;
	}
	public void setAvvc(String avvc) {
		this.avvc = avvc;
	}
	public String getMvvelocity() {
		return mvvelocity;
	}
	public void setMvvelocity(String mvvelocity) {
		this.mvvelocity = mvvelocity;
	}
	public String getMvpeakgrad() {
		return mvpeakgrad;
	}
	public void setMvpeakgrad(String mvpeakgrad) {
		this.mvpeakgrad = mvpeakgrad;
	}
	public String getMvvti() {
		return mvvti;
	}
	public void setMvvti(String mvvti) {
		this.mvvti = mvvti;
	}
	public String getMvvalve() {
		return mvvalve;
	}
	public void setMvvalve(String mvvalve) {
		this.mvvalve = mvvalve;
	}
	public String getMvratio() {
		return mvratio;
	}
	public void setMvratio(String mvratio) {
		this.mvratio = mvratio;
	}
	public String getMvjetarea() {
		return mvjetarea;
	}
	public void setMvjetarea(String mvjetarea) {
		this.mvjetarea = mvjetarea;
	}
	public String getMvvc() {
		return mvvc;
	}
	public void setMvvc(String mvvc) {
		this.mvvc = mvvc;
	}
	public String getTvvelocity() {
		return tvvelocity;
	}
	public void setTvvelocity(String tvvelocity) {
		this.tvvelocity = tvvelocity;
	}
	public String getTvpeakgrad() {
		return tvpeakgrad;
	}
	public void setTvpeakgrad(String tvpeakgrad) {
		this.tvpeakgrad = tvpeakgrad;
	}
	public String getTvvti() {
		return tvvti;
	}
	public void setTvvti(String tvvti) {
		this.tvvti = tvvti;
	}
	public String getTvvalve() {
		return tvvalve;
	}
	public void setTvvalve(String tvvalve) {
		this.tvvalve = tvvalve;
	}
	public String getTvratio() {
		return tvratio;
	}
	public void setTvratio(String tvratio) {
		this.tvratio = tvratio;
	}
	public String getTvjetarea() {
		return tvjetarea;
	}
	public void setTvjetarea(String tvjetarea) {
		this.tvjetarea = tvjetarea;
	}
	public String getTvvc() {
		return tvvc;
	}
	public void setTvvc(String tvvc) {
		this.tvvc = tvvc;
	}
	public String getPvvelocity() {
		return pvvelocity;
	}
	public void setPvvelocity(String pvvelocity) {
		this.pvvelocity = pvvelocity;
	}
	public String getPvpeakgrad() {
		return pvpeakgrad;
	}
	public void setPvpeakgrad(String pvpeakgrad) {
		this.pvpeakgrad = pvpeakgrad;
	}
	public String getPvvti() {
		return pvvti;
	}
	public void setPvvti(String pvvti) {
		this.pvvti = pvvti;
	}
	public String getPvvalve() {
		return pvvalve;
	}
	public void setPvvalve(String pvvalve) {
		this.pvvalve = pvvalve;
	}
	public String getPvratio() {
		return pvratio;
	}
	public void setPvratio(String pvratio) {
		this.pvratio = pvratio;
	}
	public String getPvjetarea() {
		return pvjetarea;
	}
	public void setPvjetarea(String pvjetarea) {
		this.pvjetarea = pvjetarea;
	}
	public String getPvvc() {
		return pvvc;
	}
	public void setPvvc(String pvvc) {
		this.pvvc = pvvc;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getRvat() {
		return rvat;
	}
	public void setRvat(String rvat) {
		this.rvat = rvat;
	}
	public String getTrjet() {
		return trjet;
	}
	public void setTrjet(String trjet) {
		this.trjet = trjet;
	}
	public String getEwave() {
		return ewave;
	}
	public void setEwave(String ewave) {
		this.ewave = ewave;
	}
	public String getIvrt() {
		return ivrt;
	}
	public void setIvrt(String ivrt) {
		this.ivrt = ivrt;
	}
	public String getLate() {
		return late;
	}
	public void setLate(String late) {
		this.late = late;
	}
	public String getLata() {
		return lata;
	}
	public void setLata(String lata) {
		this.lata = lata;
	}
	public String getMede() {
		return mede;
	}
	public void setMede(String mede) {
		this.mede = mede;
	}
	public String getMeda() {
		return meda;
	}
	public void setMeda(String meda) {
		this.meda = meda;
	}
	public String getEeratio() {
		return eeratio;
	}
	public void setEeratio(String eeratio) {
		this.eeratio = eeratio;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
}
