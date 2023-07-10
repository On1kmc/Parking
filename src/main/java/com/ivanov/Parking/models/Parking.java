package com.ivanov.Parking.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Data
public class Parking {

    private final List<ParkingPlace> parkingPlaceList;

    private int freePlaces;


    @Autowired
    public Parking(List<ParkingPlace> parkingPlaceList) {
        this.parkingPlaceList = parkingPlaceList;
        freePlaces = parkingPlaceList.size();
    }


    public void parkTransport(Transport transport) {
        Optional<ParkingPlace> parkingPlace;
        if (transport instanceof Motorcycle) {
            parkingPlace = findFreePlaceForMotorcycle();
        } else {
            parkingPlace = findFreePlaceForCar();
        }
        parkingPlace.orElseThrow(RuntimeException::new).parkTransport(transport); // Своя ошибка!
        freePlaces--;
    }



    private Optional<ParkingPlace> findFreePlaceForMotorcycle() {
        for (ParkingPlace parkingPlace : parkingPlaceList) {
            if (parkingPlace.getCapacityPlace() == 1) {
                return Optional.of(parkingPlace);
            }
        }
        for (ParkingPlace parkingPlace : parkingPlaceList) {
            if (parkingPlace.getCapacityPlace() == 2) {
                return Optional.of(parkingPlace);
            }
        }
        return Optional.empty();
    }

    private Optional<ParkingPlace> findFreePlaceForCar() {
        for (ParkingPlace parkingPlace : parkingPlaceList) {
            if (parkingPlace.getCapacityPlace() == 2) {
                return Optional.of(parkingPlace);
            }
        }
        return Optional.empty();
    }

}
