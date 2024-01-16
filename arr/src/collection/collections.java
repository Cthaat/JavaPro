package collection;

import java.util.*;

public class collections
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list , (o1 ,o2) -> o2 - o1);
        System.out.println(list);
    }
}
