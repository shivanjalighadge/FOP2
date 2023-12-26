package com.gl.springboot.TicketTracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.springboot.TicketTracker.Entity.ListOfTickets;
import com.gl.springboot.TicketTracker.Service.TicketTrackerService;

@RestController
@RequestMapping("Tickets")
public class TicketController {

	@Autowired
	private TicketTrackerService ticketTrackerService;
	
	@PostMapping("/add")
	private void addTicket(@RequestBody ListOfTickets listOfTickets) {
		ticketTrackerService.save(listOfTickets);
	}
		
	@GetMapping("list")
	private List<ListOfTickets> getAllTickets() {
		return ticketTrackerService.findAll();
	}
}
