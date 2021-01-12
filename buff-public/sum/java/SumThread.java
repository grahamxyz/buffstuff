// Java sum program

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
 
public class SumThread {

    public static void sum(BlockingQueue<Integer> q, int[] seq) {
	int s=0;
	for (int v: seq)
	    s+=v;
	try {
	    q.put(s);
	} catch (InterruptedException e) { e.printStackTrace(); }
    }

    public static void main(String[] args) {
	BlockingQueue<Integer> q=new ArrayBlockingQueue<Integer>(1);
	int[] seq={5,6,1,8,3,7};
	new Thread(new Runnable() {
		public void run() { sum(q,seq); }
	    }).start();
	try {
	    System.out.println(q.take());
	} catch (InterruptedException e) { e.printStackTrace(); }
    }

}
