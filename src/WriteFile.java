import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hi, this is my first text in this file!!!");
            writer.write("\r\n");
            writer.write("I will be adding my views in this particular file");
            writer.write("\r\n");
            writer.write("Good Bye!!!");
            writer.write("\r\n");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}