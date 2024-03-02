import java.io.*;
import java.util.*;

class MyThread extends Thread {

}

public class subDir {

    public static void main(String args[]) {
        File mainF, currentF;
        String mains[], subs[];
        String dir = "D:\\Lab\\";
        try {
            mainF = new File(dir);
            mains = mainF.list();
            for (int i = 0; i < mains.length; i++) {
                currentF = new File(dir + mains[i]);
                System.out.println((i + 1) + ". " + mains[i]);
                if (currentF.isDirectory()) {
                    subs = currentF.list();
                    for (int j = 0; j < subs.length; j++) {
                        System.out.println(" " + "| ");
                        System.out.println(" " + "+-->" + "\t" + subs[j] + "\n");
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
