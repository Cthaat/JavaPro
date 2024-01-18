package test2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class demo
{
    public static void main(String[] args)
    {
        String UserAllStr = "10001:男:1990-01-01#10002:女:1990-02-01#10003:男:1990-03-01";
        List<User> Users = new ArrayList<>();
        String[] UserAllInformation = UserAllStr.split("#");
        for (String UserInformation : UserAllInformation)
        {
            String[] Temp = UserInformation.split(":");
            Users.add(new User(Long.parseLong(Temp[0]), Temp[1], LocalDate.parse(Temp[2])));
        }
        for (User user : Users)
        {
            System.out.println(user);
        }
    }
}
