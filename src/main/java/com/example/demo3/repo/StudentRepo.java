package com.example.demo3.repo;

import com.example.demo3.model.Student2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student2,Integer> {
}
