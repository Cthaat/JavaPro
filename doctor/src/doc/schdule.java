package doc;

import java.time.LocalDate;

public class schdule
{
    private LocalDate morning;
    private LocalDate afternoon;
    private int personNumber;

    public LocalDate getMorning()
    {
        return morning;
    }

    public void setMorning(LocalDate morning)
    {
        this.morning = morning;
    }

    public LocalDate getAfternoon()
    {
        return afternoon;
    }

    public void setAfternoon(LocalDate afternoon)
    {
        this.afternoon = afternoon;
    }

    public int getPersonNumber()
    {
        return personNumber;
    }

    public void setPersonNumber(int personNumber)
    {
        this.personNumber = personNumber;
    }

    public schdule()
    {
    }

    public schdule(LocalDate morning , LocalDate afternoon , int personNumber)
    {
        this.morning = morning;
        this.afternoon = afternoon;
        this.personNumber = personNumber;
    }
}
