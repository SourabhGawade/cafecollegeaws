package com.cc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://192.168.0.108:8080/", maxAge = 3600)
@RestController
public class CafeController {
	
	@PostMapping("/getAWS@tbic.wiz.io")
	public ResponseEntity<?>  getAws(@RequestBody Object awsdetails) {		
		String resValue = "This is the AWS Notifcation "+ awsdetails.toString(); 
		return new ResponseEntity<String>(resValue,HttpStatus.OK);
	}
	
}
