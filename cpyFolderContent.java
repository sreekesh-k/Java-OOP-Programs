import java.io.*;
import java.util.*;

public class cpyFolderContent {
    public static void main(String[] args) {

        String source, dest;
        Scanner scan = new Scanner(System.in);
        try {
            // System.out.println("Enter Source file/Folder name: ");
            source = "D:\\New folder\\";
            File s = new File(source);
            // System.out.println("Enter Destination file/Folder name: ");
            dest = "D:\\New folder2\\";
            File d = new File(dest);
            copy(s, source, d, dest);
            System.out.println("Folder copied successfully!");
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void write(File s, File d) {
        BufferedReader br;
        BufferedWriter bw;
        try {
            FileReader fr = new FileReader(s);
            FileWriter fw = new FileWriter(d);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String data = br.readLine();
            while (data != null) {
                bw.write(data);
                bw.write("\n");
                data = br.readLine();
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void copy(File s, String sdir, File d, String ddir) {

        if (s.isDirectory()) {
            // If the destination directory doesn't exist, create it
            if (!d.exists()) {
                d.mkdir();
            }
            String str[] = s.list();
            for (int i = 0; i < str.length; i++) {
                File sf = new File(sdir + str[i]);
                File df = new File(ddir + str[i]);
                copy(sf, (sdir + str[i] + "\\"), df, (ddir + str[i] + "\\"));

            }
        } else {
            write(s, d);
        }
    }
}
