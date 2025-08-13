class OneDDemo1
{
  public static void main(String args[])
   {  
     int size=0,sum=0;
     for(int i=80;i<=100;i++)
      {
          if(i%2==0)
           {
             size=size+1;
           }
      }
    int a[]=new int[size];
    int k=0;
    for(int j=80;j<=100;j++)
    {
         if(j%2==0)
          {
             a[k]=j;
             k++;
          }
    }
    for(int z=0;z<a.length;z++)
   {
       System.out.println(a[z]);
       sum=sum+a[z];
     
   }
    
    System.out.println("sum of all elements:"+sum);
 }
}