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

    public void run() {

        if (s.isDirectory()) {
            // If the destination directory doesn't exist, create it
            if (!d.exists()) {
                d.mkdir();
            }
            String str[] = s.list();
            for (int i = 0; i < str.length; i++) {
                File sf = new File(sdir + str[i]);
                File df = new File(ddir + str[i]);
                MyThread copyThread = new MyThread(sf, (sdir + str[i] + "\\"), df, (ddir + str[i] + "\\"));
                copyThread.start();
            }
        } else {
            write(s, d);
        }
    }
}

public class cpyFldrContnThread {