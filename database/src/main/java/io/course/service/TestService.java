package io.course.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import io.course.service.Test;
import io.course.service.TestRepo;

import java.util.List;


@Service
public class TestService {
	
	@Autowired
	private TestRepo testRepo;
	
	public List<Test> getTest(){
		return testRepo.findAll();
		}
	
	public void addTopic(Test test)
	{
		testRepo.save(test);
		
	}
	public Test read(long id)
	{
		return testRepo.findOne(id);
	}
	
	public void update(Test test)
	{
		testRepo.save(test);
	}
	public void delete(long id)
	{
		testRepo.delete(id);
	}
	
	
		 
	 


	//public void delTopic(long id)
	//{
		//testRepo.delete(id);
	//}
}
