package exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios;

public enum Risco {
    BAIXO_RISCO("baixo risco"),
    MEDIO_RISCO("médio risco"),
    ALTO_RISCO("alto risco");

    String riscoString;

    Risco(String risco){
        this.riscoString = risco;
    }

}
