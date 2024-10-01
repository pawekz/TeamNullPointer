package com.g2appdev.teamnullpointer.repository;

import com.g2appdev.teamnullpointer.entity.DashboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends JpaRepository<DashboardEntity, Integer> {
    public DashboardEntity findByUser(String user);

}
