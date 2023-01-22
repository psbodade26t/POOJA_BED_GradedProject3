package com.gl.TicketTrackerApp.Service;

import java.util.List;

import com.gl.TicketTrackerApp.entity.Ticket;

public interface TicketService {

	List<Ticket> getAllTickets();

	Ticket addTicket(Ticket ticket);

	Ticket getTicketById(Long id);

	Ticket updateTicket(Ticket ticket);

	void deleteTicketByid(Long id);

	List<Ticket> findByKeyword(String keyword);

}