package com.ahdy.jobs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;


/*public record Job
  (   int jobID,
     String jobTitle,
     String jobDescription,
     Date appliedAt,
     Date respondedAt,
     JobStatus Status
    ){}
*/

@Entity
public class Job{
    @Id
    int jobID;
    String jobTitle;
    String jobDescription;
    Date appliedAt;
    Date respondedAt;
    JobStatus Status;

    public Job(int jobID, String jobTitle, String jobDescription, Date appliedAt, Date respondedAt, JobStatus status) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.appliedAt = appliedAt;
        this.respondedAt = respondedAt;
        Status = status;
    }

    public int getJobID() {
        return jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public Date getAppliedAt() {
        return appliedAt;
    }

    public Date getRespondedAt() {
        return respondedAt;
    }

    public JobStatus getStatus() {
        return Status;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setAppliedAt(Date appliedAt) {
        this.appliedAt = appliedAt;
    }

    public void setRespondedAt(Date respondedAt) {
        this.respondedAt = respondedAt;
    }

    public void setStatus(JobStatus status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobID=" + jobID +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", appliedAt=" + appliedAt +
                ", respondedAt=" + respondedAt +
                ", Status=" + Status +
                '}';
    }

    public Job() {
    }
}
