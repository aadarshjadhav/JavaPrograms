package com.testprograms6;

import java.util.PriorityQueue;

/*10> Create a PriorityQueue to give engineering admission to candidate.
 * Create Candidate class with cid,cname,m1,m2,m2,percentage.
 * Candidate with highest marks should get admission first!  	*/

public class PriorityQueueCandidate 
{
	
	public static void main(String args[])
	{
		//Doubt:::Is this the correct output for Priority QUEUE
		PriorityQueue<Candidate> pqueue= new PriorityQueue<>();
		pqueue.add(new Candidate(1,"Aadarsh",25,23,24));
		pqueue.add(new Candidate(2,"Rohit",27,29,35));
		pqueue.add(new Candidate(3,"Jayraj",31,33,37));
		pqueue.add(new Candidate(4,"Abhishek",37,42,45));
		pqueue.add(new Candidate(5,"Jtu",24,25,26));
		
		for(Candidate c:pqueue)
			System.out.println(c);
	}

}
