package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class AOuterClasses01 {
    private String name = "Ryan";

    class Internal {
        public void printOutterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        //? Maneiras de acessar métodos de classes internas:


        /// Maneira 1:
        AOuterClasses01 outterClass = new AOuterClasses01();
        Internal internal = outterClass.new Internal();
        internal.printOutterClassAttribute();

        /// Maneira 2:
        AOuterClasses01 outterClass2 = new AOuterClasses01();
        AOuterClasses01.Internal internal2 = outterClass2.new Internal();
        internal2.printOutterClassAttribute();

        /// Maneira 3:
        new AOuterClasses01().new Internal().printOutterClassAttribute();
    }
}
