package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class it
{
    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++)
        {
            c.add(i);
        }
        for (Integer it : c)
        {
            System.out.println(it);
        }
    }
}
