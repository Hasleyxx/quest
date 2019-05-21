package qis.Cashier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.quest.tables.Cashier1;

public interface CashierPatientRepository extends JpaRepository <Cashier1 , Integer> {
	@Query(value = "SELECT *, CONCAT (p.LastName ,', ', p.FirstName,' ', p.MiddleName) as FullName"
			+ " FROM qpd_patient p", nativeQuery = true)
	List<Cashier1> findPatient();

	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_patient (PatientRef, PatientType, CompanyName, Position,"
			+ " FirstName, MiddleName, LastName, Address, Birthdate, Email, Age, Gender, ContactNo,"
			+ " PatientBiller, Notes, SID, CreationDate, DateUpdate)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16,"
			+ " ?17, ?18)", nativeQuery = true)
	int addPatient(String pRef, String pType, String com, String pos, String fn, String mn, String ln, 
			String add, String bdate, String email, int age, String gen, String no, String biller,
			String notes, String sid, String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_patient SET PatientRef = ?1, PatientType = ?2, CompanyName = ?3,"
			+ " Position = ?4, FirstName = ?5, MiddleName = ?6, LastName = ?7, Address = ?8,"
			+ " Birthdate = ?9, Email = ?10, Age = ?11, Gender = ?12, ContactNo = ?13,"
			+ " PatientBiller = ?14, Notes = ?15, SID = ?16, CreationDate = ?17, DateUpdate = ?18"
			+ " WHERE PatientID = 1335 ", nativeQuery = true)
	int updatePatient(String pRef, String pType, String com, String pos, String fn, String mn, String ln, 
			String add, String bdate, String email, int age, String gen, String no, String biller,
			String notes, String sid, String cdate, String udate);
}
