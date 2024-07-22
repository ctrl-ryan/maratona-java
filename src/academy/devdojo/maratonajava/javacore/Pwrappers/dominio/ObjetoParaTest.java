package academy.devdojo.maratonajava.javacore.Pwrappers.dominio;

public class ObjetoParaTest {
    private String name;
    private int idade;

    public ObjetoParaTest(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
