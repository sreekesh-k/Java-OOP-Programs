import java.io.DataInputStream;
import java.util.*;

class myEx extends Exception {
    String strError;

    public myEx(String s) {
        super();
        strError = s;
    }

    void disp() {
        System.out.println("Error " + strError);
    }
}

public class userdefExceptions {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter no1: ");
            a = s.nextInt();
            System.out.println("Enter no2: ");
            b = s.nextInt();
            if (b == 0) {
                throw new myEx("Dr is Zero");
            }
            c = a / b;
            System.out.println("C = " + c);
        } catch (myEx m) {
            m.disp();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
