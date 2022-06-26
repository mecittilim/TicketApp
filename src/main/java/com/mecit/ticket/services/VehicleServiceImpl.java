package com.mecit.ticket.services;

import com.mecit.ticket.entities.Vehicle;
import com.mecit.ticket.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements IVehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getVehicleList() {

        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicle(Long vehicleId) {
        return vehicleRepository.getReferenceById(vehicleId);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }
}
