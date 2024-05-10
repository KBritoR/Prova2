public interface comandar {


    public default void darOrdens(int index)
    {
        if(index == 1)
        {
            System.out.println("Capitão está dando ordens");
        }
        if(index == 0)
        {
            System.out.println("O imediato está dando onrdens");
        }

    }
    public default void mudarRota(int index)
    {
        if(index == 1)
        {
            System.out.println("Capitão está mudando a rotada");
        }
        if(index == 0)
        {
            System.out.println("O imediato está mudando a rotada");
        }
    }
}
