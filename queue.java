public class queue 
{
	int front;
	int rear;
	private int capacity;
	int arr[];
	int cursize=0;
	
	queue(int size)
	{
		this.capacity=size;
		front = 0;
		rear = -1;
		arr=new int[this.capacity];
	}
	
	public boolean isfull()
	{
		if(cursize==capacity)
		{
			return true;
		}
		return false;
	}
	
	public boolean isempty()
	{
		if(cursize==0)
		{
			return true;
		}
		return false;
	}
	
	public void enque(int ele)
	{
		if(!isfull())
		{
			rear++;
			if(rear == capacity-1)
			{
				rear = 0;
			}
			arr[rear] = ele;
			cursize++;
			System.out.println(ele + " added to the queue");
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	public void deque()
	{
		if(!isempty())
		{
			front++;
		    if(front == capacity-1)
		    {
		    	System.out.println(arr[front-1] + " removed from queue");
		    	front = 0;
		    }
		    else
		    {
		    	System.out.println(arr[front-1] + " removed from queue");	
		    }
		    cursize--;
		}
	}
	public void prints()
	{
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String args[])
	{
		queue q = new queue(6);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.deque();
		q.enque(10);
		q.enque(6);
		q.prints();
		
	}

}
