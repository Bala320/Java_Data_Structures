 int n=3;
	   int[] ar={1,2,3,2,1,2,3,6,5,98,9,3,3,6};
       int i=0;
       for(int j=0;j<ar.length;j++)
       {
           if(ar[j]!=n)
           {
               ar[i]=ar[j];
               i++;
           }
       }
       for(int k=0;k<ar.length;k++)
       {
           System.out.print(ar[k]+" ");
       }
	   
