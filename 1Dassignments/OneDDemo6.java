class OneDDemo6
{
  public static void main(String args[])
  {
    
    int a[]={2,5,8,9};
    int b[]={9,6,8,5,4};
    int c[]=new int[a.length+b.length];
    for(int i=0;i<a.length;i++)
    {
      c[i]=a[i];
    }
    for(int j=0;j<b.length;j++)
    {
      c[i][j]=b[j];
   }
for(int i=0;i<c.length;i++)
{


 System.out.print(c[i]+" ");

}
}
}
   
    