package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro02 {
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
        //Filtrando carros verdes:

        List<Car> greenCars = filterCar(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);


        //Ou então usando Lambdas:

        List<Car> blackCars = filterCar(cars, car -> car.getColor().equals("black"));
        System.out.println(blackCars);

        List<Car> carsBeforeYear = filterCar(cars, car -> car.getYear() < 2010);
        System.out.println(carsBeforeYear);
    }

    public static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }

        return filteredCar;
    }

}
