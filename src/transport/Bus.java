package transport;

import transport.Transport;

public class Bus extends Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Автобус! Начни движение!");
    }

    @Override
    public void finishDriving() {
        System.out.println("Автобус! Закончи движение!");
    }
}