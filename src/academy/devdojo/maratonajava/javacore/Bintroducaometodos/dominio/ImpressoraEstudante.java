package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

    public class ImpressoraEstudante {
        public void imprima(Estudante estudanteMetodo){
            System.out.println(estudanteMetodo.nome);
            System.out.println(estudanteMetodo.idade);
            System.out.println(estudanteMetodo.sexo);
            estudanteMetodo.nome = "josé";
        }
    }
