package qis.Company;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyRepository extends JpaRepository <Company, Integer> {
	@Query(value = "SELECT * from qpd_company", nativeQuery = true)
	List<Company> CompanyList();
	
	@Query(value = "Select * from qpd_company where nameCompany = ':cn' " , nativeQuery = true)
	List<Company> getCompany(String cn);
	
	/*@Query(value = " SELECT * from qpd_company where "
		     + " nameCompany LIKE CONCAT('%',:cn,'%')" , nativeQuery = true)
	List<Company> getCompany(String cn);
	*/
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO qpd_company (NameCompany, CompanyAddress)"
			+ " VALUES (?1, ?2)", nativeQuery = true)
	int addCompany(String cname, String cadd);
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_company SET NameCompany = ?1, CompanyAddress = ?2 "
			+ " WHERE CompanyID = 228", nativeQuery = true)
	int updateCompany(String cname, String cadd);

}
