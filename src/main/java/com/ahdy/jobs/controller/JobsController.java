package com.ahdy.jobs.controller;

import com.ahdy.jobs.model.Job;
import com.ahdy.jobs.service.JobService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jobs/")
public class JobsController {
    private final JobService jobService;

    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("alljobs")
    public String getAllJobs(){
        return "all jobs";
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void addJob(@Valid @RequestBody Job job){
        System.out.println(job.toString());
        this.jobService.saveJob(job);
        System.out.println("new job added with success");
    }
    @GetMapping("{id}")
    public Job findJobByID(@PathVariable("id") Long id){
        var job = jobService.getJobByID(id);
        System.out.println(job.get().toString());
        if(job.isPresent()) return job.get();
        else return null;
    }
}
