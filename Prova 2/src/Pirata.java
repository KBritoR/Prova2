public class Pirata {
    private String nome;
    private String comidaFavorita;
    int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

   public void comer(cozinheiro Cozinheiro, int index)
    {
        Cozinheiro.PrepararPrato(1);
        this.poder += 10;
    }
    public Pirata lutar(Pirata pirata){
        pirata.poder -= 10;
        return pirata;
    }


}
