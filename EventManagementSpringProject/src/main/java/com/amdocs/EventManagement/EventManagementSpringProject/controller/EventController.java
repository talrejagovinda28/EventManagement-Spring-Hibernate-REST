package com.amdocs.EventManagement.EventManagementSpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.EventManagement.EventManagementSpringProject.dao.EventDAOImpl;
import com.amdocs.EventManagement.EventManagementSpringProject.entity.Event;

@RestController
@RequestMapping("/api")
public class EventController {
	@Autowired
	
	private EventDAOImpl eventDAOImpl;

	public EventController(EventDAOImpl theEventDAOImpl) {
		//super();
		this.eventDAOImpl = theEventDAOImpl;
	}
	
	@GetMapping("/events")
	public List<Event> getEvents()
	{
		List<Event> Events = eventDAOImpl.getEvents();
		return Events;
	}
	
	@GetMapping("/events/{eventID}")
	public Event getEvents(@PathVariable int eventID)
	{
		return eventDAOImpl.getEvents(eventID);
	}
	
	@PostMapping("/events")
	public Event addEvent(@RequestBody Event theEvent) 
	{
		theEvent.setId(0);
		Event event = eventDAOImpl.save(theEvent);
		return event;
	}
	
	@PutMapping("/events")
	public Event updateEvent(@RequestBody Event theEvent)
	{
		Event event = eventDAOImpl.save(theEvent);
		return event;
	}
	
	@DeleteMapping("/events/{eventID}")
	public String deleteEvent(@PathVariable int eventID)
	{
		eventDAOImpl.deleteEvent(eventID);
		return "Deleted the Event of EventID ...." +eventID;
	}
	
}
