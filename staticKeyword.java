/* use of static keyword for methods or functions
- a static function can be invoked without creating any object of the class
-can invoke othe static functions either directly or by using classname.functionname
-can acces only static members directly
*/
class c1 {
    public static disp(){
        System.out.println("In c1 class");
    }
}

class c2 {
    public static disp(){
        System.out.println("In c2 class");
    }
}

public class staticKeyword {
    public static disp(){
        System.out.println("In Main class");
    }

    public static void main(String[] args) {
        disp();// directly as its in the same class
        c1.disp();
        c2.disp();
        // className.FunctionName();
    }
}
