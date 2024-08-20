package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;


public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "ID nao pode ser 'null'");
        Objects.requireNonNull(nome, "\"nome\" não pode ser 'null'");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", preco=" + preco +
               ", quantidade=" + quantidade +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Manga outroManga) {
//    Lógica a se aplicar:
//
//      se this.id > outroManga.id -> return 1;
//      se this.id == outroManda.id -> return 0;
//      se this.id < outroManda.id -> return -1;
//
//   Aplicando a lógica:
//
//      return this.id > outroManga.getId() ? 1 : this.id == outroManga.getId()? 0 : -1;
//
//   ou então:
//
        return this.id.compareTo(outroManga.getId());//<- ordenando por ID.
//        return this.nome.compareTo(outroManga.getNome()); <- Ordenar por nome.
//        return Double.compare(preco, outroManga.getPreco());//<- Ordenando por preço;
//
//        return Double.valueOf(preco).compareTo(outroManga.getPreco()); //<- usando o por preço
    }

    public Long getId() {
        return id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


}
