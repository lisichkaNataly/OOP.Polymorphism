package transport;

public class Truck extends Transport{
    private String brand;
    private String model;
    private double engineVolume;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }



    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public void startDriving() {
        System.out.println("Грузовик! Начни движение!");
    }

    @Override
    public void finishDriving() {
        System.out.println("Грузовик! Закончи движение!");
    }
}
