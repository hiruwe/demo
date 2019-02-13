package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
/*	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		
		return new String("Helloooo");	
	
	}
	*/
	@Autowired
	private StudentDao studentDao;
	
	
    @RequestMapping("/hello")
    public String sayHello() {
    	System.out.println("Helloooooooooo :) ");
        return "Hellooooooo";
    }
    

    @RequestMapping("/insert")
    public String insert() {
    	
    	this.studentDao.save(new Student());
    	System.out.println("Record inserted :) ");
        return "Record inserted";
    }
    
}
