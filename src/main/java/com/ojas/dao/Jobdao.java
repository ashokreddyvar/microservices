package com.ojas.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.models.Job;
@Repository
public interface Jobdao  extends JpaRepository<Job, Integer>{
	
	public List<Job> findByJobType(String jobType);
	
	public List<Job> findByCountry(String country);
	
	public List<Job> findByAvailability(String availability);
    
	public List<Job> findByLanguage(String language);
	
	public List<Job> findByPayRate(int payRate);
	

}
