package com.ahdy.jobs.controller;

import com.ahdy.jobs.model.Job;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jobs/")
public class JobsController {
    @GetMapping("alljobs")
    public String getAllJobs(){
        return "all jobs";
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void addJob(@RequestBody Job job){
        System.out.println("new job added with success");
    }
}
