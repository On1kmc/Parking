package com.ivanov.Parking;

import lombok.SneakyThrows;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;


public class ParkingStarter implements ApplicationListener<ApplicationStartedEvent> {



    @Override
    @SneakyThrows
    public void onApplicationEvent(ApplicationStartedEvent event) {
        while (true) {
            Thread.sleep(1000);
        }
    }
}
