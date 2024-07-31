package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class AOuterClasses02 {
    private String name = "Ryan";

    class Internal {
        String name = "exemplo";
        public void print() {
            System.out.println(this.name);//nesse caso, "this" se refere a classe Internal.
            System.out.println(AOuterClasses02.this.name);// já aqui, "this" se refere à classe AExternal02.
        }
    }

    public static void main(String[] args) {
        new AOuterClasses02().new Internal().print();
    }
}
