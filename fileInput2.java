import java.util.*;
import java.io.*;

//block method..reading entire file , it is not good when file size if large as it needs to create that bic array of bytes 
public class fileInput2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileInputStream fin;
        try {
            System.out.println("Enter The Name of the file: ");
            String fname = s.nextLine();
            fin = new FileInputStream(fname);
            byte[] b;
            b = new byte[fin.available()];// size in bytes of the file
            fin.read(b);
            String data = new String(b, 0, b.length);
            System.out.println(data);
            fin.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
