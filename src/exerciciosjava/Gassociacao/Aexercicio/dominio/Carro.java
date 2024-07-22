package exerciciosjava.Gassociacao.Aexercicio.dominio;

public class Carro {
    private String nomeModelo;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nomeModelo='" + nomeModelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
