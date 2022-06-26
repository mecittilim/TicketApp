package com.mecit.ticket.services;

import com.mecit.ticket.entities.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> getVehicleList();
    Vehicle getVehicle(Long vehicleId);
    void addVehicle(Vehicle vehicle);
    void deleteVehicle(Long vehicleId);


}
