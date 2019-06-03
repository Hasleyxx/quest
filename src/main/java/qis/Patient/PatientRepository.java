package qis.Patient;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface PatientRepository extends JpaRepository <Patient , Integer> {
	
	@Query(value = "SELECT p.*, CONCAT (p.FirstName ,' ', p.MiddleName,' ', p.LastName) as FullName,"
			+ " (CASE when c.CompanyID is null then 0"
			+ " ELSE c.CompanyID END) as CompanyID "
			+ " FROM qpd_patient p left join qpd_company c"
			+ " on p.CompanyName = c.NameCompany ", nativeQuery = true)
	List<Patient> findPatient();
	
	@Query(value =  "SELECT p.*, CONCAT (p.FirstName ,' ', p.MiddleName,' ', p.LastName) as FullName,"
			+ " (CASE when c.CompanyID is null then 0"
			+ " ELSE c.CompanyID END) as CompanyID "
			+ " FROM qpd_patient p left join qpd_company c"
			+ " on p.CompanyName = c.NameCompany where PatientID = ?1" , nativeQuery = true)
	List<Patient> PatientID(int id);
	
	@Query(value =  "SELECT p.*, CONCAT (p.FirstName ,' ', p.MiddleName,' ', p.LastName) as FullName,"
			+ " (CASE when c.CompanyID is null then 0"
			+ " ELSE c.CompanyID END) as CompanyID "
			+ " FROM qpd_patient p left join qpd_company c"
			+ " on p.CompanyName = c.NameCompany where PatientRef = ?1" , nativeQuery = true)
	List<Patient> checkRef(int ref);

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
	@Query(value = " UPDATE qpd_patient SET PatientType = ?1, CompanyName = ?2, Position = ?3,"
			+ " FirstName = ?4, MiddleName = ?5, LastName = ?6, Address = ?7,"
			+ " Birthdate = ?8, Email = ?9, Age = ?10, Gender = ?11, ContactNo = ?12,"
			+ " PatientBiller = ?13, Notes = ?14, SID = ?15, CreationDate = ?16, DateUpdate = ?17"
			+ " WHERE PatientID = ?18", nativeQuery = true)
	int updatePatient(String pType, String com, String pos, String fn, String mn,
			String ln, String add, String bdate, String email, int age, String gen, String no,
			String biller, String notes, String sid, String cdate, String udate, int pid);
}
