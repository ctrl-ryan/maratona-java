package exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio;

public class LivroDigital extends Livro{
    private int tamanhoArquivo;
    private String formato;

    public LivroDigital(String titulo, int tamanhoArquivo, String formato) {
        super(titulo);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "tamanhoArquivo=" + tamanhoArquivo +
                ", formato='" + formato + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                ", id=" + id +
                '}';
    }

    @Override
    public void getDetalhes() {
        super.getDetalhes();
        System.out.println("Formato: "+this.formato);
        System.out.println("Tamanho do Arquivo: " + this.tamanhoArquivo);
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
