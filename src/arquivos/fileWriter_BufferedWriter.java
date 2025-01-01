package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_BufferedWriter {

    public static void main(String[] args) {

        String[] lines = new String[] {
                "Good morning", "Good afternoon", "Good night"
        };

        String path = "C:\\Windows\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // o true é pra nao recriar o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
