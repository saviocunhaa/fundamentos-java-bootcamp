package CatalogoLivros;

import ListaDeTarefas.Tarefa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros = new ArrayList<>();
    Calendar cal = Calendar.getInstance();
    private int anoAtual = cal.get(Calendar.YEAR);

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public void pesquisarPorAutor(String autor) {
        List<Tarefa> pesquisaListaLivros = new ArrayList<>();

        for (Livro l : listaLivros){
            if (l.getAutor().equals(autor)){
                System.out.println("Autor: " + l.getAutor() + " \n" +
                        "Titulo: " + l.getTitulo() + "\n"+
                        "Ano: " + l.getAnoPublicacao());
            }
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisaPorAno = new ArrayList<>();
        for (Livro l : listaLivros){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                pesquisaPorAno.add(l);

            }
        }
        return pesquisaPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){

        Livro primeiroLivro = null;

        for (Livro l : listaLivros){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                primeiroLivro = l;
            }
        }
        return primeiroLivro;
    }

    public void listarLivros(){
        System.out.println(listaLivros);
    }
}
