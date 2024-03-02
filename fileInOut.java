import java.util.*;
import java.io.*;

// from one file copy the data to another file
public class fileInOut {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileOutputStream fout;
        FileInputStream fin;
        try {
            System.out.println("Enter The Name of the Source file: ");
            String sname = s.nextLine();
            fin = new FileInputStream(sname);
            System.out.println("Enter The Name of the Destination file: ");
            String dname = s.nextLine();
            fout = new FileOutputStream(dname);
            byte b[];
            b = new byte[5];
            int n = fin.read(b, 0, 5);
            while (n != -1) {
                fout.write(b, 0, n);
                n = fin.read(b, 0, 5);
            }
            fout.close();
            fin.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
