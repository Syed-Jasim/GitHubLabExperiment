public class methodoverloading
{
public void display()
{
System.out.println("no parameters");
}
public void display(int num)
{
System.out.println("integer argument:"+num);
}
public void display(String str)
{
System.out.println("String argument:"+str);
}
public static void main(String[]args)
{
methodoverloading obj=new methodoverloading();
obj.display();
obj.display(10);
obj.display("hello");
 }
}