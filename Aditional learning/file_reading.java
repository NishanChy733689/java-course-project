import java.io.*;
import java.util.Objects;
import java.util.Scanner;
public class file_reading {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(
                new FileWriter("C:\\Users\\Admin\\Desktop\\java course\\Aditional learning\\new.txt")
        );
        Scanner input=new Scanner(System.in);
        boolean b = !(Objects.equals(input.nextLine(), "end"));
        StringBuilder text= new StringBuilder();
        while(b) {
            if (!(Objects.equals(input.nextLine(), "end "))) b = true;
            else b = false;
            text.append(input.next());
        }
        bw.close();

    }
}
