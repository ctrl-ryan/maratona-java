package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");

        Professor professor1 = new Professor("Professor A");
        Professor professor2 = new Professor("Professor B");
        Professor professor3 = new Professor("Professor C");

        Professor[] professores = {professor1, professor2, professor3};

        Escola escola1 = new Escola("NomeEscola A", professores);

        escola1.imprime();

        Professor professor4 = new Professor("Professor D");
        Professor professor5 = new Professor("Professor E");
        Professor professor6 = new Professor("Professor F");
        Professor professor7 = new Professor("Professor G");

        Escola escola2 = new Escola("NomeEscola B");
        escola2.setProfessores(new Professor[]{professor4,professor5,professor6,professor7});

        escola2.imprime();

    }
}

