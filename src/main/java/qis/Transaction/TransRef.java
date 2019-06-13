package qis.Transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="qpd_transref")
public class TransRef {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int TransactionID;
	 private int PatientID;
	 private int XRay;
	 private int Blood;
	 private int Urine;
	 private int Stool;
	 private int PhysicalExam;
	 private int Specimen;
	 private int Ultrasound;
	 private int ECG;
	 private int Others;
	 private int _2dEcho;
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
	public int getXRay() {
		return XRay;
	}
	public void setXRay(int xRay) {
		XRay = xRay;
	}
	public int getBlood() {
		return Blood;
	}
	public void setBlood(int blood) {
		Blood = blood;
	}
	public int getUrine() {
		return Urine;
	}
	public void setUrine(int urine) {
		Urine = urine;
	}
	public int getStool() {
		return Stool;
	}
	public void setStool(int stool) {
		Stool = stool;
	}
	public int getPhysicalExam() {
		return PhysicalExam;
	}
	public void setPhysicalExam(int physicalExam) {
		PhysicalExam = physicalExam;
	}
	public int getSpecimen() {
		return Specimen;
	}
	public void setSpecimen(int specimen) {
		Specimen = specimen;
	}
	public int getUltrasound() {
		return Ultrasound;
	}
	public void setUltrasound(int ultrasound) {
		Ultrasound = ultrasound;
	}
	public int getECG() {
		return ECG;
	}
	public void setECG(int eCG) {
		ECG = eCG;
	}
	public int getOthers() {
		return Others;
	}
	public void setOthers(int others) {
		Others = others;
	}
	public int get_2dEcho() {
		return _2dEcho;
	}
	public void set_2dEcho(int _2dEcho) {
		this._2dEcho = _2dEcho;
	}
	
	
	 
}
