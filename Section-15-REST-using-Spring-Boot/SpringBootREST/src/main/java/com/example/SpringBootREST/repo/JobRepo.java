package com.example.SpringBootREST.repo;

import com.example.SpringBootREST.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","experience in core Java",1,new ArrayList<>(Arrays.asList("Java","Spring","Spring Boot"))),
            new JobPost(2,"React Developer","experience in JS",2,new ArrayList<>(Arrays.asList("Java Script","React"))),
            new JobPost(3,"Python Developer","experience in DSA",2,new ArrayList<>(Arrays.asList("Python","DSA")))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {
        for (JobPost job: jobs)
            if (job.getPostId() == postId)
                return job;

        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job: jobs) {
            if (job.getPostId() == jobPost.getPostId()) {
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for (JobPost job: jobs) {
            if (job.getPostId() == postId) {
                jobs.remove(job);
            }
        }
    }
}
