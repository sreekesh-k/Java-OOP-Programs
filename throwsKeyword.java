
//use of 'throws' with the function to catch the exception where the function is invoked
import java.io.*;
import java.util.*;

class cArray {
    int a[], n;

    public void readArray() throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = s.nextInt();
        a = new int[5];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "]");
            a[i] = s.nextInt();
        }
    }

    public void dispArray() throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

public class throwsKeyword {
    // can also throw those same exceptions from main function as well it doesnt
    // necessasirily need catch{}
    public static void main(String[] args) {
        try {
            cArray obj = new cArray();
            obj.readArray();
            obj.dispArray();
        } catch (IOException e1) {
            System.out.println(e1);
        } catch (NumberFormatException e2) {
            System.out.println(e2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
