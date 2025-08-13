class OneDDemo5
{
  public static void main(String args[])
  {
    double a[]={10.78,67.89,56.76,34.56,45.67};
    double b[]=new double[a.length];
    int k=0;
    for(int i=0;i<a.length;i++)
     {
        b[k]=a[i];
        k++;
        
     }
     for(int j=b.length-1;j>=0;j--)
      {
      System.out.println(b[j]);
      }
   }
}