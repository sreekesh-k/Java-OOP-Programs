import java.io.*;
import java.util.*;

class MyThread extends Thread {
    File source, destination;

    public MyThread(File source, File destination) {
        this.source = source;
        this.destination = destination;
    }

    private void write(File source, File destination) {
        BufferedReader br;
        BufferedWriter bw;
        try {
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String data = br.readLine();
            while (data != null) {
                bw.write(data);
                bw.write("\n");
                data = br.readLine();
            }
            System.out.println("Copied: " + source + " to " + destination);
            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        if (source.isDirectory()) {
            // If the destination directory doesn't exist, create it
            if (!destination.exists()) {
                destination.mkdir();
            }
            System.out.println("Copying: " + source + " to " + destination);
            String[] files = source.list();
            for (int i = 0; i < files.length; i++) {
                File sf = new File(source, files[i]);
                File df = new File(destination, files[i]);
                MyThread copyThread = new MyThread(sf, df);
                copyThread.start();
                // try {
                // copyThread.join();
                // System.out.println("Folder copied successfully!");
                // } catch (Exception e) {
                // System.out.println(e);
                // }
            }
        } else {
            System.out.println("Copying: " + source + " to " + destination);
            write(source, destination);
        }
    }
}

public class cpyFldrContnThread {
    public static void main(String[] args) {
        String source = "D:\\New folder\\";
        String dest = "D:\\New folder2\\";

        try {
            File sourceFolder = new File(source);
            File destFolder = new File(dest);

            // Create threads for each folder or file
            MyThread mainThread = new MyThread(sourceFolder, destFolder);
            mainThread.start();
            mainThread.join();

            System.out.println("Folder copied successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
