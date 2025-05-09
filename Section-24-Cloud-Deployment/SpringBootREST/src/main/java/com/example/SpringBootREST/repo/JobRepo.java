package com.example.SpringBootREST.repo;

import com.example.SpringBootREST.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);

}
//
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//public void addJob(JobPost jobPost) {
//    jobs.add(jobPost);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//    for (JobPost job: jobs)
//        if (job.getPostId() == postId)
//            return job;
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for (JobPost job: jobs) {
//        if (job.getPostId() == jobPost.getPostId()) {
//            job.setPostProfile(jobPost.getPostProfile());
//            job.setPostDesc(jobPost.getPostDesc());
//            job.setReqExperience(jobPost.getReqExperience());
//            job.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for (JobPost job: jobs) {
//        if (job.getPostId() == postId) {
//            jobs.remove(job);
//        }
//    }
//}
