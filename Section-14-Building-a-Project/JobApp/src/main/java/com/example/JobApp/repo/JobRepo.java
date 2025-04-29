package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>();

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
