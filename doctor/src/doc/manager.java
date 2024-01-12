package doc;

import java.util.Scanner;

public class manager
{
    public void start()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            switch (sc.nextInt())
            {
                case 1:
                    System.out.println("Value is 1");
                    break;
                case 2:
                    System.out.println("Value is 2");
                    break;
                case 3:
                    System.out.println("Value is 3");
                    break;
                default:
                    break;
            }
        }
    }
}
