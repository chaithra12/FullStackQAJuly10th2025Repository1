class OneDDemo4
{
 public static void main(String args[])
 {
   int size=0;
   for(int i=100;i<=200;i++)
   {
      if(i%15==0)
       {
         size=size+1;
       }
  }
 int a[]=new int[size];
 int k=0;
 for(int j=100;j<=200;j++)
 {
   if(j%15==0)
   {
     a[k]=j;
     k++;
   }
}
for(int i=0;i<size;i++)
 {
  System.out.println(a[i]-10+" ");
}
}
}
  