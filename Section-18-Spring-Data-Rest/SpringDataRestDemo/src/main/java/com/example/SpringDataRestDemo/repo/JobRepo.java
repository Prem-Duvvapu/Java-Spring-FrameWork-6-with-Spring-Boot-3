package com.example.SpringDataRestDemo.repo;

import com.example.SpringDataRestDemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {
}
