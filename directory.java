import java.io.*;

class directory {
    public static void main(String args[]) {
        File f;
        String[] s;
        try {
            f = new File("d:\\");
            s = f.list();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}