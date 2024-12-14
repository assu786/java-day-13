interface a
{
    public void r();
}
interface b
{
    public void t();
}
class c implements a,b
{
    public void r()
    {
        System.out.println("hello girls");
    }
    public void t()
    {
        System.out.println("hello boys");
    }
}
class Main
{
    public static void main(String args[])
    {
        c h=new c();
        h.r();
        h.t();
    }
}