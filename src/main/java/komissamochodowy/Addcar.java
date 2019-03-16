package komissamochodowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addcar {
    Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<Car>();

    public static void main(String[] args) {

        int end = 0;
        do {
            System.out.println("Podaj cene auta");
            System.out.println("Podaj color auta");
            System.out.println("Podaj model auta");
            System.out.println("Podaj liczbe drzwi auta");
            System.out.println("Podaj przebieg auta");

            switch (end) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:

            }
        }while (end==9);
    }
}