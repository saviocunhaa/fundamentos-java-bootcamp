import java.util.List;
import java.util.stream.Stream;

public class Supplier {
    public static void main(String[] args) {

       // Supplier saudacao = () -> "Ola";

        List<String> listaSaudacao = Stream.generate(() -> "Ola")
                .limit(5)
                .toList();


        listaSaudacao.forEach(System.out::println);


    }
}
