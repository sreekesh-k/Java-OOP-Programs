import java.io.*;

class isDir {
    public static void main(String args[]) {
        File f, subf;
        String[] s;
        try {
            f = new File("d:\\");
            s = f.list();
            for (int i = 0; i < s.length; i++) {
                subf = new File("d:\\" + s[i]);
                if (subf.isDirectory()) {
                    System.out.println(s[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}