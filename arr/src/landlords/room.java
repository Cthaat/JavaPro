package landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class room
{
    private List<card> AllCards = new ArrayList<>();

    public room()
    {
        int TempSize = 0;
        String[] Numbers = {"3", "4", "5", "6", "7", "8", "9", "10" , "J", "Q", "K", "A" , "2"};
        String[] Colors = {"♠", "♥", "♣", "♦"};
        for (String number : Numbers)
        {
            TempSize++;
            for (String color : Colors)
            {
                AllCards.add(new card(number , color , TempSize));
            }
        }
        AllCards.add(new card("小王" , "♦" , ++TempSize));
        AllCards.add(new card("大王" , "♦" , ++TempSize));
    }

    public void StartGame()
    {
        Collections.shuffle(AllCards);
        List<card> Player1Cards = new ArrayList<>(AllCards.subList(0 , 17));
        List<card> Player2Cards = new ArrayList<>(AllCards.subList(17 , 34));
        List<card> Player3Cards = new ArrayList<>(AllCards.subList(34 , 51));
        Player1Cards.sort(Comparator.comparingInt(card::getSize));
        Player2Cards.sort(Comparator.comparingInt(card::getSize));
        Player3Cards.sort(Comparator.comparingInt(card::getSize));
        System.out.println("玩家1的牌：" + Player1Cards);
        System.out.println("玩家2的牌：" + Player2Cards);
        System.out.println("玩家3的牌：" + Player3Cards);
        System.out.println("底牌：" + AllCards.subList(51 , 54));
    }
}
