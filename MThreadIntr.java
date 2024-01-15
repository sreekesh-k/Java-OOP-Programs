/*Using interface*/
import java.io.*;

class CThread implements Runnable{/*Runnable interface has only one method that is run();*/
	int n;
	public CThread(int a){
		n = a;
	}
	public void run(){
		for(int i = 1;i <= n; i++){
			System.out.print("\ti= "+i);
		}
	}
}
class MThreadIntr{
	public static void main(String args[]){
		CThread t1,t2;
		Thread p,q;
		t1 = new CThread(100);
		t2 = new CThread(150);
		p = new Thread(t1);
		q = new Thread(t2);
		System.out.println("B4 Thread");
		p.start();
		System.out.println("Between Thread");
		q.start(); 
		System.out.println("After Thread");

	}
}

