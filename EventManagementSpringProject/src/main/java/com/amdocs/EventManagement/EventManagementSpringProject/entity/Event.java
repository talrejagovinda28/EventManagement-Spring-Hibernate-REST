package com.amdocs.EventManagement.EventManagementSpringProject.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="eventmanage")
@SequenceGenerator(name="MySequence")//,sequenceName="event_sequence,initialValue=50,allocationSize=1")


public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="MySequence")
	@Column(name="EventID")
	private int id;
	@Column(name="eventname")
	private String ename;
	@Column(name="Location")
	private String loc;
	@Column(name="eventtype")
	private String etype;
	@Column(name="eventdate")
	private Date edate;
	@Column(name="eventtime")
	private String etime;
	
	public Event()
	{
		
	}
	
	public Event(int id, String ename, String loc, String etype, Date edate, String etime) {
		//super();
		this.id = id;
		this.ename = ename;
		this.loc = loc;
		this.etype = etype;
		this.edate = edate;
		this.etime = etime;
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	@Override
	public String toString() {
		return "Event [getId()=" + getId() + ", getEname()=" + getEname() + ", getLoc()=" + getLoc() + ", getEtype()="
				+ getEtype() + ", getEdate()=" + getEdate() + ", getEtime()=" + getEtime() + "]";
	}
	
	
	
	
	
	

}
