import java.util.Objects;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;

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
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "color";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "brand";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "model";
        }
        if (year < 1950) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "country";
        }
        setColor(color);// Ура я разобрался!:)
        setMaxSpeed(maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && brand.equals(transport.brand) && model.equals(transport.model) && country.equals(transport.country) && color.equals(transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color);
    }

}
