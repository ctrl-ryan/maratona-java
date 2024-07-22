package academy.devdojo.maratonajava.javacore.Qstrings.teste;


public class StringTest01 {
    public static void main(String[] args) {
        //nome e nome2 são strings criadas dentro do String Pool e referenciam a mesma string no pool, por isso nome
        // == nome2 --> true.
        String nome = "Ryan";
        String nome2 = "Ryan";
        System.out.println(nome == nome2);


        //já o nome3 é uma string criada fora da string pool, por isso nome == nome3 --> false.
        String nome3 = new String("Ryan");
        System.out.println(nome == nome3);

        //já se eu usar .intern();, a string fora do pool entrará dentro do pool e referenciará a mesma string que
        // nome e nome2.

        System.out.println(nome == nome3.intern());


        /*
            meuNome.concat("Rodrigues"); cria uma nova string "Ryan Rodrigues" fora do pool
            meuNome = meuNome.concat("Rodrigues"); coloca "Ryan Rodrigues" na variável meuNome, mas nao adiciona
            "Ryan Rodrigues" no pool. Por isso: meuNome == meuNome2 --> false
            no pool terá apenas "Ryan" e "Rodrigues", para adicionar "Ryan Rodrigues", precisará usar meuNome.intern();
         */

        String meuNome = "Ryan";
        meuNome.concat(" Rodrigues");
        meuNome = meuNome.concat(" Rodrigues");

        String meuNome2 = "Ryan Rodrigues";

        System.out.println(meuNome == meuNome2); //false
        System.out.println(meuNome.intern() == meuNome2); //true
    }
}
