import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}