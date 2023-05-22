package com.example.demo3.resource;

import com.example.demo3.model.Faculty2;
import com.example.demo3.model.Student2;
import com.example.demo3.repo.FacultyRepo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@RestController
@RequestMapping("/api/faculty")
public class FacultyResource {
    private FacultyRepo repo;

    public FacultyResource(FacultyRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    List<Faculty2> getAll() {
        return repo.findAll();
    }

    @GetMapping("{id}")
    Optional<Faculty2> getOne(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    Faculty2 save(@RequestBody Faculty2 ft) {
        return repo.save(ft);
    }

    @PatchMapping("{id}")
    @Transactional
    void addStudent(@PathVariable Integer id, @RequestBody List<Student2> st) {
        Optional<Faculty2> ft = repo.findById(id);
        if (ft.isPresent()) {
            Faculty2 ft2 = ft.get();
            List<Student2> list = ft2.getStudents2();
            list.addAll(st);
        }
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
