import CarrinhoDeCompras.CarrinhoCompras;
import CatalogoLivros.CatalogoLivros;
import ListaDeTarefas.ListaTarefas;
import SomaDeNumeros.SomaNumeros;

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


        System.out.println("----- LISTA DE LIVROS -----");
        CatalogoLivros catalogoLivro = new CatalogoLivros();


        catalogoLivro.adicionarLivro("Qualidade Comeca aqui", "Dr. Tom", 2000 );
        catalogoLivro.adicionarLivro("test 2", "savio", 2024 );
        catalogoLivro.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivro.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivro.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);


        catalogoLivro.listarLivros();

        System.out.println("pesquisa");

        catalogoLivro.pesquisarPorAutor("savio");

        System.out.println("pesquisa por ano");
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2000,2012));

        System.out.println("pesquisa por titulo");

        System.out.println(catalogoLivro.pesquisarPorTitulo("Código Limpo"));


        System.out.println("----- SOMA NUMEROS -----");

        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumero();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

    }
}