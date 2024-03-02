import java.util.*;
import java.io.*;

public class fileOutput {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileOutputStream fout;
        try {
            System.out.println("Enter The Name of the file: ");
            String fname = s.nextLine();
            fout = new FileOutputStream(fname);
            System.out.println("Enter the data/quit to exit");
            String data = s.nextLine();
            while (data.equals("quit")) {
                fout.write(data.getBytes());
                data = s.nextLine();
            }
            fout.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
