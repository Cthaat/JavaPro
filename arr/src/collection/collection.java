package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class collection
{
    public static void main(String[] args)
    {
        Collection<String> c = new ArrayList<>();
        c.add("123");
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains("123"));
        System.out.println(c.remove("123"));
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
        String[] arr1 = c.toArray(new String[c.size()]);
    }
}
