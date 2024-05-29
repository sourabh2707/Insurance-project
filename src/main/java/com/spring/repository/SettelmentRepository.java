package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Settelment;

@Repository
public interface SettelmentRepository extends JpaRepository<Settelment, Integer> {

}
