package enumerate;

public enum B
{
    X
            {
                @Override
                public void print()
                {
                    System.out.println("X");
                }
            },
    Y
            {
                @Override
                public void print()
                {
                    System.out.println("Y");
                }
            };

    public abstract void print();
}
