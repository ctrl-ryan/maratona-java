package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametro03 {
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

        //Filtrar carros antes de 2018:
        List<Car> carsBefore2018 = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2018;
            }
        });
        System.out.println(carsBefore2018);


        //Filtrar inteiros menores que 10:
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        List<Integer> filterMinor = filter(integers, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 8;
            }
        });
        System.out.println(filterMinor);

//====================================================================================================================

    //Utilizando LAMBDAS:

        carsBefore2018 = filter(cars, car -> car.getYear() < 2018);
        filterMinor = filter(integers, num -> num < 8);


    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
