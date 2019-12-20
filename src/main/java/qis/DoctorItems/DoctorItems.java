package qis.DoctorItems;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="doc_items")
public class DoctorItems {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docItemId;
	String generic;
	@Nullable
	String medicine;
	@Nullable
	String dosage;
	
	public int getDocItemId() {
		return docItemId;
	}
	public void setDocItemId(int docItemId) {
		this.docItemId = docItemId;
	}
	public String getGeneric() {
		return generic;
	}
	public void setGeneric(String generic) {
		this.generic = generic;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
}
