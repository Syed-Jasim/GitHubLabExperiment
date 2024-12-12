public class myclass
{
public void displaymessage()
{
System.out.println("hello from a method!");
}
public int calculatesum(int a,int b)
{
return a+b;
}
public static void main(String[]args)
{
myclass obj=new myclass();
obj.displaymessage();
int num1=10,num2=20;
int sum=obj.calculatesum(num1,num2);
System.out.println("sum of"+num1+"and"+num2+"is:"+sum);
  }
 }