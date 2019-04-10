import java.util.ArrayList;

public class DemoIncrement {

public static void main(String...s)
{

   /* int a=10;
   int b= a++;

   b=80*a/10+b;
    System.out.println(b);*/

    ArrayList<String>al=new ArrayList<>();
    al.add("one");
    al.add("two");
    al.add("three");
    for(String str : al)
    {
        str="aa";
    }
    System.out.println(al);
}





}
