package arquivos;

import java.io.File;
import java.util.Scanner;

public class caminhoArquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // pega somente o nome do arquivo e despreza o caminho.
        System.out.println("getParent: " + path.getParent()); // pega o caminho sem o arquivo
        System.out.println("getPath: " + path.getPath()); // pega todo o caminho


        sc.close();

    }
}
