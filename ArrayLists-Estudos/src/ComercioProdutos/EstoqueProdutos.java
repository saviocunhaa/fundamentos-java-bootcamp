package ComercioProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produtos> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double estoqueTotal = 0d;
        if (!produtosMap.isEmpty()){
            for(Produtos p : produtosMap.values()){
                estoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return estoqueTotal;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produtos p : produtosMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoCaro = p;
            }
        }
        return produtoCaro;
    }

    public Produtos obterProdutoMaisBarato(){
        Produtos produtoBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for(Produtos p : produtosMap.values()){
            if (p.getPreco() < menorPreco){
                produtoBarato = p;
            }
        }
        return produtoBarato;
    }


}
