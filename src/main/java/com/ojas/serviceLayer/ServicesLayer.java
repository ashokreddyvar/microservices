package com.ojas.serviceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.Jobdao;
import com.ojas.dao.Userdao;
import com.ojas.models.Job;
import com.ojas.models.User;

@Service
public class ServicesLayer {
	  @Autowired
	  private Jobdao jdao;
	  @Autowired
	  private  Userdao udao;
	
	 public User addUser(User user) {
		return udao.save(user); 
	 }
	 public Job addJob(Job job) {
		return jdao.save(job);
		  
	  }
	  public Optional<Job> getJobById(int jobId){
			return jdao.findById(jobId);
		}
	  public List<Job> getJobByType(String name){
		return jdao.findByJobType(name);
		  
	  }
	  public List<Job> getJobByAvailability(String jobavl){
		return jdao.findByAvailability(jobavl);
		  
	  }
	  public List<Job> getContryName(String Country){
		return jdao.findByCountry(Country);
		  
	  }
	  public List<Job> getLanguageName(String language){
		return jdao.findByLanguage(language);
		  
	  }
	 public  List<Job> getPayRateAmount(int payRate){
		return jdao.findByPayRate(payRate);
		
		 
	 }
	 
}


