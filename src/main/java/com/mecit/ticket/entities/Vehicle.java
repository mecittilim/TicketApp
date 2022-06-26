package com.mecit.ticket.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_Id")
    private long vehicleId;
    @Column(name = "license_number")
    private String licenseNumber;
    @Column(name = "total_seat_number")
    private int totalSeatNumber;
    @Column(name = "start_station")
    private String startStation;
    @Column(name = "end_station")
    private String endStation;
}
