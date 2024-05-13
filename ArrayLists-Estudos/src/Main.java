import CarrinhoDeCompras.CarrinhoCompras;
import ListaDeTarefas.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("----- LISTA DE TAREFAS -----");
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("tarefa 01");
        listaTarefas.adicionarTarefa("tarefa 02");
        listaTarefas.adicionarTarefa("tarefa 03");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("tarefa 01");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefa();

        System.out.println("----- CARRINHO DE COMPRAS -----");

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("sal", 1, 3);
        carrinhoCompras.adicionarItem("arroz", 10, 8);
        carrinhoCompras.adicionarItem("bolacha", 30.0, 3);

        carrinhoCompras.exibirItens();

        System.out.println(carrinhoCompras.calcularValorTotal());

        carrinhoCompras.removerItem("sal");
        carrinhoCompras.exibirItens();

    }
}