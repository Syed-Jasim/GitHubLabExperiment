public class constructorexample
{
int id;
String name;
public constructorexample()
{
id=10;
name="SVCET";
System.out.println("default constructor called");
}
public constructorexample(int i,String n)
{
id=i;
name=n;
System.out.println("parameterized constructor called");
}
public void display()
{
System.out.println("id:"+id);
System.out.println("name:"+name);
}
public static void main(String[]args)
{
constructorexample obj1=new constructorexample();
obj1.display();
constructorexample obj2=new constructorexample(20,"SVCET-chittoor");
obj2.display();
 }
}