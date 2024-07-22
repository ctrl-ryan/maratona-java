package exerciciosjava.NPolimorfismo.Fchatgptatividade.dominio;

public abstract class Veiculo{
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoPorDia;


    public Veiculo(String marca, String modelo, int ano, double precoPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoPorDia = precoPorDia;
    }

    public double calcularValorAluguel(int dias, Categoria categoria) {
        return this.precoPorDia * dias * categoria.getMultiplicador();

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }
}
