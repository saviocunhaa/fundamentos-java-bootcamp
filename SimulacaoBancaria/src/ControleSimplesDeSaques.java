import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor do limite:");
        double limiteDiario = scanner.nextDouble();
        double valorsaque = 0;

        for (int i = 0; valorsaque <= limiteDiario; i++) {
            System.out.println("Qual valor do Saque:");
            valorsaque = scanner.nextDouble();
            limiteDiario -= valorsaque;
            System.out.println("Saque realizado. Limite restante:" + limiteDiario);
        }
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
    }
}

