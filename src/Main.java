import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "Yellow",
                2015,
                "Russia",
                "МКПП",
                "Sedan",
                "е777кх000",
                5,
                true,
                null);
        System.out.println(lada);

        Car audi = new Car(
                "Audi",
                "A8",
                3.0,
                "Black",
                2020,
                "Germany",
                "АКПП",
                "Sedan",
                "a000oo000",
                4,
                true,
                new Car.Key(true, true));
        System.out.println(audi);

        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Black",
                2021,
                "Germany",
                "МКПП",
                "Kupe",
                "o999oo000",
                5,
                false,
                new Car.Key(true, false));


        System.out.println(bmw);

        Car kia = new Car(
                "Kia",
                "Sportage",
                2.4,
                "Red",
                2018,
                "South Korea",
                "MKПП",
                "Sedan",
                "e666кх000",
                3,
                false,
                null);


        System.out.println(kia);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Orange",
                2016,
                "South Korea",
                "АКПП",
                "Купе",
                "o444oo444",
                5,
                true,
                new Car.Key(false, true));

        System.out.println(hyundai);
    }
}
