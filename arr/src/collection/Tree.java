package collection;

import java.util.Set;
import java.util.TreeSet;

public class Tree
{
    public static void main(String[] args)
    {
        Set<stu> stus = new TreeSet<>((o1 , o2)->o2.getId()-o1.getId());
        stu s1 = new stu(1,18);
        stu s2 = new stu(2,19);
        stu s3 = new stu(2,19);
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        System.out.println(stus);
    }
}
