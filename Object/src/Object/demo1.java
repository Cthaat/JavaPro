package Object;

public class demo1
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Students s1 = new Students("123" , 12);
        System.out.println(s1.toString());
        Students s2 = (Students) s1.clone();
    }
}
