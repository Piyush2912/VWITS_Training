package multithreading_shape_synchro;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 * Assignment: Create two threads on MyQueue instance . 
 * MyQueue will have Queue of Shape objects. 
 * Thread1 will ask end-users for Shape and add that Shape to Queue and 
 * Thread2 will read Shapes from front of the queue and print details of Shape and it's area and perimeter. 
 * (Note: Thread2 that reads shape from Queue should wait if Queue is empty and 
 * another Thread pushes Shape into it after taking it from end-user.
 * Hint: need to synchro this using Synchronized wait and notify calls
 */

public class Thread1 implements Runnable{
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape:");
		String str = sc.next();
		
		
		Queue<Shape> q = new PriorityQueue<Shape>();
		MyQueue qu = new MyQueue(q);
		
		
		
	}

}
