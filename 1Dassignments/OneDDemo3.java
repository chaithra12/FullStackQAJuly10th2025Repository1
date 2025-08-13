class OneDDemo3
{
  public static void main(String args[])
  {
   int size=0;
   for(int i=1;i<=100;i++)
   {
     if(i%8==0)
      {
        size=size+1;
     }
  }
int a[]=new int[size];
int k=0;
for(int j=1;j<=100;j++)
{ 
   if(j%8==0)
   {
     a[k]=j;
     k++;
  }
}
for(int i=0;i<size;i++)
{
System.out.println(a[i]);

}

}
}

        
    