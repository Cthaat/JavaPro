package doc;

import java.time.LocalDate;
import java.util.ArrayList;

public class doctor
{
    private String name;
    private int id;
    private String speciality;
    private String location;
    private String contact;
    private String email;
    private String password;
    private LocalDate JobTime;
    private ArrayList<schdule> schdules = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getSpeciality()
    {
        return speciality;
    }

    public void setSpeciality(String speciality)
    {
        this.speciality = speciality;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getContact()
    {
        return contact;
    }

    public void setContact(String contact)
    {
        this.contact = contact;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public LocalDate getJobTime()
    {
        return JobTime;
    }

    public void setJobTime(LocalDate jobTime)
    {
        JobTime = jobTime;
    }

    public ArrayList<schdule> getSchdules()
    {
        return schdules;
    }

    public void setSchdules(ArrayList<schdule> schdules)
    {
        this.schdules = schdules;
    }

    public doctor()
    {
    }

    public doctor(String name , int id , String speciality , String location , String contact , String email , String password , LocalDate jobTime , ArrayList<schdule> schdules)
    {
        this.name = name;
        this.id = id;
        this.speciality = speciality;
        this.location = location;
        this.contact = contact;
        this.email = email;
        this.password = password;
        JobTime = jobTime;
        this.schdules = schdules;
    }
}
