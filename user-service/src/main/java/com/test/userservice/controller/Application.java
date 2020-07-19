package com.test.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.userservice.model.Event;
import com.test.userservice.service.Service;

@RestController
@RequestMapping("/api")
public class Application {

	@Autowired
	private Service service;

	@GetMapping("/getall")
	public Iterable<Event> getEvents() {
		return service.getAllEventList();
	}
	@GetMapping("/getbyid/{id}")
	public Event getEventbyId(@PathVariable Integer id) {
		return service.getEventById(id);
	}
	
}
