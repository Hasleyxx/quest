package qis.Users;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	
	@Query(value = " SELECT * from tbl_users", nativeQuery = true)
	List<Users> UserList();
	
	@Query(value = " SELECT * from tbl_users where userStatus = ?1", nativeQuery = true)
	List<Users> verifyUser(String user);
	
	@Query(value = "Select * from tbl_users where userID =?1" , nativeQuery = true)
	List<Users> getuserbyid(int id);
	
	@Query(value = "Select * from tbl_users where userName = ?1" , nativeQuery = true)
	List<Users> getuserbyname(String user);
	
	@Transactional
	@Modifying
	@Query(value = " INSERT into tbl_users(userName, userEmail, userPass, userStatus,"
			     + " tokenCode, _class) VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int addUser(String user, String email, String pass, String status, String cd, String cl);

	@Transactional
	@Modifying
	@Query(value = " UPDATE tbl_users Set userName = ?1, userEmail = ?2, userPass = ?3,"
				 + " userStatus = ?4, tokenCode = ?5, _class = ?6"
				 + " where userID = ?7 ", nativeQuery = true)
	int updateUser(String user, String email, String pass, String status,
			String cd, String cl, int uid);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE tbl_users Set userStatus = ?1 where userID = ?2 ", 
			nativeQuery = true)
	int updateUserStatus(String status, int uid);
	
	@Transactional
	@Modifying
	@Query(value = " UPDATE tbl_users SET userPass = ?2, userPassUpdate = ?3 WHERE userID = ?1", nativeQuery = true)
	int updateUserPassword(int userID, String userPass, String userPassUpdate);
}
