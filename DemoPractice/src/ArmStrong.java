import java.util.Scanner;

public class ArmStrong {
    public static void main(String...s)
    {

        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int temp=n;
        int c=0;

while(n>0) {
    a=n%10;
    c=(c*10)+a;
    n=n/10;
   // c=c+(a*a*a);
}
if(temp==c)
{
    System.out.println("number is palin");
}
else
    System.out.println("number is not palin");
}
}
