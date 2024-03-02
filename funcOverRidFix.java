//Function over riding might lead to a different output if the methods in parent class and inherited class have same name
//progtam to fix the problemm.. using the 'super' keyword
//this program has a special constructor case 
import java.io.*;

class person {
    int age;
    String name;

    public person() {
        age = 0;
        name = " ";
    }

    public person(int a, String n) {
        age = a;
        name = n;
    }

    public void disp() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class teacher extends person {

    String sub;

    public teacher(int a, String n, String s) {
        // fix super(a,n);
        sub = s;
    }

    public void disp() {
        // super.disp();
        System.out.println("Subject: " + sub);
    }
}

public class funcOverRidFix {
    public static void main(String[] args) {
        person p = new person(30, "SSS");
        teacher t = new teacher(30, "ABC", "MCA");
        t.disp();
        p.disp();
    }

}
