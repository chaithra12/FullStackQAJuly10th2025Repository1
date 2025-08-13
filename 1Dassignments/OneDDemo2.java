class OneDDemo2
{ 
 public static void main(String args[])
 {   
   int a[]={1,2,3,4,5,6,7,8,9,10};
   int b[]=new int[a.length];
   for(int i=0;i<a.length;i++)
    {
       b[i]=a[i]*a[i];
   }
   for(int j=b.length-1;j>=0;j--)
    {
       System.out.print(b[j]+ " ");
    }
}
}
      

     


    

   