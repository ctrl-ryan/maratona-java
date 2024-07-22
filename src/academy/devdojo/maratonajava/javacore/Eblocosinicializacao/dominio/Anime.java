package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
/*
ordem de inicialização até entao:
1- É alocado um espaço em memória pro objeto.
2- Cada atributo de classe é instanciado com valores defaults ou valores definidos.
3- Bloco de inicialização
4- Construtores
 */
    {
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
       }

    public Anime(){

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}


