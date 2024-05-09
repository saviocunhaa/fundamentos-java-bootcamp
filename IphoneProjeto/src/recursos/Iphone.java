package recursos;

public class Iphone implements Navegador, ReprodutorMusical, RecursoTelefonico  {
    @Override
    public void exibirPagina() {
        System.out.println("abrindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrir nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar pagina");
    }

    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void inicioCorreioVoz() {
        System.out.println("iniciar correio de voz");
    }

    @Override
    public void tocarMusica() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionado musica");
    }
}
