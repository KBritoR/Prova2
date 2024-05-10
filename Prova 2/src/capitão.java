public class capitão extends Pirata implements comandar{
    public capitão(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    private int numeroDeSeguidores;

    public void conquistarNovoSeguidor(Pirata pirata)
    {
        if(pirata.poder > this.poder)
        {
            System.out.println("Não podera ficar no bando");
        }
        else
        {
            System.out.println("Voce foi aceito no bando");
            numeroDeSeguidores += 1;
        }
    }


}
