import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("teks.txt"))) {
            writer.write("Nama saya Raka");
            writer.newLine();
            writer.write("NPM saya 247006111172");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
