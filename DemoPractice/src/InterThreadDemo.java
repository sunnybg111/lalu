


class Shared
{
    int count=0;

    public synchronized int show()
    {
        return count++;

    }
}


class Thread1 extends Thread
{Shared s;
    public Thread1(Shared s)
    {
        this.s=s;
    }

    @Override
    public void run() {
        int i=s.show();

        System.out.println("Thread 1 odd"+i);
    }



}
class Thread2 extends Thread
{
    Shared s;
    public Thread2(Shared s)
    {
        this.s=s;
    }@Override
public void run() {
    int i=s.show();

    System.out.println("Thread 2 even"+i);
}


}


public class InterThreadDemo {
    public static  void main(String...s4) {
        Shared s = new Shared();
        Thread1 t1 = new Thread1(s);
        Thread2 t2 = new Thread2(s);
        t1.start();
        t2.start();
    }

}
