package com.g2appdev.teamnullpointer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DashboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String instructor;
    private String course;
    private String groupDetails;

    public DashboardEntity() {super();}

    public DashboardEntity(int id, String user, String instructor, String course, String groupDetails) {
        super();
        this.id = id;
        this.user = user;
        this.instructor = instructor;
        this.course = course;
        this.groupDetails = groupDetails;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroupDetails() {
        return groupDetails;
    }
    public void setGroupDetails(String groupDetails) {
        this.groupDetails = groupDetails;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
