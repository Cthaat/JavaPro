package test2;

import java.time.LocalDate;
import java.util.Objects;

public class User
{
    private long ID;
    private String Gender;
    private LocalDate Birthday;

    public User()
    {
    }

    public User(long ID , String gender , LocalDate birthday)
    {
        this.ID = ID;
        Gender = gender;
        Birthday = birthday;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return ID == user.ID && Objects.equals(Gender , user.Gender) && Objects.equals(Birthday , user.Birthday);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(ID , Gender , Birthday);
    }

    @Override
    public String toString()
    {
        return "User{" +
               "ID=" + ID +
               ", Gender='" + Gender + '\'' +
               ", Birthday=" + Birthday +
               '}';
    }

    public long getID()
    {
        return ID;
    }

    public void setID(long ID)
    {
        this.ID = ID;
    }

    public String getGender()
    {
        return Gender;
    }

    public void setGender(String gender)
    {
        Gender = gender;
    }

    public LocalDate getBirthday()
    {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        Birthday = birthday;
    }
}
