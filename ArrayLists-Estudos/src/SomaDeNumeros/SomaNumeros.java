package SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    }


    public void adicionarNumero(int numero) {
        this.numerosLista.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numerosLista)
            soma += numero;
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : numerosLista) {
            if (numero >= maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }


    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : numerosLista) {
            if (numero <= menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;

    }

    public void exibirNumero(){
        System.out.println(this.numerosLista);
    }
}
