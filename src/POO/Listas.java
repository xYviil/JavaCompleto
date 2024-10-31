package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main (String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Vinícius");
        list.add("Salete");
        list.add("Natália");
        list.add(2, "Rudinei");
        list.add("Guilherme");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        list.remove("Salete"); // pode-se remover através do numero tb
        list.removeIf(x -> x.charAt(0) == 'V');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------");
        System.out.println("Index of Guilherme: " + list.indexOf("Guilherme")); // acha a posicao de algo na lista
        System.out.println("-----------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').toList(); // Nomes começados com "N"

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        System.out.println(name);




    }
}
