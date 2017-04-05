package com.example.fileuploadapp;

import java.io.File;
import java.io.IOException;




import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@RestController 
public class UploadController {
    public static final String uploaddir = System.getProperty("user.dir") + "/uploaddir/";

	
	
	
	
	@RequestMapping("/")
	public String fileloader(Model model)
	{	
		File file = new File(uploaddir);
		model.addAttribute("files", file.listFiles());
	
		return "fileloader MEEEEE"; 
		
	}
	
	@RequestMapping(value ="/", method = RequestMethod.POST)
	public String uploading(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException{
		
    for(MultipartFile uploadedFile : uploadingFiles) {
        File file = new File(uploading(null) + uploadedFile.getOriginalFilename());
        uploadedFile.transferTo(file);
    }

    return "redirect:/";
	
	}
}
