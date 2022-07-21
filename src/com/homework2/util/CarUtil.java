package com.homework2.util;

import com.homework2.basic.Car;

import java.util.Random;


public class CarUtil {
    public static final double minEngineVolume = 0.5;
    public static final double maxEngineVolume = 5;
    public static final int minSpeed = 100;
    public static final int maxSpeed = 300;
    public static final int minAmountOfDoors = 3;
    public static final int maxAmountOfDoors = 5;

    public static Car[] generationOfCars(int amountOfCars) {
        Car[] cars = new Car[amountOfCars];

        String[] colorOfCars = new String[]{"black", "red", "blue", "grey", "white"};
        String[] brandOfCars = new String[]{Car.audiConstant, Car.bmwConstant, Car.fordConstant, Car.geelyConstant, Car.hondaConstant, Car.kiaConstant, Car.opelConstant, Car.porscheConstant, Car.skodaConstant, Car.toyotaConstant};
        String[] modelOfCars = new String[]{"Q7", "X5", "Focus", "Atlas", "Accord", "Rio", "Astra", "Cayenne", "Octavia", "RAV4"};

        Random random = new Random();

        for (int i = 0; i < amountOfCars; i++) {

            double finishEngineVolume1 = randomAction(minEngineVolume, maxEngineVolume);
            int finishMaxSpeed = randomAction(minSpeed, maxSpeed);
            int finishAmountOfDoor = randomAction(minAmountOfDoors, maxAmountOfDoors);
            int numberOfColor = random.nextInt(colorOfCars.length);
            int numberOfBrand = random.nextInt(brandOfCars.length);

            double finishEngineVolume = roundAvoid(finishEngineVolume1, 1);

            cars[i] = new Car(finishEngineVolume, finishMaxSpeed, finishAmountOfDoor, colorOfCars[numberOfColor], random.nextBoolean(), brandOfCars[numberOfBrand], modelOfCars[numberOfBrand]);
        }
        return cars;
    }

    public static int randomAction(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static double randomAction(double min, double max) {
        max -= min;
        return (Math.random() * max) + min;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static void printArray(Car[] arrayOfCars) {
        for (Car element : arrayOfCars) {
            System.out.println(element);
        }
    }
}
