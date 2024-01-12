package doc;

import java.util.ArrayList;

public class department
{
    private String name;
    private ArrayList<doctor> doctors = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<doctor> getDoctors()
    {
        return doctors;
    }

    public void setDoctors(ArrayList<doctor> doctors)
    {
        this.doctors = doctors;
    }

    public department()
    {
    }

    public department(String name , ArrayList<doctor> doctors)
    {
        this.name = name;
        this.doctors = doctors;
    }
}
