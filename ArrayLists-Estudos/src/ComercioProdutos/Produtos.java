package ComercioProdutos;

import java.util.Map;

public class Produtos {

    private String nomeProduto;
   private int quantidade;
   private double preco;

    public Produtos(String nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
