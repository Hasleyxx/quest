package qis.Classification;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PdfRepository extends JpaRepository<PdfResult, Integer>  {
	
	@Query(value = "SELECT * from qpd_pdfresult", nativeQuery = true)
	List<PdfResult> PdfList();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_pdfresult(Recipient, Title, ResultFiles, SendDate)"
				 + " VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
	int addPdf(String rec, String tle, String rf, String sd);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_pdfresult SET Receipient = ?1, Title = ?2,"
			     + " ResultFiles = ?3, SendDate = ?4 where id = 4", nativeQuery = true)
	int updatePdf(String rec, String tle, String rf, String sd);
}
