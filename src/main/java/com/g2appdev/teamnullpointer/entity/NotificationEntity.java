package com.g2appdev.teamnullpointer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
    private int datePost;

    public NotificationEntity() {super();}

    public NotificationEntity(String message, int datePost) {
        super();
        this.message = message;
        this.datePost = datePost;
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

}
