package transport;

public class Car extends Transport <DriverB> {

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMuve() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит - стоп у автомобиля");
    }

    @Override
    public void tmeBestCircleTime() {
        int minBound = 70;
        int maxBound = 110;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах" + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость  для автомобиля " + maxSpeed);

    }
}
