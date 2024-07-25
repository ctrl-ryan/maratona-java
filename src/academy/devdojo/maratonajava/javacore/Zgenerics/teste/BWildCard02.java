package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.para.exemplos.*;

import java.util.ArrayList;
import java.util.List;

public class BWildCard02 {

    public static void main(String[] args) {
        //Lista de Cachorro e Gato.
        List<Cachorro> cachorros = List.of(new Cachorro());
        List<Gato> gatos = List.of(new Gato());

        //Arrays de Cachorro e Gato
        Cachorro[] cachorrosArray = new Cachorro[]{new Cachorro()};
        Gato[] gatosArray = new Gato[]{new Gato()};

        //Lista de Animal
        List<Animal> animals = new ArrayList<>(List.of(new Cachorro(), new Gato()));

        //Lista de Objeto
        List<Object> objects = new ArrayList<>(List.of(new Object()));

        //Lista para exemplos de polimorfismo
        List<ClasseA> classesA = new ArrayList<>(List.of(new ClasseA()));
        List<ClasseB> classesB = new ArrayList<>(List.of(new ClasseB()));
        List<ClasseC> classesC = new ArrayList<>(List.of(new ClasseC()));
        List<ClasseD> classesD = new ArrayList<>(List.of(new ClasseD()));
        List<ClasseE> classesE = new ArrayList<>(List.of(new ClasseE()));

        //Testes com explicações no corpo de cada método.
        printConsultaArray(cachorrosArray);
        printConsultaList(cachorros);
        printConsultaListAnimal(animals);
        printConsultaListExtendsAnimal(cachorros);

        printConsultaListSuper(classesB);
        printConsultaListSuper(classesC);


    }

    public static void printConsultaArray(Animal[] animals) {
//        animals[0] = new Gato();

        /*Usando arrays, você pode acabar colocando um Gato em um array de Cachorros, ocasionando em uma exceção.
        Isso ocorre, pois não é feito verificações de tipos em tempo de compilação.*/
    }

    public static void printConsultaList(List animals) {
//        animals.add(new Gato());

        /* Caso use List sem específicar dentre "< >" o tipo, também pode acontecer de adicionar, por exemplo, um
        Gato em uma lista de Cachorro. Por isso ao invés de List, devemos colocar List<Animal>, assim o código não
        compilará por nao ter certeza se os tipos estão certos.*/
    }

    public static void printConsultaListAnimal(List<Animal> animals) {

        animals.add(new Gato());
        animals.add(new Cachorro());
//        animals.add(new Object()); <- não posso.

        /*Agora nem sequer consigo passar um tipo Cachorro ou Gato para este método, para ter a certeza de não ocasionar problema. Posso passar apenas animal, e posso adicionar elementos que sao "filhos" de Animal. */
    }

    public static void printConsultaListExtendsAnimal(List<? extends Animal> animals) {
//        animals.add(new Gato());  // -> Não posso.
//        animals.add(new Cachorro());  // -> Não posso.

        //Por ser uma Lista que aceita elementos que estendem Animal, eu poderia passar uma lista de Gato e tentar adicionar um Cachorro à lista de gatos, e isso ocasionaria um erro. Então por esse motivo, não é possível adicionar elementos a lista.
    }

    public static void printConsultaListSuper(List<? super ClasseC> classes) {
//       classes.add(new ClasseB()); //<- Não posso
       classes.add(new ClasseC());
       classes.add(new ClasseD());

       //Podemos adicionar classes-filho de ClasseC, pois tudo passará no teste de polimorfismo. Exemplo: Se eu adicionar uma ClasseD, vai ser possível, pois ela é filha de ClasseC, e o mesmo vale para ClasseD.

       //Em uma lista de Animal, eu posso ter Cachorro e Gato. Assim como em uma lista de ClasseC, eu posso ter ClasseD e ClasseE.
    }
}

