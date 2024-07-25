package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.VeiculosRentavelService;

import java.util.ArrayList;
import java.util.List;

public class CClasseGenerica01{
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>(List.of(new Carro("Mercedes"), new Carro("BMW")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        VeiculosRentavelService<Carro> rentavelServiceCarro = new VeiculosRentavelService<>(carros);
        VeiculosRentavelService<Barco> rentavelServiceBarco = new VeiculosRentavelService<>(barcos);

        Carro carro = rentavelServiceCarro.buscarVeiculoDisponivel();
        rentavelServiceCarro.retornarVeiculoAlugado(carro);

        System.out.println("--------------------------------");

        Barco barco = rentavelServiceBarco.buscarVeiculoDisponivel();
        rentavelServiceBarco.retornarVeiculoAlugado(barco);
    }
}
