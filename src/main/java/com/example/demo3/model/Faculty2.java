package com.example.demo3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Faculty2 {
    @Id
    private Integer id;
    private String name;
    @OneToMany
    private List<Student2> students2;

    public List<Student2> getStudents2() {
        return students2;
    }

    public void setStudents2(List<Student2> students2) {
        this.students2 = students2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty2 faculty2 = (Faculty2) o;
        return Objects.equals(id, faculty2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
