package qis.Personnel;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LabPersonnelRepository extends JpaRepository <LabPersonnel, Integer> {
	@Query(value = "Select * from lab_personnel where personnelID =?1" , nativeQuery = true)
	List<LabPersonnel> getpersonnelbyid(int id);
	
	@Query(value = "Select * from lab_personnel" , nativeQuery = true)
	List<LabPersonnel> getpersonnel();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into lab_personnel(FirstName, MiddleName, LastName,"
				 + " LicenseNO, Position, PositionEXT)"
				 + " VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addPersonnel(String fn, String mn, String ln, String no, String po, String ext);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE lab_personnel SET FirstName = ?1, MiddleName = ?2, LastName = ?3,"
				 + " LicenseNO = ?4, Position = ?5, PositionEXT = ?6"
				 + " where personnelID = ?7", nativeQuery = true)
	int updatePersonnel(String fn, String mn, String ln, String no, String po, String ext, int pid);
}
