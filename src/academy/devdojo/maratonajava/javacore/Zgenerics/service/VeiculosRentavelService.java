package academy.devdojo.maratonajava.javacore.Zgenerics.service;


import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Veiculo;

import java.util.List;

public class VeiculosRentavelService <T extends Veiculo>{
    private List<T> veiculosDisponiveis;

    public VeiculosRentavelService(List<T> veiculosDisponiveis){
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel(){
        System.out.println("Buscando carro disponível...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando: " + t.getNome() );
        disponiveis();

        return t;
    }

    public void retornarVeiculoAlugado(T t){
        System.out.println("Devolvendo...");
        veiculosDisponiveis.add(t);
        disponiveis();
    }

    private void disponiveis(){
        System.out.print("Veículos disponíveis para alugar: ");
        for (T veiculosDisponivel : veiculosDisponiveis) {
            System.out.printf("%s | ",veiculosDisponivel.getNome());
        }
        System.out.println();
    }
}
