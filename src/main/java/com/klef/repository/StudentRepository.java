package com.klef.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

}
