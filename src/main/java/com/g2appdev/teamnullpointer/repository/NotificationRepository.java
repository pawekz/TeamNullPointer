package com.g2appdev.teamnullpointer.repository;

import com.g2appdev.teamnullpointer.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, Integer> {
    public NotificationEntity findByMessage(String message);
}
