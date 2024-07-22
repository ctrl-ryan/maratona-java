package exerciciosjava.NPolimorfismo.Fchatgptatividade.test;

import exerciciosjava.NPolimorfismo.Fchatgptatividade.dominio.*;

public class LocacaoTest01 {
    public static void main(String[] args) {
        Veiculo moto = new Moto("Yamaha", "GT499",2015, 50);
        Veiculo carro = new Carro("Volkswagen", "Crossfox", 2015,30 );
        Veiculo caminhao = new Caminhao("Mercedes","VX328", 2014,110);

       Locacao locacao1 = new Locacao(moto,10,Categoria.INTERMEDIARIO);
        System.out.printf("Valor da locação da moto: R$ %.2f \n" , locacao1.calcularTotal());

    }
}
