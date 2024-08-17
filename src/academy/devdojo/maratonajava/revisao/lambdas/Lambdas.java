package academy.devdojo.maratonajava.revisao.lambdas;

public class Lambdas {
    public static void main(String[] args) {
//============================================================================================================
    //Maneira tradicional: Crio uma interface Printable com um método print(), crio uma classe Cat que implementa Printable e sobrescreve o método print() para poder ser usado no método printThing que necessita de um objeto que implementa Printable:

        Cat myCat = new Cat();
        printThing(myCat);
        
//===========================================================================================================
    //Maneira usando lambdas: Apenas chamo o método que necessita de uma interface Printable e faço diretamente uma implementação do seu método print().

        printThing(() -> System.out.println("meow"));

    //Ou ainda posso criar uma classe com a implementação de Printable e passar pro método como argumento:

        Printable lambdaPrintable = () -> System.out.println("meow");
        printThing(lambdaPrintable);

    //Dessa maneira sequer precisamos criar uma classe que implementa Printable para usar o método (que era o que a classe Cat fazia).

//============================================================================================================
    //Como sabemos, não podemos instânciar uma interface. Mas podemos criar uma instância de uma classe que implementa Printable e sobrescreve o seu método da maneira que quiser. Exemplo com classes anônimas:

        Printable dogPrintable = new Printable() {
            @Override
            public void print() {
                System.out.println("bark!");
            }
        };

    //Com o uso de lambdas, podemos simplificar o uso de classes anônimas:

        Printable dogPrintable2 = () -> System.out.println("bark!");
        printThing(dogPrintable2);


//============================================================================================================
    //Resumo:

    /*Neste exemplo, ao usar uma classe anônima eu estou criando uma instância de uma classe que implementa Printable e sobrescreve seu único método da forma que querer. Então ao passar essa instância para um método que pede Printable como parâmetro, ele usará da maneira que a instância sobrescreveu.

      A grande vantagem de usar lambdas ou classes anônimas, é que eu não preciso criar manualmente uma classe que implementa Printable, sobrescrever seu método, e iniciar Printable no argumento de um método. Eu posso simplesmente fazer uma implementação do método da interface usando: "() -> *implementação*".
     */
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
