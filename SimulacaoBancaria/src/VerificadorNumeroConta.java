import java.util.Scanner;


public class VerificadorNumeroConta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero da Conta");
        String numerConta = scanner.next();

        try {
            verificarNumeroConta(numerConta);
        } catch ( IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8){
            System.out.println("Numero de conta valido");
        } else {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
