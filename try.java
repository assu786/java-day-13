class Main
{
    public static void main(String args[])
    {
        try
        {
            int d=90/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("bad request");
        }
    }
}