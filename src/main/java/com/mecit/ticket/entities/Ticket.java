package com.mecit.ticket.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ticket_id")
    private long ticketId;
    @Column(name = "user_id")
    private  long userId;
    @Column(name = "vehicle_id")
    private long vehicleId;
    @Column(name = "seat_number")
    private int seatNumber;
    @Column(name = "start_station")
    private String startStation;
    @Column(name = "end_station")
    private String endStation;
    @Column(name = "date")
    private Date date;
    @Column(name = "status")
    private String status;
    @Column(name = "price")
    private double price;

}
