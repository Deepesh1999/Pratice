package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {
	@GetMapping("/posts")
	public ResponseEntity<Object> getPosts(){
		return new ResponseEntity<Object>( Arrays.asList("aa","bb"),HttpStatus.OK);
	}
}
