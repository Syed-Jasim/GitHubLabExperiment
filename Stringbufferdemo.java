public class Stringbufferdemo
{
   public static void main(String[]args)
   {
      Stringbuffer sb=new Stringbuffer("Java programming");
      System.out.println("String:"+sb);
      sb=sb.deletecharAt(4);
      System.out.println("After deleting:"+sb);
      
      Stringbuffer sb1=new Stringbuffer("Welcome to Java programming");
      System.out.println("Before deletion the String is:"+sb1);
      int startindex=11;
      int endindex=16;
      System.out.println("The startindex and endindex values are:"+ startindex +"and"+ endindex);
      Stringbuffer new_str=sb1.delete(startindex,endindex);
      System.out.println("After deletion the remaing String is:"+new_str);
    }
}