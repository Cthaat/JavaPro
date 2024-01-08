package Generics;

import java.util.ArrayList;

public class test01
{
    public static void main(String[] args)
    {
        ArrayList<Car> a=new ArrayList<>();
        a.add(new Car());
        a.add(new BAN());
        a.add(new BMW());
        test(a);
        ArrayList<BMW> b = new ArrayList<>();
        b.add(new BMW());
        test(b);
    }
    public static void test(ArrayList<? extends Car> a)
    {

    }
}
