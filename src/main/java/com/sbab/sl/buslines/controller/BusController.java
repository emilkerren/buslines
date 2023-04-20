package com.sbab.sl.buslines.controller;

import com.sbab.sl.buslines.models.Buses;
import com.sbab.sl.buslines.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/buses")
    public Buses getBuses() {
        ResponseEntity<String> responseJour = busService.getBusJour();
        ResponseEntity<String> responseStops = busService.getBusStops();

        return busService.createBuses(responseJour, responseStops);
    }
}
