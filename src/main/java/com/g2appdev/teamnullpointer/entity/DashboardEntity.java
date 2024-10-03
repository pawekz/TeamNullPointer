package com.g2appdev.teamnullpointer.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Not;


@Entity
@Table(name = "dashboard_entity")
public class DashboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

@OneToOne(cascade = CascadeType.ALL/*, orphanRemoval = true*/)
@JoinColumn(name = "notification_id")
private NotificationEntity notification;

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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNotification(NotificationEntity notification) {
        this.notification = notification;
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



}
