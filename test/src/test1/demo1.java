package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class demo1
{
    public static void main(String[] args)
    {
        List<person> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0 ; i < 100 ; i++)
        {
            int Code = r.nextInt(200) + 1;
            for (person temp : list)
            {
                if (temp.getCode() == Code)
                {
                    i--;
                    continue;
                }
            }
            list.add(new person(Code , i));
        }
        while(list.size() > 1)
        {
            for (int i = 0 ; i < list.size() ; i++)
            {
                if (list.get(i).getLocation() == 0)
                {
                    list.remove(list.get(i));
                }
            }
            int i = 0;
            for (person temp : list)
            {
                temp.setLocation(i++);
            }
        }
        System.out.println(list.get(0).getCode());
    }
}
