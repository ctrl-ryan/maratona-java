package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro de retrieveMaxDataSize.");
    }
}
