package com.everis.treining.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.treining.everis.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
