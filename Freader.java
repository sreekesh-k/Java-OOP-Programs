import java.io.*;

class Freader {
    public static void main(String args[]) {
        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader(new File("a.txt"));
            br = new BufferedReader(fr);
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}