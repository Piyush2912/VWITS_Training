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

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiterthrd").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1thrd").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifierthrd").start();
        System.out.println("All the threads are started");
    }

}