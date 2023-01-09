public class Car extends Transport {

    //новые параметры (взяты из прошлой домашки, частично)
    private String bodyType;
    private String transmission;

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Автомат";
        }
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "тип кузова не задан";}
    }

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, String bodyType, String transmission) {
        super(brand, model, year, country, color, maxSpeed);
        setBodyType(bodyType);
        setTransmission(transmission);
    }

    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+
                " максимальная скорость составляет: "+maxSpeed +
                "км/ч. Коробка передач: "+transmission+"; Тип кузова: "+
                bodyType;
    }
}
