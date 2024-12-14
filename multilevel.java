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
class c extends b
{
    public void o()
    {
        System.out.println("hello professors");
    }
}
class Main
{
    public static void main(String args[])
    {
        c n=new c();
        n.r();
        n.p();
        n.o();
    }
}