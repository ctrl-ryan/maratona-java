package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
//        double salario = 35000;
//        String taxa;
//        if (salario <= 34712) {
//            taxa = " Taxa de 9.70%";
//        } else if (salario > 34712 && salario < 68507) {
//            taxa = "taxa de 37,35%";
//        } else {
//            taxa = "taxa de 49,50%";
//        }
//        System.out.println(taxa);

        double salarioAnual = 1000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double taxaAnual;
        if (salarioAnual <= 34712) {
            taxaAnual = salarioAnual * primeiraTaxa;
        } else if (salarioAnual > 34712 && salarioAnual < 68507) {
            taxaAnual = salarioAnual * segundaTaxa;
        } else {
            taxaAnual = salarioAnual * terceiraTaxa;
        }
        System.out.println(taxaAnual);
    }
}
