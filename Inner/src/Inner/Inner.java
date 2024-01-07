package Inner;

public class Inner
{
    public static void main(String[] args)
    {
        Swim s1 = new Swim()
        {

            @Override
            public void swim()
            {
                System.out.println("i am swimming");
            }
        };
        s1.swim();
    }
}
