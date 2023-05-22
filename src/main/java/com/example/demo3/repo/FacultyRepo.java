package com.example.demo3.repo;

import com.example.demo3.model.Faculty2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty2,Integer> {
}
