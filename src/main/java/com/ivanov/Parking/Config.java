package com.ivanov.Parking;

import com.ivanov.Parking.models.ParkingPlace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public ParkingPlace parkingPlace1() {
        return new ParkingPlace("A");
    }

    @Bean
    public ParkingPlace parkingPlace2() {
        return new ParkingPlace("B");
    }

    @Bean
    public ParkingPlace parkingPlace3() {
        return new ParkingPlace("C");
    }

    @Bean
    public ParkingPlace parkingPlace4() {
        return new ParkingPlace("D");
    }

    @Bean
    public ParkingPlace parkingPlace5() {
        return new ParkingPlace("E");
    }

    @Bean
    public ParkingStarter parkingStarter() {
        return new ParkingStarter();
    }
}
