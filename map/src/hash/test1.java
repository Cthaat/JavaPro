package hash;

import java.util.*;

public class test1
{
    public static void main(String[] args)
    {
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i < 10 ; i++)
        {
            map.put(i , i * 2);
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys)
        {
            System.out.println(map.get(key));
        }
        Set<Map.Entry<Integer , Integer>> entries = map.entrySet();
        for (Map.Entry<Integer , Integer> entry : entries)
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.forEach((k , v)-> System.out.println(k + " " + v));
    }
}
