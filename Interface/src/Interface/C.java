package Interface;

public class C implements A , B
{
    @Override
    public void showA()
    {
        System.out.println("C 实现了 A");
    }

    @Override
    public void showB()
    {
        System.out.println("C 实现了 B");
    }
}
