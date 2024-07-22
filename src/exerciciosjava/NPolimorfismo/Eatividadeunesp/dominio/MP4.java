package exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio;

public class MP4 extends Arquivo{
    private int numeroVisitas;

    public MP4() {
        super();
    }

    public MP4(int kbytes, double preco, String autor) {
        super(kbytes, preco, autor);
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    @Override
    public String getTipo() {
        return super.getTipo() + "MP4";
    }

}
