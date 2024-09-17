package com.g2appdev.teamnullpointer.repository;

import com.g2appdev.teamnullpointer.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <ProjectEntity, Integer> {
    public ProjectEntity findByPname(String pname);
}
