package exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio;

public class MP3 extends Arquivo {
    private int numeroDownload;

    public MP3() {
        super();
    }

    public MP3(int kbytes, double preco, String autor) {
        super(kbytes, preco, autor);
    }

    public void setNumeroDownload(int numeroDownload) {
        this.numeroDownload = numeroDownload;
    }

    @Override
    public String getTipo() {
        return  super.getTipo() + "MP3";
    }

    @Override
    public String printDados() {
        return super.printDados();
    }
}
