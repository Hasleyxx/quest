package qis.Items;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PackExtensionRepository extends JpaRepository<PackageExt, Integer> {
	
	@Query(value = "SELECT * from qpd_packext", nativeQuery = true )
	List<PackageExt> packext();
	@Query(value = "SELECT * from qpd_packext where PackageName = :#{#packName} order by PackageName", 
			nativeQuery = true)
	List<PackageExt> findPackageById(@Param("packName") String packName);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_packext(PackageName, ItemID)"
			+ " VALUES (?1, ?2 )", nativeQuery = true)
	int addpackext(String ext, int id);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_packext SET ItemID = ?1 where "
			     + " PackageName = ?2 and packExtID = ?3 ", nativeQuery = true)
	int updatepackext(int id, String ext, int xid);
	
	
}
