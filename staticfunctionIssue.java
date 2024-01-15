
//a static function cannot acces non static members
import java.io.*;

class c1 {
    int a;

    public c1() {
        a = 10;
    }

    public static disp(){
        System.out.println("Vale of a is "+ a);//cannot acces a as it is a non static member
    }
}

public class staticfunctionIssue {
    public static void main(String[] args) {
        c1.disp();
    }
}
