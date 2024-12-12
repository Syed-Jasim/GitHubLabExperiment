class Binarysearch
{
  int Binarysearch(int arr[],int l,int r,int x)
{
  while(l<=r)
{
  int mid=(1+r)/2;
  if(arr[mid]==x)
{
  return mid;
}
  else if(arr[mid]>x)
{
  r=mid-1;
}
  else
{
  l=mid+1;
 }
}
  return-1;
}
  public static void main(String args[]){
  Binarysearch ob=new Binarysearch();
  int arr[]={2,3,4,10,90};
  int n=arr.length;
  int x=10;
  int result=ob.Binarysearch(arr,0,n-1,x);
  if(result==-1)
  System.out.println("element not present");
  else
  System.out.println("element found at index"+result);
 }
}
