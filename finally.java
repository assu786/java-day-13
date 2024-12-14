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
            System.out.println("catch block running");
        }
        finally
        {
            System.out.println("finally is running");
        }
    }
}