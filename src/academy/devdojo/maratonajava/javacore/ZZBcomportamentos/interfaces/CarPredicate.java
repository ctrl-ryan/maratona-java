package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test (Car car);
}
