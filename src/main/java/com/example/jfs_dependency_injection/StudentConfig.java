package com.example.jfs_dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

@Configuration
public class StudentConfig {
    public List<Student> students = new ArrayList<>();


    public Student student1() {
        return new Student(1L, "Jay", "jay@jay.com", LocalDate.of(1979, Month.FEBRUARY, 15));
    }

    public Student student2() {
        return new Student(2L, "Joe", "joe@joe.com", LocalDate.of(1990, Month.DECEMBER, 01));


    }

    @Bean
    public void addStudents() {
        students.addAll(List.of(student1(), student2()));
    }



}
