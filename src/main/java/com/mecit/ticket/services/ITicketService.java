package com.mecit.ticket.services;

import com.mecit.ticket.entities.Ticket;

import java.util.List;

public interface ITicketService {
    List<Ticket> getTickets();
    Ticket getTicket(Long ticketId);
    List<Ticket> getTicketsByUserId(Long userId);
    void buyTicket(Ticket ticket);
    void updateTicket(Ticket ticket);

}
