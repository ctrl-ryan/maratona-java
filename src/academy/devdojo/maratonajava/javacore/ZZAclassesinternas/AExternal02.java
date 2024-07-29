package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class AExternal02 {
    private String name = "Ryan";

    class Internal {
        String name = "exemplo";
        public void printInternalAttribute() {
            System.out.println(this.name);//nesse caso, "this" se refere a classe Internal, e não à classe AExternal02.
            System.out.println(AExternal02.this.name);// já aqui, "this" se refere à classe AExternal02.
        }
    }

    public static void main(String[] args) {
        new AExternal02().new Internal().printInternalAttribute();
    }
}
