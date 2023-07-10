package com.ivanov.Parking.services;

import com.ivanov.Parking.models.Car;
import com.ivanov.Parking.models.Motorcycle;
import com.ivanov.Parking.models.Parking;
import com.ivanov.Parking.models.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingService {

    private final Parking parking;

    @Autowired
    public ParkingService(Parking parking) {
        this.parking = parking;
    }


    public void parkTransport(int size) {
        Transport transport;
        if (size == 1) {
            transport = new Motorcycle();
        } else {
            transport = new Car();
        }
        parking.parkTransport(transport);
    }
}
