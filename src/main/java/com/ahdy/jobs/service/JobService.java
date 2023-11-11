package com.ahdy.jobs.service;

import com.ahdy.jobs.model.Job;
import com.ahdy.jobs.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
    public void saveJob(Job job){
        this.jobRepository.save(job);
        System.out.println("job saved");
    }
    public Optional<Job> getJobByID(Long id){
       return jobRepository.findById(id);
    }
}
