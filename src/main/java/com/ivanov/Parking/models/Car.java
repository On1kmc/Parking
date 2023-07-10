package com.ivanov.Parking.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car extends Transport {

    private final int size = 2;

}
