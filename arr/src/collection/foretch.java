package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class foretch
{
    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++)
        {
            c.add(i);
        }
        c.forEach(System.out::println);
    }
}
