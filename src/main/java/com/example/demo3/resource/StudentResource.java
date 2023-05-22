package com.example.demo3.resource;

import com.example.demo3.model.Student2;
import com.example.demo3.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentResource {
    private StudentRepo repo;

    public StudentResource(StudentRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    List<Student2> getAll() {
        return repo.findAll();
    }

    @GetMapping("{id}")
    Optional<Student2> getOne(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    Student2 save(@RequestBody Student2 st) {
        return repo.save(st);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
