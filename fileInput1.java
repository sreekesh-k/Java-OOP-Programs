import java.util.*;
import java.io.*;

public class fileInput1 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileInputStream fin;
        try {
            System.out.println("Enter The Name of the file: ");
            String fname = s.nextLine();
            fin = new FileInputStream(fname);
            int ch = fin.read();// read() returns ascii values of the c
            while (ch != -1) {
                System.out.println((char) ch);
                ch = fin.read();
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
