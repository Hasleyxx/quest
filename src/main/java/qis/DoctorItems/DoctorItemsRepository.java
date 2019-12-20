package qis.DoctorItems;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorItemsRepository extends JpaRepository <DoctorItems, Integer> {
	@Query(value = "SELECT * from doc_items", nativeQuery = true)
	List<DoctorItems> doctorItems();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT INTO doc_items (generic, medicine, dosage)"
			+ " VALUES (?1, ?2, ?3)", nativeQuery = true)
	int addDocItems(String generic, String medicine, String dosage);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE doc_items SET generic = ?1, medicine = ?2 "
			+ ", dosage = ?3 WHERE docItemId = ?4", nativeQuery = true)
	int updateDoctorItems(String generic, String medicine, String dosage, int docItemId);
}
