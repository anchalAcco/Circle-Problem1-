package asses;
import java.util.*;

public class CircleSolution {
	  public class Node{  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	    //Declaring head and tail pointer as null.  
	    public  Node head = null;  
	    public Node tail = null;  
	  
	    //This function will add the new node at the end of the list.  
	    public void add(int data){  
	        //Create new node  
	        Node newNode = new Node(data);  
	        //Checks if the list is empty.  
	        if(head == null) {  
	             //If list is empty, both head and tail would point to new node.  
	            head = newNode;  
	            tail = newNode;  
	            newNode.next = head;  
	        }  
	        else {  
	            //tail will point to new node.  
	            tail.next = newNode;  
	            //New node will become new tail.  
	            tail = newNode;  
	            //Since, it is circular linked list tail will point to head.  
	            tail.next = head;  
	        }  
	    }
	  
	    public int intersect(int x, int y) {
	    	
	    	Node temp1=head;
	    	while(temp1.data!=x) {
	    		temp1=temp1.next;
	    	}
	    	Node temp2=head;
	    	while(temp2.data!=y) {
	    		temp2=temp2.next;
	    	}
	    	
	    	while(temp1!=temp2) {
	    		temp1=temp1.next;
	    		temp2=temp2.next.next;
	    	}
	    	return temp2.data;
	    }
	    
	

	public static void main(String[] args) {
	
		 CircleSolution cl = new CircleSolution();  
	        //Adds data to the list  
	        cl.add(1);  
	        cl.add(2);  
	        cl.add(3);  
	        cl.add(4);
	        cl.add(5);
	        cl.add(6);
	        cl.add(7);
	        cl.add(8);
	        cl.add(9);
	        cl.add(10);
	        cl.add(11);
	       	cl.add(12);
	     
	       	Scanner sc=new Scanner(System.in);
	       	
	       	int x=sc.nextInt();
	       	int y=sc.nextInt();
	       	
	       	System.out.println(cl.intersect(x,y));
      
	}

}
