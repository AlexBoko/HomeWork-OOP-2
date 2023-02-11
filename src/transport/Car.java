package transport;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int capacity;
    private boolean summerTures;
    private Key key;

    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "Удаленный запуск двигателя" : "Без удаленного запуска двигателя") + ", " +
                    (withoutAccess ? "Безключевой доступ" : "Безключевой доступ отсутствует");
        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String transmission,
               String bodyType,
               String regNumber,
               int capacity,
               boolean summerTures,
               Key key) {
        super(brand, model, year, country, color, maxSpeed);

        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Sedan";
        }
        this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTures = summerTures;
        setKey(key);
    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }



    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "MКПП";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "y000yy000";
        }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTures() {
        return summerTures;
    }

    public void setSummerTures(boolean summerTures) {
        this.summerTures = summerTures;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTures = false;
        }
        if ((month >= 4 && month <= 10)) {
            summerTures = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                ", Объем двигателя = " + engineVolume +
                ", Коробка передач = '" + transmission + '\'' +
                ", Тип кузова = '" + bodyType + '\'' +
                ", Регистрационный номер = '" + regNumber + '\'' +
                ", Кол - во мест = '" + capacity + '\'' +
                (summerTures ? "летняя" : "зимняя") + " резина" + '\'' +
                key;
    }
}
