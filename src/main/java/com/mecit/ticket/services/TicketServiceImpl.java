package com.mecit.ticket.services;

import com.mecit.ticket.entities.Ticket;
import com.mecit.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService{
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicket(Long ticketId) {
        return ticketRepository.getReferenceById(ticketId);
    }

    @Override
    public List<Ticket> getTicketsByUserId(Long userId) {
        return ticketRepository.findByUserId(userId);
    }

    @Override
    public void buyTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void updateTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
