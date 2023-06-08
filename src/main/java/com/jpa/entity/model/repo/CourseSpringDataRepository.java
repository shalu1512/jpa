package com.jpa.entity.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.model.Course;

@Repository
public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
}
