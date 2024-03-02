
//finally- this block will execute irrespective of there is an exception ot not even if there is a return statement in the try block
import java.io.*;

public class finaly {
    public static void main(String[] args) {
        int a, b, c;
        String s;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter no1: ");
            s = din.readLine();
            a = Integer.parseInt(s);
            System.out.println("Enter no2: ");
            s = din.readLine();
            b = Integer.parseInt(s);
            c = a / b;
            System.out.println("C = " + c);
            // return; //even if there is a retun statement the finally block will excecute
            // System.exit(0); //this will exit from th program and finally block will not
            // be excecuted
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally {
            System.out.println("I am always here");
        }
    }
}
