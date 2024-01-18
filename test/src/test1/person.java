package test1;

public class person
{
    private int Code;
    private int Location;

    @Override
    public String toString()
    {
        return "person{" +
               "Code=" + Code +
               ", Location=" + Location +
               '}';
    }

    public person()
    {
    }

    public person(int code , int location)
    {
        Code = code;
        Location = location;
    }

    public int getCode()
    {
        return Code;
    }

    public void setCode(int code)
    {
        Code = code;
    }

    public int getLocation()
    {
        return Location;
    }

    public void setLocation(int location)
    {
        Location = location;
    }
}
