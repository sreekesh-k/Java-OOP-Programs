
//java supports multiple interfaces not multiple inheritance
import java.io.*;

interface i1 {
    public void disp();
}

interface i2 {
    public void print();
}

class c1 implements i1, i2 {
    public void disp() {
        System.out.println("Of interface i1");
    }

    public void print() {
        System.out.println("Of interface i2");
    }
}

public class multipleInterface {
    public static void main(String[] args) {
        c1 obj = new c1();// here if it was i1 obj = new c1(); then it wont be able to acces the print
                          // method which is in the i2
        obj.disp();
        obj.print();
    }
}
