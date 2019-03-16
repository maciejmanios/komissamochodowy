package komissamochodowy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addcar {

    public static  Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<Car>();

     public Car addCar() {

        Car car = new Car();

        System.out.println("Podaj cene auta");
        BigDecimal price = scanner.nextBigDecimal();
        car.setPrice(price);
        System.out.println("Podaj kolor auta");
        String colour = scanner.next();
        car.setColour(colour);
        System.out.println("Podaj model auta");
        String model = scanner.next();
        car.setModel(model);
        System.out.println("Podaj liczbe drzwi auta");
        Integer doors = scanner.nextInt();
        car.setDoors(doors);
        System.out.println("Podaj przebieg auta");
        Integer mileage = scanner.nextInt();
        car.setMileage(mileage);
return car;
    }
}