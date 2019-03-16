package komissamochodowy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<Car>();
    private static Addcar addcar = new Addcar();

    public static void main(String[] args) {
        int end = 0;
        do {
            System.out.println("Witaj");
            System.out.println("Wybierz jedna z opcji");
            System.out.println("Wybierz 1 by dodac samochod");
            System.out.println("Wybierz 2 by wyswietlic samochody");
            System.out.println("Wybierz 3 by usunac samochod");
            end=scanner.nextInt();
            switch (end) {
                case 1: {
                    addcar.addCar();
                }
                case 2: //wyswietlanie listy
                case 3: // usuwanie

            }


        }while (end==9);
        System.out.println("Koniec");


    }


    }
