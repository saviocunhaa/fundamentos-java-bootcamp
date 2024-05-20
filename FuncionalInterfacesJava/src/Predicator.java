import java.util.Arrays;
import java.util.List;

public class Predicator {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Kotlin", "JS", "C", "Python");

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }
}
