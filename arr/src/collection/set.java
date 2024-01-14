package collection;

import java.util.HashSet;
import java.util.Set;

public class set
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        for (int i= 1; i <= 10; i++)
        {
            set.add(i);
        }
    }
}
