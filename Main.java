import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da lista de pessoas
        System.out.println("Digite a lista de pessoas (ex: Ana-F, João-M, Maria-F):");
        String input = scanner.nextLine();

        // Quebrar a string em uma lista, separando por vírgula
        List<String> pessoas = Arrays.asList(input.split("\\s*,\\s*"));

        // Criar lista apenas com mulheres (genero = "F")
        List<String> mulheres = pessoas.stream()
            .filter(p -> {
                String[] partes = p.split("-");
                return partes.length == 2 && partes[1].equalsIgnoreCase("F");
            })
            .map(p -> p.split("-")[0]) // pegar só o nome
            .collect(Collectors.toList());

        // Exibir a lista de mulheres
        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
