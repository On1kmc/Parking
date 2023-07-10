package com.ivanov.Parking.controllers;

import com.ivanov.Parking.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

    private final ParkingService parkingService;

    @Autowired
    public IndexController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping()
    public String index() {
        return "hello";
    }

    @PostMapping()
    public String newTransport(@RequestParam("size") int size) {
        try {
            parkingService.parkTransport(size);
        } catch (RuntimeException e) {
            // Ловим ошибку из кидаем в отображение
        }
        return "hello";
    }


}
