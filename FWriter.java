import java.io.*;
import java.util.*;

class FWriter {
    public static void main(String args[]) {
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(new File("a.txt"));
            bw = new BufferedWriter(fw);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the data/quit to exit");
            String data = s.nextLine();
            while (data != "quit") {
                bw.write(data);
                data = s.nextLine();
            }
            bw.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}