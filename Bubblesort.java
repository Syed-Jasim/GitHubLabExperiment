class Bubblesort
{
   void Bubblesort(int arr[])
{
   int n=arr.length;
   for(int i=0;i<n-1;i++)
   for(int j=0;j<n-1-1;j++)
   if(arr[i]>arr[j+1])
{
   int temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
 }
}
   void printarray(int arr[])
{
   int n=arr.length;
   for(int i=0;i<n;++i)
   System.out.print(arr[i]+" ");
   System.out.println();
}
   public static void main(String args[])
{
   Bubblesort ob=new Bubblesort();
   int arr[]={64,34,25,12,22,11,90};
   ob.Bubblesort(arr);
   System.out.println("sorted array");
   ob.printarray(arr);
 }
}