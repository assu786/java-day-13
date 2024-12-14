import java.util.*;
class gp
{
    public void r()
    {
        System.out.println("hello,i'm grandparent");
    }
}
class p extends gp{
    public void t()
    {
        System.out.println("hello,i'm parent1");
    }
}
interface p1{
  public  void p();
}
class d extends p implements p1
{
    public void p()
    {
        System.out.println("i'm parent 2");
    }
    public void l()
    {
        System.out.println("i'm child class");
    }
}
class Main
{
    public static void main(String args[])
    {
        d m=new d();
        m.r();
        m.t();
        m.p();
        m.l();
    }
}