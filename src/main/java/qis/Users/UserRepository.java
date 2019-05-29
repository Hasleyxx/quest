package qis.Users;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer> {
	@Query(value = " SELECT * from tbl_users", nativeQuery = true)
	List<Users> UserList();
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into tbl_users(userName, userEmail, userPass, userStatus,"
			     + " tokenCode, _class) VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addUser(String user, String email, String pass, String status, String cd, String cl);

	@Transactional
	@Modifying
	@Query(value = " UPDATE tbl_users SET userName = ?1, userEmail = ?2, userPass = ?3,"
			     + " userStatus = ?4, tokenCode = ?5, _class = ?6"
			     + " where userID = 21 ", nativeQuery = true)
	int updateUser(String user, String email, String pass, String status, String cd, String cl);
}
