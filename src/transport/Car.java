package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public void startDriving() {
        System.out.println("Автомобиль! Нанчи движение!");
    }

    @Override
    public void finishDriving() {
        System.out.println("Автомобиль! Закончи движение!");
    }
}