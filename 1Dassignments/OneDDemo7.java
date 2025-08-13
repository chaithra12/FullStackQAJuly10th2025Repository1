class OneDDemo7
{
  public static void main(String args[]) 
  {
     
    int a[]={2,8,9,5,4};
    int b[]={5,8,2,23,6};
    int size=a.length;
    int c[]=new int[size];
     for (int i = 0; i<size; i++) 
      {
         c[i] = a[i]+b[i];
      }
    System.out.println("addition of two array is:");
    for (int i = 0; i <size; i++) 
      {
      System.out.print(c[i] + " ");
    }
  }
}
   
  
     