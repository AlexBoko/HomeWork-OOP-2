package transport;

public class Truck extends Transport <DriverC> {

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMuve() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит - стоп у грузовика");
    }

    @Override
    public void tmeBestCircleTime() {
        int minBound = 80;
        int maxBound = 190;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах" + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость  для грузовика " + maxSpeed);

    }
}