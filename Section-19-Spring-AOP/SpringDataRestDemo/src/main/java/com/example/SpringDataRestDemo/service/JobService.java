package com.example.SpringDataRestDemo.service;

import com.example.SpringDataRestDemo.model.JobPost;
import com.example.SpringDataRestDemo.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;


    public void addJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }


    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobs=new ArrayList<>(Arrays.asList(
                new JobPost(1,"Java Developer","experience in core Java",1,new ArrayList<>(Arrays.asList("Java","Spring","Spring Boot"))),
                new JobPost(2,"React Developer","experience in JS",2,new ArrayList<>(Arrays.asList("Java Script","React"))),
                new JobPost(3,"Python Developer","experience in DSA",2,new ArrayList<>(Arrays.asList("Python","DSA")))
        ));

        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
