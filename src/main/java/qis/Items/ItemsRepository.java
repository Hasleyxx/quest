package qis.Items;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_items (ItemName, ItemPrice, ItemDescription, "
			+ " ItemType, DeletedItem, NeededTest, CreationDate, DateUpdate)"
			+ " Values (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
	int addItem(String iname, double iprice, String des, String type, int del, int test,
			String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE qpd_items set ItemName = ?1, ItemPrice = ?2, ItemDescription = ?3,"
			+ " ItemType = ?4, DeletedItem = ?5, NeededTest = ?6, CreationDate = ?7,"
			+ " DateUpdate = ?8 where ItemId = 1191 ", nativeQuery = true )
	int updateItem(String iname, double iprice, String des, String type, int del, int test,
			String cdate, String udate);
	
}
