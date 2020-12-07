package com.bonvoyage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bonvoyage.models.Users;

public interface UserRepository extends JpaRepository<Users, String> {
	
	@Query(value="select count(*) from Users u where u.user_email=:user_email and u.user_password=:user_password")
	int loginUser(@Param("user_email") String user_email, @Param("user_password") String user_password);

}
