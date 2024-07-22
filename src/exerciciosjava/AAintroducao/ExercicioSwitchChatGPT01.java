package exerciciosjava.AAintroducao;

public class ExercicioSwitchChatGPT01 {
    public static void main(String[] args) {
        int numeroMes = 5;
        String mesDoAno;
        switch (numeroMes) {
            default:
                mesDoAno = "opçao inválida";
                break;
            case 1:
                mesDoAno = "janeiro";
                break;
            case 2:
                mesDoAno = "fevereiro";
                break;
            case 3:
                mesDoAno = "março";
                break;
            case 4:
                mesDoAno = "abril";
                break;
            case 5:
                mesDoAno = "maio";
                break;
            case 6:
                mesDoAno = "junho";
                break;
            case 7:
                mesDoAno = "julho";
                break;
            case 8:
                mesDoAno = "agosto";
                break;
            case 9:
                mesDoAno = "setembro";
                break;
            case 10:
                mesDoAno = "outubro";
                break;
            case 11:
                mesDoAno = "novembro";
                break;
            case 12:
                mesDoAno = "dezembro";
                break;
        }
        System.out.println(mesDoAno);
    }
}
