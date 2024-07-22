package exerciciosjava.NPolimorfismo.Aentendendo.relatorio;

import exerciciosjava.NPolimorfismo.Aentendendo.domain.Animal;
import exerciciosjava.NPolimorfismo.Aentendendo.domain.Cachorro;
import exerciciosjava.NPolimorfismo.Aentendendo.domain.Gato;

public class RelatorioAnimais {
    public static void relatorioAnimais(Animal animal) {
        System.out.println("====RELATÓRIO DOS ANIMAIS====");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Vacina: " + animal.vacinado());
        System.out.println("Fazendo som: " + animal.fazerSom());
        if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            System.out.println("Método específico: " + gato.gatoPulouMuro());
        }
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(cachorro.pegarBolinha());
        }


        System.out.println("=============================");
    }
}
