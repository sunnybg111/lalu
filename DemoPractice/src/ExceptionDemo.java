public class ExceptionDemo {

    public static void validate(int age)throws ArithmeticException {
        if (age < 18) {

                throw new ArithmeticException("not valid");

        }
        else
            System.out.println("welcome to vote");

        }



    public static void main(String...s)
    {
        try
        {
               ExceptionDemo.validate(20);
        }
        catch (Exception e)
        {}
        finally {
            System.out.println("Cool Finally");
        }
    }
}
