package com.ravi.JobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.JobApp.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>  {

	
}
//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//	    new JobPost()
//	));
//
//public List<JobPost> getAllJobs() {
//	return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJob(JobPost job) {
//	jobs.add(job);
//	System.out.println(jobs);
//
//}