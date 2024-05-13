import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble(); // Lê o limite diário

        // Crie um loop 'for' para iterar sobre os saques
        for (;;) { // Loop infinito, controlado por condições internas

            double valorSaque = scanner.nextDouble(); // Solicita ao usuário o valor do saque

            // Verifique se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop se o valor do saque for 0
            }

            // Se o valor do saque não ultrapassar o limite diário
            if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque; // Subtrai o valor do saque do limite diário
                System.out.printf("Saque realizado. Limite restante: %.2f\n", limiteDiario);
            } else {
                // Informa que o limite diário foi atingido
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop se o saque exceder o limite
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
