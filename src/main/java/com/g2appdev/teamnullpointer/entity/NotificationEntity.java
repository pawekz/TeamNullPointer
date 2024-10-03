package com.g2appdev.teamnullpointer.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notification_entity")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "message")
    private String message;
    private int datePost;

    @OneToOne (mappedBy = "notification", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "dashboard_id")
    private DashboardEntity dashboard;

    public NotificationEntity() {super();}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getDatePost() {
        return datePost;
    }
    public void setDatePost(int datePost) {
        this.datePost = datePost;
    }
    private DashboardEntity getDashboard() {
        return dashboard;
    }
    public void setDashboard(DashboardEntity dashboard) {
        this.dashboard = dashboard;
    }

}
