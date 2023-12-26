package com.gl.springboot.TicketTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.springboot.TicketTracker.Entity.ListOfTickets;

@Repository
public interface TicketsRepository extends JpaRepository<ListOfTickets, Integer >{

}
