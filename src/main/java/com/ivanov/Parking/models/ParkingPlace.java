package com.ivanov.Parking.models;

import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
public class ParkingPlace {

    private final String number;
    private List<Transport> transportList = Arrays.asList(null, null);

    public ParkingPlace(String number) {
        this.number = number;
    }


    public void parkTransport(Transport transport) {
        if (transport instanceof Car) {
            transportList = Collections.nCopies(2, transport);
        } else {
            for (int i = 0; i < transportList.size(); i++) {
                if (transportList.get(i) == null) {
                    transportList.set(i, transport);
                    break;
                }
            }
        }

    }

    public int getCapacityPlace() {
        int result = 0;
        for (Transport transport : transportList) {
            if (transport == null) {
                result++;
            }
        }
        return result;
    }
}
