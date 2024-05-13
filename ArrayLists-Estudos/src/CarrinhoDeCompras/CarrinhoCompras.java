package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinhoCompra;

    public CarrinhoCompras(){
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : carrinhoCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoCompra.removeAll(itemParaRemover);
    }

    public Double calcularValorTotal(){
        double valorTotal = 0.0;
        double somaCarrinho = 0.0;
        for (Item i : carrinhoCompra){
            double preco = i.getPreco();
            int quantidade = i.getQuantidade();
            valorTotal = preco * quantidade;
            somaCarrinho +=valorTotal;
        }
        return somaCarrinho;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompra);
    }
}
