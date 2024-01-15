import java.util.*;

/*  logic: ask user array size
    each thread will search 5 elements 
    array will be divided into small array if the size of array is above 5
    eg: if there are 6 elements, t1 will seach in 1st 5 elemnts and t2 will seach the other 1
    -how will i know how many threads i will need?
        make array of objects of the class and the size (number of threads)of that array will be calculated like:
        if arraysize>5
            size of MyThread array = size of the user (array/5)+1 :: if there are 6 elemnts we need 2 threads (integer of 6/5 will give 1 so thats y +1 is used)
            CHATGPT: use double instead of int and ceil() to get correct size :: if 10 elemenst 10/5 is 2 but above satement will make 3 thread i need only 1 
    cunstructor of MyThread will have array and the elemnt to search 
    run method of MyThread will do searching using linear search on the 5 elemnts

    -how will i know the index of array and pass the divided array?
        for i = 0 to number  of threads
            start index = i*5;
            end index = (i+1)*5 - 1 :: 0 to 4 , 5 to 9
            -what if there are 6 elements only?
                end index = 6 - but how to do it?
                    CHATGPT: Math.min((i + 1) * 5 - 1, size - 1) will give minimum of 10 and 6 so..
    -how will i pass a 10 elemnt array in 2 parts? as seperate array
        *make 2 differnt array(difficult)
        CHATGPT:  Arrays.copyOfRange(array, start, end + 1) so elements are copied from 0 to 4 and passed into new seperate small array to MyThread 
    DONE!
    goal:if user enters an array of size 100
         there will be 20 threads which will run concorently and search for the element
 */
class MyThread extends Thread {
    int threadno;// to keep track of which thread is runnning
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

public class searchArrThread {
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
        int numThreads = (int) Math.ceil((double) n / 5);// how many num of threads do i need?
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * 5;
            int end = Math.min(((i + 1) * 5 - 1), (n - 1));// end index minimum of 10,6
            // int[] subArray = Arrays.copyOfRange(array, start, end + 1); for creating
            // seperate arrays
            threads[i] = new MyThread(Arrays.copyOfRange(array, start, end + 1), start, (end % 5), search, (i + 1));
            /*
             * error that even chat gpt coildnt fix :
             * i was getting arrayindexoutofbounds exception for 30 mts
             * the error (I found it myself) the 'end' that i pass was the problem
             * eg if there was 6 elements: before i was simply passing as 'end'
             * which means the for loop in run(); was like i=0 to 6 for 2nd thread
             * corrected to i=0 to 1(6%5) for thread 2
             */
            threads[i].start();
            /*
             * can also use .run() but it wont create new thread nor running the threads
             * concorently
             * -CHATGPT:
             * The issue in your code is in the way you are using the 'run' method of your
             * threads. When you call 'threads[i].run()', it does not create a new thread;
             * instead, it runs the run method in the context of the current thread (main
             * thread in this case), and that's why you're not getting concurrent execution.
             */
        }
        s.close();
    }

}
