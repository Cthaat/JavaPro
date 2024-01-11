package date;

public class Lam
{
    public static void main(String[] args)
    {
        swim s = () ->
        {
            System.out.println("swim");
        };
        s.swim();
    }
}
