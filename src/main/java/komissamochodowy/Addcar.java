package komissamochodowy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addcar {

    public static  Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<Car>();

    public static Car addcar() {

        Car car = new Car();

        System.out.println("Podaj cene auta");
        BigDecimal price = scanner.nextBigDecimal();
        cars.setPrice(price);
        System.out.println("Podaj color auta");
        String colour = scanner.nextLine();
        cars.setColour(colour);
        System.out.println("Podaj model auta");
        String model = scanner.nextLine();
        cars.setModel(model);
        System.out.println("Podaj liczbe drzwi auta");
        Integer doors = scanner.nextInt();
        cars.setDoors(doors);
        System.out.println("Podaj przebieg auta");
        Integer mileage = scanner.nextInt();
        cars.setMileage(mileage);
return car;
    }
}