
//simple program to demonstrate the use of 'instanceof' operator(not a keyword)
import java.io.*;

interface Ishape {
    public void disp();
}

class c1 implements i1 {
    public void disp() {
        System.out.println("In c1");
    }
}

class c2 implements i1 {
    public void disp() {
        System.out.println("In c2");
    }
}

public class instanceofop {
    public static void main(String[] args) {
        il obj = new il[3];
        obj[0] = new c1();
        obj[1] = new c2();
        obj[2] = new c1();
        for (int i = 0; i < 3; i++) {
            if (obj[i] instanceof c1) {
                c1 p = (c1) obj[i];// casting ..similar to int a= (float)b;
                p.disp();
            } else if (obj[i] instanceof c2) {
                c2 q = (c2) obj[i];
                q.disp();
            }
        }
    }

}
