package landlords;

public class card
{
    private String Number;
    private String Color;
    private int Size;

    public card()
    {
    }

    public card(String number , String color , int size)
    {
        Number = number;
        Color = color;
        Size = size;
    }

    public String getNumber()
    {
        return Number;
    }

    public void setNumber(String number)
    {
        Number = number;
    }

    public String getColor()
    {
        return Color;
    }

    public void setColor(String color)
    {
        Color = color;
    }

    public int getSize()
    {
        return Size;
    }

    public void setSize(int size)
    {
        Size = size;
    }

    @Override
    public String toString()
    {
        return Color + Number;
    }
}
