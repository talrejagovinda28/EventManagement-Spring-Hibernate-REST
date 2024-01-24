package com.amdocs.EventManagement.EventManagementSpringProject.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.amdocs.EventManagement.EventManagementSpringProject.entity.Event;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
//import jakarta.websocket.Session;
import jakarta.transaction.Transactional;

@Repository
public class EventDAOImpl implements EventDAO 
{
	private EntityManager entityManager;

	public EventDAOImpl(EntityManager theEntityManager) {
		super();
		this.entityManager = theEntityManager;
	}
	
	@Transactional
	public List<Event> getEvents(){
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("from Event",Event.class);
		List<Event> Events = theQuery.getResultList();
//		List<Event> Events = new ArrayList<Event>();
//		Event e1 = new Event(700, "OSS");
//		Events.add(e1);
		//System.out.println(Events);
		return Events;
	}
	
	@Transactional
	public Event getEvents(int eventID){
		Session currentSession = entityManager.unwrap(Session.class);
		Event e = currentSession.get(Event.class, eventID);
		return e;
	}
	
	@Transactional
	public Event save(Event theEvent)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theEvent);
		return theEvent;
	}
	@Transactional
	public void deleteEvent(int eventID) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		//@SuppressWarnings("deprecation")
		Query theQuery = currentSession.createQuery("delete From Event where id=:eventID");
		
		theQuery.setParameter("eventID", eventID);
		theQuery.executeUpdate();
	}
	
	
	
	
	
	

}
