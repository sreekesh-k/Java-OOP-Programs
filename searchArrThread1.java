import java.util.*;

class MyThread extends Thread {
    int threadno;
    int arr[], start, end, x;

    public MyThread(int array[], int s, int e, int search, int t) {
        arr = array;
        start = s;
        end = e;
        x = search;
        threadno = t;
    }

    public void run() {
        System.out.println("Thread " + threadno + " Is Searching");
        for (int i = 0; i < end; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + (i + start) + " (Thread " + threadno + ")");
                return;
            }
        }
        System.out.println("Element not found in Thread " + threadno);
    }
}

public class searchArrThread1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int array[], n;
        System.out.print("Enter the size of the array: ");
        n = s.nextInt();
        array = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int search;
        System.out.print("\nEnter the element to search: ");
        search = s.nextInt();
        System.out.println("____________________________________");
        int numThreads = (int) Math.ceil((double) n / 5);
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * 5;
            int end = Math.min(((i + 1) * 5 - 1), (n - 1));
            threads[i] = new MyThread(Arrays.copyOfRange(array, start, end + 1), start, (end % 5), search, (i + 1));
            threads[i].start();
        }
        s.close();
    }

}
