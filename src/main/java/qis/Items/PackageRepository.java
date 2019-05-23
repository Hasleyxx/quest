package qis.Items;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PackageRepository extends JpaRepository<Package, Integer> {
	@Query(value = " SELECT * from qpd_package ", nativeQuery = true)
	List<Package> listpackage();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into qpd_package(PackageName, PackagePrice, PackageDescription,"
			+ " PackageType, DeletedPackage, CreationDate, DateUpdate)"
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
	int addpackage(String name, double price, String des, String type, int del,
			String cdate, String udate);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE qpd_package SET PackagePrice = ?1, PackageDescription = ?2,"
			+ " PackageType = ?3, DeletedPackage = ?4, CreationDate = ?5,"
			+ " DateUpdate = ?6 where PackageName = 'Basic 6' ", nativeQuery = true )
	int updatepackage(double price, String des, String type, int del,
			String cdate, String udate);
}
