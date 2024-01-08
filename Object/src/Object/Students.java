package Object;

public class Students implements Cloneable
{
    private String name;
    private int age;

    public Students(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    public Students()
    {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "Students{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
