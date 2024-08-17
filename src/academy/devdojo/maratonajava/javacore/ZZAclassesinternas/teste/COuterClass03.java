package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;


/*
 class Nested {
    void print(){
        System.out.println(new DOuterClass03().name);
    }
}
*/


public class COuterClass03 {
    String name = "Ryan";
    static class Nested { //por essa classe ser "static", é como se ela nao estivesse dentro de outra classe, pois você pode acessá-la se qualquer maneira.
        private String sobrenome= "Rodrigues";
        void print(){
            System.out.print(new COuterClass03().name);//Por ser uma classe estática, você nao pode acessar atributos que nao sejam estáticos. Ou seja, nao podemos imprimir "name" diretamente, precisamos instanciar a classe DOuterClass03 e conseguir o seu atributo.
            System.out.println(" " + sobrenome);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested(); //Posso instânciar Nested sem uma instância de DOuterClass03, pois Nested é estático.
        nested.print();
    }
}
