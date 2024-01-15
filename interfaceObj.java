
//simple program to demonstrate use of interfaces in program.. basic intoduction to interfaces
//it is not possible to create instance of interface
import java.io.*;

interface i1 {
    public void disp();

    public void print();
}

class c1 implements i1 {
    public void disp() {
        System.out.println("Interface disp");
    }

    public void print() {
        System.out.println("Interface print");
    }

    public void draw() {
        System.out.println("Not Interface Draw");
    }
}

public class interfaceObj {
    public static void main(String[] args) {
        i1 obj = new c1();
        obj.disp();
        obj.print();
        // obj.draw(); //direct invocation not possible
    }
}
