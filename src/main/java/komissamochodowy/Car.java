package komissamochodowy;


import java.math.BigDecimal;

public class Car {

    private BigDecimal price;
    private String colour;
    private String model;
    private int doors;
    private int mileage;

    public Car() {
    }

    public Car(BigDecimal price, String colour, String model, int doors, int mileage) {
        this.price = price;
        this.colour = colour;
        this.model = model;
        this.doors = doors;
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", mileage=" + mileage +
                '}';
    }
}
