package qis.Items;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.quest.tables.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{
	@Query(value = "select * from qpd_items order by ItemName asc", nativeQuery = true)
	List<Items> findAllItems();

	@Query(value = "select * from qpd_items where ItemID = :#{#id} order by ItemName", nativeQuery = true)
	List<Items> findItemById(@Param("id") int pID);
	
	@Query(value = "select * from qpd_items where ItemType LIKE '%Account%' order by ItemName", nativeQuery = true)
	List<Items> findAllAccountItems();
	
	@Query(value = "select * from qpd_items where ItemType LIKE '%Account%' and ItemID = :#{#id} order by ItemName", nativeQuery = true)
	List<Items> findAccountItemById(@Param("id") int pID);
	
	@Query(value = "SELECT * FROM qpd_items WHERE ItemType LIKE :#{#type} ORDER BY ItemName asc", nativeQuery = true)
	List<Items> findItemByType(@Param("type") String type);
	
	@Query(value = "SELECT * FROM qpd_items where ItemType != 'AccountHMO' and ItemType != 'AccountIndustrial' and DeletedItem != '1' ORDER BY ItemName asc", nativeQuery = true)
	List<Items> findAllNonAccountItems();
}
