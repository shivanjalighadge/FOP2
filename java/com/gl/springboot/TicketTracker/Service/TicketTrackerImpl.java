package com.gl.springboot.TicketTracker.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springboot.TicketTracker.Entity.ListOfTickets;
import com.gl.springboot.TicketTracker.repo.TicketsRepository;

@Service
public class TicketTrackerImpl implements TicketTrackerService {

	
	TicketsRepository ticketsRepository;
	
	@Override
	public void save(ListOfTickets listoftickets) {
		ticketsRepository.save(listoftickets);
	}

	@Override
	public List<ListOfTickets> findAll() {
		return ticketsRepository.findAll();
	}

	@Override
	public ListOfTickets findByID(int ID) {
		Optional<ListOfTickets> ticketDetails = ticketsRepository.findById(ID);
		if (ticketDetails.isPresent()) {
			return ticketDetails.get();
		} else {
			throw new RuntimeException("Did not find ticket id - " + ID);
		}

	}

	@Override
	public void deleteByID(int ID) {
		ticketsRepository.deleteById(ID);
		
	}

}
