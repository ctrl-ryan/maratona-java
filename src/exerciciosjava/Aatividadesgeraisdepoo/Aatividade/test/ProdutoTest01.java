package exerciciosjava.Aatividadesgeraisdepoo.Aatividade.test;

import exerciciosjava.Aatividadesgeraisdepoo.Aatividade.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Leite", 6.99, 4);
        produto1.adicionarItem(4);
        produto1.revisarPedido();

        Produto produto2 = new Produto("Balinha", 0.25, 10);
        produto2.adicionarItem(21);
        produto2.removerItem(8);
        produto2.revisarPedido();



    }
}
