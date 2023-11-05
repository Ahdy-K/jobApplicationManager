package com.ahdy.jobs.model;

import java.util.Date;


public record Job
  (   int jobID,
     String jobTitle,
     String jobDescription,
     Date appliedAt,
     Date respondedAt,
     JobStatus Status
    ){}

