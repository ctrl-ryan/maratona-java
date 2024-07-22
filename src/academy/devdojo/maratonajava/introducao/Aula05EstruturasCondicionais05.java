package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana baseado no dia, considerando domingo ser dia 1
        byte dia = 1;
        //dentro de switch podemos ter: char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("DOM");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;
            default:
                System.out.println("Formato Inválido");
        }


        String diaDaSemana = "terça";
        String diaAcademia;
        switch (diaDaSemana) {
            case "segunda":
                diaAcademia = ("Costas e bíceps");
                break;
            case "terça":
                diaAcademia = ("Peito e tríceps");
                break;
            case "quarta":
                diaAcademia = ("Ombro e panturrilha");
                break;
            case "quinta":
                diaAcademia = ("Pernas");
                break;
            case "sexta":
                diaAcademia = ("Costas e bíceps");
                break;
            case "sabado":
                diaAcademia = ("Peito e tríceps");
                break;
            case "domingo":
                diaAcademia = ("Dia de folga");
                break;
            default:
                diaAcademia = "dia inválido";
        }
        System.out.println(diaDaSemana + " é dia de treinar: " + diaAcademia);
    }
}

