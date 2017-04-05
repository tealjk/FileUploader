package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fileuploadapp.UploadController;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class FileuploadApplication {

	public static void main(String[] args) throws IOException {
		new File(UploadController.uploaddir).mkdirs();
		SpringApplication.run(FileuploadApplication.class, args);
	}
}
