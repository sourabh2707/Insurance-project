package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer>{

}
