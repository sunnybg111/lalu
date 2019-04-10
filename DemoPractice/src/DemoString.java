public class DemoString {

    public static void main(String...s)
    {
        String str="sachin";

        String s1=new String("sachin");
        String str2="sachin";
        String str3="Sachin";
        System.out.println(str==str3);

        String s4=s1.intern();
        System.out.println(str2==s4);

    }
}
