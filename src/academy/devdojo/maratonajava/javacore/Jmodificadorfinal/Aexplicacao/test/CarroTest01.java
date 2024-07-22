package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Aexplicacao.test;


import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Aexplicacao.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

//        ------não posso alterar oq a variável está representando-----
//
//        Nesse caso a variável está referenciando um double:
//        double velocidadeLimite = 100;
//        Carro.VELOCIDADE_LIMITE = velocidadeLimite;
//
//        Nesse caso a variável está representando a referência de um Objeto:
//        Comprador comprador = new Comprador();
//        Carro.COMPRADOR = comprador;

        carro1.COMPRADOR.setNome("José");
        System.out.println(carro1.COMPRADOR.getNome());

    }
}