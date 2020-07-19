package com.test.userservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.userservice.model.Event;

@org.springframework.stereotype.Service
public class Service {

	private List<Event> eventList = new ArrayList<>(Arrays.asList(

			new Event(0, "ENNOGY 2K19", "Delhi", "28.534693, 77.260178"),
			new Event(1, "The Great Indian Music Festival", "Noida", "28.582121, 77.326698"),
			new Event(2, "Dandiya Nights", "Gurgaon", "27.659361, 76.917007")

	));

	public List<Event> getAllEventList() {
		return eventList;
	}

	public Event getEventById(Integer id) {
		return eventList.get(id);
	}

}
