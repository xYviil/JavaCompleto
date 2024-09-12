package OutrosTópicos;

public class FuncoesInteressantesString {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG       ";

        String s01 = original.toLowerCase(); // transforma tudo em minusculo
        String s02 = original.toUpperCase(); // transforma em maiusculo
        String s03 = original.trim(); // retira espaços
        String s04 = original.substring(2); // pega a partir do numero escolhido
        String s05 = original.substring(2, 9); // de um até outro
        String s06 = original.replace("a", "x"); // substitui
        String s07 = original.replace("abc", "xyz"); //substitui
        int i = original.indexOf("bc"); // primeira vez q aparece
        int j = original.lastIndexOf("bc"); // ultima vez q aparece


        System.out.println("Original : " + original + "-");
        System.out.println("toLowerCase : " + s01 + "-");
        System.out.println("toUpperCase - " + s02 + "-");
        System.out.println("trim : " + s03 + "-");
        System.out.println("Substring(2) : " + s04 + "-");
        System.out.println("Substring(2,9):" + s05 + "-");
        System.out.println("replace('a', 'x'):" + s06 + "-");
        System.out.println("replace('abc', 'xyz'):" + s07 + "-");
        System.out.println("indexOf 'bc':" + i);
        System.out.println("lastIndexOf 'bc':" + j);

    String s = "potato apple lemon orange";

    String[] vect = s.split(" ");

    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
    System.out.println(vect[3]);
    }

}
