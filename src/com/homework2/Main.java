package com.homework2;

import com.homework2.util.CarUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int amountOfCars = 10;
        Car[] arrayOfCars = CarUtil.generationOfCars(amountOfCars);
        System.out.println("Unsorted Array:");
        CarUtil.printArray(arrayOfCars);

        System.out.println("--------------------------------------");

        System.out.println("Sorted Array:");
        Arrays.sort(arrayOfCars);
        CarUtil.printArray(arrayOfCars);

        arrayOfCars[0].run();

        int hour = arrayOfCars[0].move(25);
        System.out.println(hour + "h");
    }
}
