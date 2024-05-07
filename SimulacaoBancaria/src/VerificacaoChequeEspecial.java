import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu saldo");
        double saldo = scanner.nextDouble();
        System.out.println("digite o valor do saque");
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;



        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque <= saldo){
            saldo -= saque;
            System.out.println("Transação realizada com sucesso. Seu saldo é de: "+ saldo);
        } else if ((saque <= saldo+500)){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }
    }
}
