
//predefined exceptions demonstration
import java.io.*;

public class predefExceptionDemo {

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
        } catch (IOException e1) {
            System.out.println("Unable to read from device " + e1);
        } catch (NumberFormatException e2) {
            System.out.println("Input string is not in number format " + e2);
        } catch (ArithmeticException e3) {
            System.out.println("Dr is zero" + e3);
        } catch (Exception e4) {// incase if some unknown error comes, Exception is the parent class of all the
                                // exceptions
            System.out.println("Unknown error " + e4);
        }
    }
}
