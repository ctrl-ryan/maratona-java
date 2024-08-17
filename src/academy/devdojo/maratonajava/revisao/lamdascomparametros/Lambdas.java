package academy.devdojo.maratonajava.revisao.lamdascomparametros;

public class Lambdas {
    public static void main(String[] args) {
/*===========================================================================================================
Quando o método de uma interface necessita de parâmetros nós podemos dar outros nomes a esses parâmetros ao sobrescrevermos esses métodos em classes que implementam essa tal interface. Por exemplo: Na classe Printable temos um método chamado print, que necessita de um sufixo "print(String suffix);". Ao implementar a interface Printable em outra classe, por exemplo, uma classe chamada "PrintableImplementation", nós podemos sobrescrever o método "print(String suffix);" e renomear o parâmetro para "print(String anotherName);". Isso tudo é importante para entender o funcionamento de classes anônimas e lambdas com interfaces que necessitam de argumentos para serem usáveis.
 ==========================================================================================================*/

    //Aqui usamos uma classe anônima uma implementação do método 'print();' da interface Printable. Observe que o parâmetro que originalmente se chamava "suffix" na interface Printable, agora se tornou apenas um "s".
        Printable printable1 = new Printable() {
            @Override
            public void print(String s) {
                System.out.println("meow" + s);
            }
        };

    //Aqui usamos um lambda para implementação do método 'print();' da interface Printable. Também mudamos o nome do parâmetro que originalmente era "suffix".



    }

    static void printThing(Printable thing) {
    }
}
