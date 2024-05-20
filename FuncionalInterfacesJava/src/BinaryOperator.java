import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,5,6);

        int resultado = numeros.stream()
                .reduce(0,Integer::sum);

        System.out.println(resultado);

    }
}
