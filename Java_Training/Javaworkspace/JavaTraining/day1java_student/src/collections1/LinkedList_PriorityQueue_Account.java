package collections1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedList_PriorityQueue_Account {
	public static void main(String args[]) {
		// PriorityQueue - Account 
        Queue<Account> q = new PriorityQueue<Account>();

        q.offer(new Account(101,"Abhinav Sharma",25000,"HDFC"));
        q.offer(new Account(103,"Sidhika Rawat",35000,"PNB"));
        q.offer(new Account(102,"Rishabh Singh",15000,"SBI"));
      
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());


        //LinkedList - Account
        System.out.println("output from LinkedList implementation of Queue interface:");
        q = new LinkedList<Account>();

        q.offer(new Account(101,"Abhinav Sharma",25000,"HDFC"));
        q.offer(new Account(103,"Sidhika Rawat",35000,"PNB"));
        q.offer(new Account(102,"Rishabh Singh",15000,"SBI"));
     
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
	}
}
