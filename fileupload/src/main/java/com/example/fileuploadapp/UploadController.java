package com.example.fileuploadapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class UploadController {
	
	
	
	@RequestMapping("/file")
	public String fileLoader()
	{	
		return "file"; 
		
	}
	
	
	
	

}
