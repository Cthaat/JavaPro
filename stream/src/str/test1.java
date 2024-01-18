package str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test1
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        list.stream().filter(i -> i > 2).sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
