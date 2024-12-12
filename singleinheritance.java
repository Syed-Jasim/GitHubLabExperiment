class Employee
{
void salary()
{
System.out.println("salary=200000");
}
}
class programmer extends Employee
{
void bonus()
{
System.out.println("bonus=50000");
}
}
class singleinheritance
{
public static void main(String args[])
{
programmer p = new programmer();
p.salary();
p.bonus();
}
}