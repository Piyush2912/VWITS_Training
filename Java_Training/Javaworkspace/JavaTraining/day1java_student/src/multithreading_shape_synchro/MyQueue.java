package multithreading_shape_synchro;

import java.util.Queue;

/*
 * Assignment: Create two threads on MyQueue instance . 
 * MyQueue will have Queue of Shape objects. 
 * Thread1 will ask end-users for Shape and add that Shape to Queue and 
 * Thread2 will read Shapes from front of the queue and print details of Shape and it's area and perimeter. 
 * (Note: Thread2 that reads shape from Queue should wait if Queue is empty and 
 * another Thread pushes Shape into it after taking it from end-user.
 * Hint: need to synchro this using Synchronized wait and notify calls
 */

public class MyQueue implements Runnable {

    private Queue<Shape> shp;
    
    public MyQueue(Queue<Shape> shp) {
        this.shp = shp;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000); 
            //some notifier code logic to compute something and create the message
            synchronized (shp) {
                //shp.setMsg(name+" Notifier work done");
                shp.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}