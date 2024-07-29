package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class AExternal01 {
    private String name = "Ryan";

    class Internal {
        public void printOutterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        //? Maneiras de acessar métodos de classes internas:


        /// Maneira 1:
        AExternal01 outterClass = new AExternal01();
        Internal internal = outterClass.new Internal();
        internal.printOutterClassAttribute();

        /// Maneira 2:
        AExternal01 outterClass2 = new AExternal01();
        AExternal01.Internal internal2 = outterClass2.new Internal();
        internal2.printOutterClassAttribute();

        /// Maneira 3:
        new AExternal01().new Internal().printOutterClassAttribute();
    }
}
