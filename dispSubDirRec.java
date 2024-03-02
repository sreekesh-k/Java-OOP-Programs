import java.io.*;
import java.util.*;

public class dispSubDirRec {
    public static void main(String[] args) {

        String dir = "  ";
        try {
            File f = new File(dir);
            disp(f, dir, "\t");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void disp(File f, String dir, String decoration) {
        String s[] = f.list();
        for (int i = 0; i < s.length; i++) {
            File sf = new File(dir + s[i]);
            System.out.println(decoration + (i + 1) + ". " + s[i]);
            if (sf.isDirectory()) {
                disp(sf, (dir + s[i] + "\\"), (decoration + "\t"));
            }
        }
    }
}
