package Polymorphism;

public class Polymorphism
{
    public static void main(String[] args)
    {
        People p1 = new Student();
        if (p1 instanceof Student)
        {
            Student p2 = (Student) p1;
            p2.PeopleRun();
        }
    }
}
