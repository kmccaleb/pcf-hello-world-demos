package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        String rsp = "The current time is " + new Date();
        System.out.println(rsp);
	}
	
	@RestController
    @RequestMapping("/")
	class IndexController {
	 
//	    @RequestMapping(value= {"","/"})
//	    String getTime(@RequestParam(value = "zone") String zone) {
//	    	
//	    	Date date = new Date();
//	    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    	
//	    	if (zone.contains("east")) {
//	    		df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
//	    		zone = "Welcome to Java World Clock! " + "US Eastern";
//	    	} else if (zone.contains("central")) {
//	    		df.setTimeZone(TimeZone.getTimeZone("US/Central"));	  
//	    		zone =  "Welcome to Java World Clock! " + "US Central";
//	    	} else if (zone.contains("mountain")) {
//	    		df.setTimeZone(TimeZone.getTimeZone("US/Mountain"));	
//	    		zone =  "Welcome to Java World Clock! " + "US Mountain";
//	    	} else if (zone.equalsIgnoreCase("pacific")) {
//	    		df.setTimeZone(TimeZone.getTimeZone("US/Pacific"));
//	    		zone =  "Welcome to Java World Clock! " + "US Pacific";
//	    	} else {
//	    		df.setTimeZone(TimeZone.getDefault());
//	    		zone =  "Welcome to Java World Clock! " + " The local";
//	    	}
//	    	
//	        String result = zone + " time is " + df.format(date);
//	        System.out.println(result);
//	        
//	        return result;
//	    }
	    
	    @RequestMapping("/")
	    String getDefaultTime() {
	    	
	    	Date date = new Date();
	    	DateFormat df = new SimpleDateFormat("HH:mm:ss");
	    	
    		df.setTimeZone(TimeZone.getDefault());
    		String zone = "Your local";
	    	
	        String result = "Welcome to Java World Clock! The local time is " + df.format(date);
	        System.out.println(result);
	        
	        return result;
	    }

	}
}
