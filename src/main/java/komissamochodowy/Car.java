package komissamochodowy;


import java.math.BigDecimal;

public class Car {

    private BigDecimal price;
    private String color;
    private String model;
    private BigDecimal dors;
    private BigDecimal mileage;

    public Car(BigDecimal price, String color, String model, BigDecimal dors, BigDecimal mileage) {
        this.price = price;
        this.color = color;
        this.model = model;
        this.dors = dors;
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getDors() {
        return dors;
    }

    public void setDors(BigDecimal dors) {
        this.dors = dors;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }
}
