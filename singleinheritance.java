import java.util.*;
class a
{
    public void r()
    {
        System.out.println("hello students");
    }
}
class b extends a
{
    public void p()
    {
        System.out.println("hello teachers");
    }
}
class Main
{
    public static void main(String args[])
    {
        b n=new b();
        n.r();
        n.p();
    }
}