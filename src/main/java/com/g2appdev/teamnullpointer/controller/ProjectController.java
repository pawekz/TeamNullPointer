package com.g2appdev.teamnullpointer.controller;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pname;
    private String members;
    private int instructorId;
    private int startDate;
    private int endDate;

    public ProjectController() {
        super();
    }

    public ProjectController(int id, String pname, String members, int instructorId, int startDate, int endDate) {
        super();
        this.id = id;
        this.pname = pname; //project name
        this.members = members;
        this.instructorId = instructorId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public void setName(String name) {
        this.pname = pname;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

}
