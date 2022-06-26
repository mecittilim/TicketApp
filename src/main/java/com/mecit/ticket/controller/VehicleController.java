package com.mecit.ticket.controller;

import com.mecit.ticket.entities.Vehicle;
import com.mecit.ticket.services.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    private IVehicleService vehicleService;

    @GetMapping("/getVehicleList")
    public List<Vehicle> getVehicleList(){
        return vehicleService.getVehicleList();
    }

    @GetMapping("/getVehicle{vehilceId}")
    public Vehicle getVehicle(@PathVariable() Long vehicleId){
        return vehicleService.getVehicle(vehicleId);
    }

    @PostMapping("/addVehicle")
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleService.addVehicle(vehicle);
    }

    @DeleteMapping("/deleteVehicle{vehicleId}")
    public void deleteVehicle(@PathVariable("vehicleId") Long vehicleId){
        vehicleService.deleteVehicle(vehicleId);
    }



}
