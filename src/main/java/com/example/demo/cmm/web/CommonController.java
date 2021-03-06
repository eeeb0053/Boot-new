package com.example.demo.cmm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.service.CommonService;
@CrossOrigin(origins = "*")
@RestController @RequestMapping("/common") 
public class CommonController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired CommonService commonService;
	
    @GetMapping("/generate/db")
    public Messenger generateDB(){
    	logger.info("=========== Students Truncated Execute..");
    	return (commonService.generateDB() == 1) ? Messenger.SUCCESS : Messenger.FAILURE;
    }
}
