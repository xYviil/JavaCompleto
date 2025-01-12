package POO;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("userName", "Maria"); // adiciona valor
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "48996132569");

        cookies.remove("email"); // remove valor
        cookies.put("phone", "92932424166"); //sobrescreve a chave com o "key" novo

        System.out.println("Contém a chave 'phone': " + cookies.containsKey("phone"));
        System.out.println("Numero de 'phone': " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // se nao existe, valor volta "null"
        System.out.println("Tamanho do cookie: " + cookies.size());

        System.out.println("Todos os cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
