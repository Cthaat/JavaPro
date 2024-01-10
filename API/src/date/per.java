package date;

import java.time.LocalDate;
import java.time.Period;

public class per
{
    public static void main(String[] args)
    {
        Period a = Period.between(LocalDate.of(2000 , 1 , 1) , LocalDate.now());
        System.out.println(a.getDays());
        System.out.println(a.getMonths());
        System.out.println(a.getYears());
    }
}
