package jdk;

public interface A
{
    default void hello()
    {
        System.out.println("A");
    }
    static void hi()
    {
        System.out.println("hi");
    }

}
