package qis.Pe;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="qpd_vital")
public class Vital {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int VitalsID;
	private int TransactionID;
	private int PatientID;
	private String height;
	private String weight;
	private String bmi;
	private String bp;
	private String pr;
	private String rr;
	private String uod;
	private String uos;
	private String cod;
	private String cos;
	private String cv;
	private String hearing;
	private String hosp;
	private String opr;
	private String pm;
	private String smoker;
	private String ad;
	private String lmp;
	private String Notes;
	@Nullable
	private String ApeID;
	private String CreationDate;
	private String DateUpdate;
	public int getVitalsID() {
		return VitalsID;
	}
	public void setVitalsID(int vitalsID) {
		VitalsID = vitalsID;
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
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBmi() {
		return bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getPr() {
		return pr;
	}
	public void setPr(String pr) {
		this.pr = pr;
	}
	public String getRr() {
		return rr;
	}
	public void setRr(String rr) {
		this.rr = rr;
	}
	public String getUod() {
		return uod;
	}
	public void setUod(String uod) {
		this.uod = uod;
	}
	public String getUos() {
		return uos;
	}
	public void setUos(String uos) {
		this.uos = uos;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getCos() {
		return cos;
	}
	public void setCos(String cos) {
		this.cos = cos;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getHearing() {
		return hearing;
	}
	public void setHearing(String hearing) {
		this.hearing = hearing;
	}
	public String getHosp() {
		return hosp;
	}
	public void setHosp(String hosp) {
		this.hosp = hosp;
	}
	public String getOpr() {
		return opr;
	}
	public void setOpr(String opr) {
		this.opr = opr;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getSmoker() {
		return smoker;
	}
	public void setSmoker(String smoker) {
		this.smoker = smoker;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getLmp() {
		return lmp;
	}
	public void setLmp(String lmp) {
		this.lmp = lmp;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
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
	public char charAt(int arg0) {
		return ApeID.charAt(arg0);
	}
	public IntStream chars() {
		return ApeID.chars();
	}
	public int codePointAt(int arg0) {
		return ApeID.codePointAt(arg0);
	}
	public int codePointBefore(int arg0) {
		return ApeID.codePointBefore(arg0);
	}
	public int codePointCount(int arg0, int arg1) {
		return ApeID.codePointCount(arg0, arg1);
	}
	public IntStream codePoints() {
		return ApeID.codePoints();
	}
	public int compareTo(String arg0) {
		return ApeID.compareTo(arg0);
	}
	public int compareToIgnoreCase(String arg0) {
		return ApeID.compareToIgnoreCase(arg0);
	}
	public String concat(String arg0) {
		return ApeID.concat(arg0);
	}
	public boolean contains(CharSequence arg0) {
		return ApeID.contains(arg0);
	}
	public boolean contentEquals(StringBuffer arg0) {
		return ApeID.contentEquals(arg0);
	}
	public boolean contentEquals(CharSequence arg0) {
		return ApeID.contentEquals(arg0);
	}
	public boolean endsWith(String arg0) {
		return ApeID.endsWith(arg0);
	}
	public boolean equals(Object arg0) {
		return ApeID.equals(arg0);
	}
	public boolean equalsIgnoreCase(String arg0) {
		return ApeID.equalsIgnoreCase(arg0);
	}
	public byte[] getBytes() {
		return ApeID.getBytes();
	}
	public byte[] getBytes(String arg0) throws UnsupportedEncodingException {
		return ApeID.getBytes(arg0);
	}
	public byte[] getBytes(Charset arg0) {
		return ApeID.getBytes(arg0);
	}
	public void getBytes(int arg0, int arg1, byte[] arg2, int arg3) {
		ApeID.getBytes(arg0, arg1, arg2, arg3);
	}
	public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
		ApeID.getChars(arg0, arg1, arg2, arg3);
	}
	public int hashCode() {
		return ApeID.hashCode();
	}
	public int indexOf(int arg0) {
		return ApeID.indexOf(arg0);
	}
	public int indexOf(String arg0) {
		return ApeID.indexOf(arg0);
	}
	public int indexOf(int arg0, int arg1) {
		return ApeID.indexOf(arg0, arg1);
	}
	public int indexOf(String arg0, int arg1) {
		return ApeID.indexOf(arg0, arg1);
	}
	public String intern() {
		return ApeID.intern();
	}
	public boolean isEmpty() {
		return ApeID.isEmpty();
	}
	public int lastIndexOf(int arg0) {
		return ApeID.lastIndexOf(arg0);
	}
	public int lastIndexOf(String arg0) {
		return ApeID.lastIndexOf(arg0);
	}
	public int lastIndexOf(int arg0, int arg1) {
		return ApeID.lastIndexOf(arg0, arg1);
	}
	public int lastIndexOf(String arg0, int arg1) {
		return ApeID.lastIndexOf(arg0, arg1);
	}
	public int length() {
		return ApeID.length();
	}
	public boolean matches(String arg0) {
		return ApeID.matches(arg0);
	}
	public int offsetByCodePoints(int arg0, int arg1) {
		return ApeID.offsetByCodePoints(arg0, arg1);
	}
	public boolean regionMatches(int arg0, String arg1, int arg2, int arg3) {
		return ApeID.regionMatches(arg0, arg1, arg2, arg3);
	}
	public boolean regionMatches(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
		return ApeID.regionMatches(arg0, arg1, arg2, arg3, arg4);
	}
	public String replace(char arg0, char arg1) {
		return ApeID.replace(arg0, arg1);
	}
	public String replace(CharSequence arg0, CharSequence arg1) {
		return ApeID.replace(arg0, arg1);
	}
	public String replaceAll(String arg0, String arg1) {
		return ApeID.replaceAll(arg0, arg1);
	}
	public String replaceFirst(String arg0, String arg1) {
		return ApeID.replaceFirst(arg0, arg1);
	}
	public String[] split(String arg0) {
		return ApeID.split(arg0);
	}
	public String[] split(String arg0, int arg1) {
		return ApeID.split(arg0, arg1);
	}
	public boolean startsWith(String arg0) {
		return ApeID.startsWith(arg0);
	}
	public boolean startsWith(String arg0, int arg1) {
		return ApeID.startsWith(arg0, arg1);
	}
	public CharSequence subSequence(int arg0, int arg1) {
		return ApeID.subSequence(arg0, arg1);
	}
	public String substring(int arg0) {
		return ApeID.substring(arg0);
	}
	public String substring(int arg0, int arg1) {
		return ApeID.substring(arg0, arg1);
	}
	public char[] toCharArray() {
		return ApeID.toCharArray();
	}
	public String toLowerCase() {
		return ApeID.toLowerCase();
	}
	public String toLowerCase(Locale arg0) {
		return ApeID.toLowerCase(arg0);
	}
	public String toString() {
		return ApeID.toString();
	}
	public String toUpperCase() {
		return ApeID.toUpperCase();
	}
	public String toUpperCase(Locale arg0) {
		return ApeID.toUpperCase(arg0);
	}
	public String trim() {
		return ApeID.trim();
	}
	
	

}
