package arquivos;

import java.io.File;
import java.util.Scanner;

public class pastas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //localiza as pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // localiza os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        //cria uma subpasta
        boolean success = new File(strPath + "\\subdir").mkdir(); // cria subpasta "subdir"
        System.out.println("Directory created succesfully: " + success);
        sc.close();

    }
}
