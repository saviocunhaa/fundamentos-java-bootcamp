import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {

            System.out.println("Digite a seguinte opções:");
            System.out.println("""
                    1 - Depositar\s
                    2 - Sacar
                    3 - Consultar
                    4 - Encerrar""");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor para deposito");
                    float deposito = scanner.nextFloat();
                    saldo = depositar(deposito, (float) saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja retirar: ");
                    float saque = scanner.nextFloat();
                    saldo = sacar(saque, (float) saldo);
                    break;
                case 3:
                    consultarSaldo((float) saldo);
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static float sacar(float saque, float saldo) {
        if (saque > saldo) {
            System.out.println("Saldo Insuficiente, seu saldo atual é:" + saldo);
        } else {
          saldo -= saque;
          System.out.println("Saque realizado com sucesso!");
        }
        return saldo;
    }

    private static float depositar(float deposito, float saldo){
        saldo += deposito;
        System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
        return saldo;
    }

    private static void consultarSaldo(float saldo){
        System.out.println("Seu Saldo é de: " + saldo);
    }
}
