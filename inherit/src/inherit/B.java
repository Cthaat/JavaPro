package inherit;

public class B extends A
{
    public B()
    {
        System.out.println("B1");
    }

    @Override
    public void print()
    {
        System.out.println("B");
    }
}
