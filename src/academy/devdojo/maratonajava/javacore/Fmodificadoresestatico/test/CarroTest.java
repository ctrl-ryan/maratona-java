package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(200);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);


        c1.imprima();
        c2.imprima();
        c3.imprima();
    }
}
