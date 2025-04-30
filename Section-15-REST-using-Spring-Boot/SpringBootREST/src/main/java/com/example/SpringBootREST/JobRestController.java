package com.example.SpringBootREST;

import com.example.SpringBootREST.model.JobPost;
import com.example.SpringBootREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;

//    @GetMapping(path="jobPosts", produces = {"application/xml"})
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJob(postId);
    }

//    @PostMapping(path="/jobPost", consumes = {"application/json"})
    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Deleted";
    }
}
