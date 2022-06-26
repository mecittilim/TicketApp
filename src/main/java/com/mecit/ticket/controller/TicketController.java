package com.mecit.ticket.controller;

import com.mecit.ticket.entities.Ticket;
import com.mecit.ticket.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    private ITicketService ticketService;

    @GetMapping("/getTicketList")
    public List<Ticket> getTicketList(){
        return ticketService.getTickets();
    }

    @GetMapping("/getTicket/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId") Long ticketId){
        return ticketService.getTicket(ticketId);
    }

    @GetMapping("/getUserTicket/{userId}")
    public List<Ticket> getTicketByUserId(@PathVariable("userId") Long userId){
        return ticketService.getTicketsByUserId(userId);
    }

    @PostMapping("/buyTicket")
    public void buyTicket(@RequestBody Ticket ticket){
         ticketService.buyTicket(ticket);
    }

    @PutMapping("/updateTicket")
    public void updateTicket(@RequestBody Ticket ticket){
        ticketService.updateTicket(ticket);
    }




}


