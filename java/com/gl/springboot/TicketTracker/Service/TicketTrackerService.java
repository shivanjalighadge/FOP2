package com.gl.springboot.TicketTracker.Service;

import java.util.List;

import com.gl.springboot.TicketTracker.Entity.ListOfTickets;

public interface TicketTrackerService {

	void save(ListOfTickets listoftickets);
	List<ListOfTickets> findAll();
	
	ListOfTickets findByID (int ID);
	
	void deleteByID (int ID);
}
