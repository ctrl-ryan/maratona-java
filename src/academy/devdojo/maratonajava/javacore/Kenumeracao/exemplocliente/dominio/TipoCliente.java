package academy.devdojo.maratonajava.javacore.Kenumeracao.exemplocliente.dominio;

public enum TipoCliente {
    PESSOA_FISICA( 1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int valor;
    public final String nomeRelatorio;

    private TipoCliente( int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio= nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (tipoCliente.nomeRelatorio.equalsIgnoreCase(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        System.out.println("Nome não encontrado");
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}