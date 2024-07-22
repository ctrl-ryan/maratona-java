package exerciciosjava.Dconstrutores.dominio;

public class Exemplo {
    private int x;
    private int y;

    public Exemplo() {
        this(0, 0);
    }

    public Exemplo(int x) {
        this(x, 0);
    }

    public Exemplo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mostrarValores() {
        System.out.println(this.x);
        System.out.println(this.y);
    }

}


