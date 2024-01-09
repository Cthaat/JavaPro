package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class analysis
{
    public static void main(String[] args) throws ParseException
    {
        String datestr = "2022-2-28 12:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(datestr);
        System.out.println(d);
    }
}
