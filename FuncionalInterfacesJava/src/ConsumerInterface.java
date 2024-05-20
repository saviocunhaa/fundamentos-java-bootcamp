
import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // implementando STREAM() Consume intervace CONSUMER<T>
        numeros.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n + " ");
            }
        });
    }
}
