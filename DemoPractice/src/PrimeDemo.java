import java.util.Scanner;

public class PrimeDemo {

    public static void main(String...s)
    {
        System.out.println("Enter the number");

        int flag=0;
        int m=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        m=n/2;
        if(n==0 || n==1)
        {
            System.out.println("number is not prime");
        }

        else
        {
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("is not a prime number");
                }
                flag=1;
                break;
            }
            if(flag==0)
            {
                System.out.println("number is prime");
            }
        }

    }
}
