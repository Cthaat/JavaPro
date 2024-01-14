package collection;

import java.util.Objects;

public class stu
{
    private int id;
    private int age;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public stu(int id , int age)
    {
        this.id = id;
        this.age = age;
    }

    public stu()
    {
    }

    @Override
    public String toString()
    {
        return "stu{" +
               "id=" + id +
               ", age=" + age +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof stu)) return false;
        stu stu = (stu) o;
        return id == stu.id && age == stu.age;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id , age);
    }
}
