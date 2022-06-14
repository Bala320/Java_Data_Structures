import java.util.*;
class Main
{
    public static Node head=null;
    public static Node tail=null;
    
    static class Node
    {
      int data;
      Node next;
      
      Node(int d)
      {
          data=d;
          next=null;
      }
    }
    
    static void add(int n)
    {
        Node m=new Node(n);
        if(head==null)
        {
            head=m;
            tail=m;
        }
        else
        {
            tail.next=m;
            tail=m;
        }
    }
    
    Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
    static void print(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
	public static void main(String[] args)
	{
	    Main m=new Main();
	    m.add(1);
	    m.add(2);
	    m.add(3);
	    m.add(4);
	    m.add(5);
	    m.add(6);
		m.print(head);
	
		System.out.println(" ");
		m.reverse();
		m.print(head);
	}
}
