public class A  extends Thread
{
    @Override
    public void run() {
        System.out.println(" a is running ");

    }
    public static  void main(String[]args)
    {
        A a=new A();
        a.start();
    }
}
