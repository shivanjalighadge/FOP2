package com.gl.springboot.TicketTracker.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "List of Tickets")
public class ListOfTickets {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "Ticket ID")
	private int ID;
	
	@Column(name= "Ticket Title")
	private String title;
	
	@Column(name= "Ticket Short Description")
	private String ticketdescription;
	
	@Column(name= "Ticket Created On")
	private String ticketcreatedon;

	
	public ListOfTickets(String title, String ticketdescription, String ticketcreatedon) {
		super();
		this.title = title;
		this.ticketdescription = ticketdescription;
		this.ticketcreatedon = ticketcreatedon; // Constructors without id
	}

	public ListOfTickets(int iD, String title, String ticketdescription, String ticketcreatedon) {
		super();
		ID = iD;
		this.title = title;
		this.ticketdescription = ticketdescription;
		this.ticketcreatedon = ticketcreatedon; //Constructors
	}

	public ListOfTickets() {
		super(); //Default constructor
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTicketdescription() {
		return ticketdescription;
	}

	public void setTicketdescription(String ticketdescription) {
		this.ticketdescription = ticketdescription;
	}

	public String getTicketcreatedon() {
		return ticketcreatedon;
	}

	public void setTicketcreatedon(String ticketcreatedon) {
		this.ticketcreatedon = ticketcreatedon;
	}
	
	
}
