package collections1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Priority Queue has element will sort elements priority wise
		// it uses comparable interface compareTo method for deciding the priority of elements added
	
		// why not using add() instead using offer() bcz we need it to work like Queue [FIFO order] not to be used as a list
		// Main 3 methods are there in PriorityQueue: Offer, Peek, Poll
		// not having get and set methods implementing queue interface
		// 
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(4);
		q.offer(2);
		q.offer(3);
		q.offer(1);
		
		
		//peek shows the elemenet without removing it element
		//poll removes element and shows it
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.size());
		
		// Linkedlist
		// Linkedlist is implementing Queue as well as List
		// it has get and set methods
		// 
		System.out.println("Implementation of LinkedList Using Queue");
		q = new LinkedList<Integer>();
		
	}

}
