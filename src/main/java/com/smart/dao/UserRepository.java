package com.smart.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("select u from User u Where u.email = :email")
   public User getUserByUserName(@Param("email") String email);

//	public com.smart.entities.User save(com.smart.entities.@Valid User user);
}
