package com.g2appdev.teamnullpointer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private int projectGroupNumber;
    private int role; //1 for student, 2 for team leader, 3 for instructor


    public AccountEntity() {
        super();
    }

    public AccountEntity(int id, String firstName, String lastName, int projectGroupNumber, int role) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.projectGroupNumber = projectGroupNumber;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getProjectGroupNumber() {
        return projectGroupNumber;
    }

    public void setProjectGroupNumber(int projectGroupNumber) {
        this.projectGroupNumber = projectGroupNumber;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
