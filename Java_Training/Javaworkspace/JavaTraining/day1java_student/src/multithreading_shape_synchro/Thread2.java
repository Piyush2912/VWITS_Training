package multithreading_shape_synchro;

/*
 * Assignment: Create two threads on MyQueue instance . 
 * MyQueue will have Queue of Shape objects. 
 * Thread1 will ask end-users for Shape and add that Shape to Queue and 
 * Thread2 will read Shapes from front of the queue and print details of Shape and it's area and perimeter. 
 * (Note: Thread2 that reads shape from Queue should wait if Queue is empty and 
 * another Thread pushes Shape into it after taking it from end-user.
 * Hint: need to synchro this using Synchronized wait and notify calls
 */


public class Thread2 implements Runnable{
	
	public void run() {
		
	}
}
