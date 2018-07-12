package io.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.course.service.Test;
import io.course.service.TestService;



@Controller
@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/getTest")
	public List<Test> test()
	{
		List<Test> tests = testService.getTest();
		return tests;
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/addTest")
	public String addTopic(@RequestBody Test test)
	{
		testService.addTopic(test);
		return "added successfully";
	}
	
	@RequestMapping(value = "read/{id}")
    public Test read(@PathVariable long id) {
       return testService.read(id);
    }

  
	@RequestMapping(value="/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Test test) {
        testService.update(test);
    }

  
	@RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable long id) {
		testService.delete(id);
		return "done";
    }
	

}
