import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    int ar[] = {4,3,2,10,12,1,5,6};
	    
	    for(int i=1;i<ar.length;i++)
	    {
	        int cur=ar[i];
	        int j=i-1;
	        
	        while(j>=0 && ar[j]>cur)
	        {
	            ar[j+1]=ar[j];
	            j=j-1;
	        }
	        ar[j+1]=cur;
	    }
	    for(int i=0;i<ar.length;i++)
	    {
	        System.out.println(ar[i]);
	    }
	    
	}
}
