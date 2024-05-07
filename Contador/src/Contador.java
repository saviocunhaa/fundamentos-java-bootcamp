import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro Valor");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o Segundo Valor");
        int valor2 = scanner.nextInt();

        try {
            contar(valor1,valor2);
        } catch ( ParametrosInvalidosException exception){
            System.out.println("segundo numero deve ser maior que o primeiro");
        }
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException{
        if (valor1 > valor2){
            int repeticao = valor1 - valor2;
            for (int i = 1; i <= repeticao; i++ ){
                System.out.println("Imprimindo numero " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}