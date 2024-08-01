package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro01 {
    static List<Car> cars = List.of(
            new Car("black", 2011),
            new Car("blue", 2005),
            new Car("red", 1998),
            new Car("red", 2004),
            new Car("white", 2019),
            new Car("green", 2012),
            new Car("green", 1998)
    );

    public static void main(String[] args) {

        System.out.println("VERDES: " + greenCarFilter(cars));
        System.out.println("VERMELHOS: " + redCarFilter(cars));
        System.out.println("DEPOIS DE: "+ carAfter(cars,2010));

    }

    public static List<Car> greenCarFilter(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    public static List<Car> redCarFilter(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    public static List<Car> carAfter(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() > year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
