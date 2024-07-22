package exerciciosjava.Aatividadesgeraisdepoo.Aatividade.dominio;
//Crie uma classe Produto:
//
//A classe deve ter atributos como nome, preço e quantidade em estoque.
//Implemente métodos para adicionar e remover unidades do estoque.
//Crie um método para calcular o valor total em estoque (preço * quantidade).
//Adicione um construtor que inicialize esses atributos.

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    static{
        System.out.println("--------------------------------\nBem vindo a lojinha do Seu Zé!!\n--------------------------------");
    }


    public void revisarPedido(){
        System.out.println(" _______________________________\n| Item: " + this.nome);
        System.out.println("| Preço: R$" + this.preco);
        System.out.println("|Quantidade: " + this.quantidade);
        System.out.println("| Preço final: R$" + calcularPreco());
        System.out.println("|_______________________________");
        System.out.println("***********************************");
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        return preco * quantidade;
    }

    public void adicionarItem(int quantidade) {
        this.quantidade += quantidade;
//        System.out.println("Você adicionou " + quantidade + " itens ao estoque.");
    }

    public void removerItem(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
//            System.out.println("Você retirou " + quantidade + " itens do estoque.");
        } else {
//            System.out.println("Nao foi possivel retirar de estoque");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
