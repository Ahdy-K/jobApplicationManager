package com.ahdy.jobs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jobs/")
public class JobsController {
    @GetMapping("alljobs")
    public String getAllJobs(){
        return "all jobs";
    }
}
