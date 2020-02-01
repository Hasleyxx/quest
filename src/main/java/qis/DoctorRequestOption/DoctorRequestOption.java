package qis.DoctorRequestOption;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="doc_request_option")
public class DoctorRequestOption {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docReqOptionId;
	String option;
	@Nullable
	String status;
	int category;
	public int getDocReqOptionId() {
		return docReqOptionId;
	}
	public void setDocReqOptionId(int docReqOptionId) {
		this.docReqOptionId = docReqOptionId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
}
