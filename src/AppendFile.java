import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("Appending new text to this file!!!");
            bw.newLine();
            bw.write("It looks like the appending worked perfectly. Hope to do some more work with this file in future");
            bw.newLine();
            bw.write("See you Again!!!");

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}