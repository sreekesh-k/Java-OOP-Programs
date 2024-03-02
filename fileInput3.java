import java.util.*;
import java.io.*;

//block by block
public class fileInput3 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileInputStream fin;
        try {
            System.out.println("Enter The Name of the file: ");
            String fname = s.nextLine();
            fin = new FileInputStream(fname);
            byte[] b;
            b = new byte[5];
            int n = fin.read(b, 0, 5);// size of bits stored in int n , b array had 5 char now
            while (n != -1) {
                String data = new String(b, 0, n);
                System.out.println(data);
                n = fin.read(b, 0, 5);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
