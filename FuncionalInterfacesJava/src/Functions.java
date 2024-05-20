import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        // Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numeroDobradp = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numeroDobradp.forEach(System.out::println);
    }
}
