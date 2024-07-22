package exerciciosjava.NPolimorfismo.Fchatgptatividade.dominio;

public enum Categoria {
    ECONOMICO("Econômico",1.0),
    INTERMEDIARIO("Intermediário",1.5),
    LUXO("Luxo",2.0);

    private final String categoriaPorNome;
    private final double getMultiplicador;

    Categoria(String categoriaPorNome, double multiplicador){
        this.categoriaPorNome = categoriaPorNome;
        this.getMultiplicador = multiplicador;
    }

    public String getCategoriaPorNome() {
        return categoriaPorNome;
    }

    public double getMultiplicador() {
        return getMultiplicador;
    }
}
