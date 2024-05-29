package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "update user set password = ?1 where user_id = ?2", nativeQuery = true)
	public User changeUserPassword(String password, int id);
}
