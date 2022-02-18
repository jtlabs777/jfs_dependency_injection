package com.example.jfs_dependency_injection;

import java.time.LocalDate;

public class Student {
    Long id;
    String name;
    String email;
    LocalDate dob;


    public Student(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;


    }

    /*getters */
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    /*setters  */

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {

        this.dob = dob;
    }


}


