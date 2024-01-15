import java.io.*;
import java.util.*;

class CThread extends Thread{
	int start, end;
	public CThread(int s,int e){
		start = s;
		end = e;
	}
	/*public void run(){
		while(start != end){
			System.out.print("\t" + start);
			if(start < end) start++;
			else start--;
		}
		System.out.print("\t" + start);
	}*/
	public void run(){
		if(start <= end){
			for(int i = start;i <= end; i++){
				System.out.print("\t" + i);
			}
		}
		else{
			for(int i = start;i >= end; i--){
				System.out.print("\t" + i);
			}
		}		
	}
}
class MThreadqs{
	public static void main(String args[]){

		CThread t1,t2;	
		Scanner s = new Scanner(System.in);

		System.out.println("For Thread 1:");
		System.out.print("Enter m: ");
		int m = s.nextInt();
		System.out.print("Enter n: ");
		int n = s.nextInt();

		t1 = new CThread(m,n);

		t1.run();

		System.out.println("\nFor Thread 2:");
		System.out.print("Enter m: ");
		m = s.nextInt();
		System.out.print("Enter n: ");
		n = s.nextInt();

		t2 = new CThread(m,n);

		t2.run();
	}


}