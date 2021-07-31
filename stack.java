public class stack 
{
	int size;
	int arr[];
	int top;
	
	stack(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		
	}
	public boolean isfull()
	{
		return(size-1==top);	
	}
	public boolean isempty()
	{
		return top==-1;
	}
	
	public void push(int ele)
	{
		if(!isfull())
		{
			top++;
			arr[top]=ele;
			System.out.println("Pushed element:" + ele);
		}
		else
		{
			System.out.println("Stack is full");
		}
		
	}
	
	public int pop()
	{
		if(!isempty())
		{
			int tope=top;
			top--;
			System.out.println("Poped element::" + arr[tope]);
			return arr[tope];
		}
		else 
		{
            System.out.println("Stack is empty !");
            return -1;
        }
	}
	public int peek() {
        if(!this.isempty())
            return arr[top];
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
	public void prints()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		stack st= new stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.pop();
		st.push(4);
		st.prints();
	}
}