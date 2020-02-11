package qis.Passwords;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PasswordRepository extends JpaRepository<Password, Integer> {
	@Query(value = "SELECT * FROM tbl_passwords ORDER BY id DESC LIMIT 1", nativeQuery = true)
	Password getPassword();

	@Transactional
	@Modifying
	@Query(value = " INSERT into tbl_passwords (password, creationDate) Values (?1, ?2)", nativeQuery = true)
	int addPassword(String password, String creationDate);
}
