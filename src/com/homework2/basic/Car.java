package com.homework2.basic;

import com.homework2.service.CarBrandInterface;
import com.homework2.service.CarProcessingInterface;


public class Car implements CarProcessingInterface, CarBrandInterface, Comparable<Car> {
    private double engineVolume;
    private int maxSpeed;
    private int amountOfDoors;
    private String color;
    private boolean isElectro;
    private String model;
    private String brand;

    public static final String audiConstant = BRANDAUDI;
    public static final String bmwConstant = BRANDBMW;
    public static final String fordConstant = BRANDFORD;
    public static final String porscheConstant = BRANDPORSCHE;
    public static final String skodaConstant = BRANDSKODA;
    public static final String opelConstant = BRANDOPEL;
    public static final String toyotaConstant = BRANDTOYOTA;
    public static final String geelyConstant = BRANDGEELY;
    public static final String kiaConstant = BRANDKIA;
    public static final String hondaConstant = BRANDHONDA;

    public Car() {
    }

    public Car(double engineVolume, int maxSpeed, int amountOfDoors, String color, boolean isElectro, String model, String brand) {
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
        this.amountOfDoors = amountOfDoors;
        this.color = color;
        this.isElectro = isElectro;
        this.model = model;
        this.brand = brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isElectro() {
        return isElectro;
    }

    public void setElectro(boolean electro) {
        isElectro = electro;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (maxSpeed != car.maxSpeed) return false;
        if (amountOfDoors != car.amountOfDoors) return false;
        if (isElectro != car.isElectro) return false;
        if (!color.equals(car.color)) return false;
        if (!model.equals(car.model)) return false;
        return brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(engineVolume);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + maxSpeed;
        result = 31 * result + amountOfDoors;
        result = 31 * result + color.hashCode();
        result = 31 * result + (isElectro ? 1 : 0);
        result = 31 * result + model.hashCode();
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", maxSpeed=" + maxSpeed +
                ", amountOfDoors=" + amountOfDoors +
                ", color='" + color + '\'' +
                ", isElectro=" + isElectro +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("The car is moving now. Its distance is 100km.");
    }

    @Override
    public int move(int speed) {
        int distance = 100;
        int time = distance / speed;
        return time;
    }

    @Override
    public int compareTo(Car o) {
        return this.getMaxSpeed() - o.getMaxSpeed();
    }
}
