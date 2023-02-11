package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private String maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setColor(color);
        setMaxSpeed(Integer.parseInt(String.valueOf(maxSpeed)));
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "White";
        }
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        }
        this.maxSpeed = String.valueOf(maxSpeed);
    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "Марка = '" + brand + '\'' +
                ", Модель = '" + model + '\'' +
                ", Цвет кузова = '" + color + '\'' +
                ", Год производства = " + year +
                ", Страна сборки = '" + country + '\'' +
                ", Максимальная скорость = '" + maxSpeed;
    }
}

