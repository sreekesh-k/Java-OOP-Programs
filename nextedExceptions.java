//nexted try catch block and demo of try without catch block, but in such case the 'finally' block is important
public class nextedExceptions {
    public static void main(String[] args) {
        try {
            int a = 5 / 2;
            try {
                a = 10 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(a);
        } finally {
            System.out.println("Here");
        }
    }
}
