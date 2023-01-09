public class Bus extends Transport{
    private int seatsNumber;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int seatsNumber) {
        super(brand, model, year, country, color, maxSpeed);
        setSeatsNumber(seatsNumber);
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }
    public void setSeatsNumber(int seatsNumber) {
        if (seatsNumber<=1){
            this.seatsNumber=16;
        }else {
        this.seatsNumber = seatsNumber;}
    }

    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+
                " максимальная скорость составляет: "+maxSpeed+"км/ч. Количество мест: "+seatsNumber;
    }
}
