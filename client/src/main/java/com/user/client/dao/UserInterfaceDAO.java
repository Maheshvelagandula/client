package com.user.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.user.client.entity.User;

public interface UserInterfaceDAO extends JpaRepository<User, Integer>{
	
	@Query("from com.captsone.cloths.entity.User u where u.email=:em and u.password=:pw")
	User loginDAO(@Param("em") String email, @Param("pw") String password);

}
