package qis.Company;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository <Company, Integer> {
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
