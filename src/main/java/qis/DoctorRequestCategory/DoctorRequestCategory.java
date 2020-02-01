package qis.DoctorRequestCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="doc_request_category")
public class DoctorRequestCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docReqCatId;
	String category;
	@Nullable
	String status;
	public int getDocReqCatId() {
		return docReqCatId;
	}
	public void setDocReqCatId(int docReqCatId) {
		this.docReqCatId = docReqCatId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
