package com.ravi.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.JobApp.model.JobPost;
import com.ravi.JobApp.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobPost) {
		repo.save(jobPost);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.findAll();
	}
	
	public JobPost getJob(int postId) {
		return repo.findById(postId).orElse(null);
	}
	
	public void updateJob(JobPost jobPost) {
		repo.save(jobPost);
	}
	
	public void deleteJob(int postId) {
		repo.deleteById(postId);
	}
}
