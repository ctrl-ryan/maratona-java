package exerciciosjava.Hheranca.B.dominio;

public enum Cargo {
    DESENVOLVEDOR("Programador"){
        @Override
        public double calcularBonus(double salario) {
            return salario * 0.10;
        }
    },
    ANALISTA("Analista"){
        @Override
        public double calcularBonus(double salario) {
            return salario * 0.1;
        }
    },
    GERENTE("Gerente"){
        @Override
        public double calcularBonus(double salario) {
            return salario * 0.15;
        }
    };

    public final String IDENTIFICACAO;

    Cargo(String identificaçao){
        this.IDENTIFICACAO = identificaçao;
    }

    public abstract double calcularBonus(double salario);
}
