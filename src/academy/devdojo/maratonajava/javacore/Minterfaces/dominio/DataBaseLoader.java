package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados.");
    }
}
