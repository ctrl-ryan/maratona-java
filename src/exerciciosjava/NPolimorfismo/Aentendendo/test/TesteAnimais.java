package exerciciosjava.NPolimorfismo.Aentendendo.test;

import exerciciosjava.NPolimorfismo.Aentendendo.domain.Cachorro;
import exerciciosjava.NPolimorfismo.Aentendendo.domain.Gato;
import exerciciosjava.NPolimorfismo.Aentendendo.relatorio.RelatorioAnimais;

public class TesteAnimais {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Gatinho",3);
        Cachorro cachorro1 = new Cachorro("Cachorrinho",5);

        RelatorioAnimais.relatorioAnimais(gato1);

    }
}
