import java.util.ArrayList;
public class cozinheiro extends Pirata {

    public cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);

    }
    private ArrayList<receita>livroDeReceitasArrayList = new ArrayList<>();





    public String PrepararPrato(int index){

        String aux = "";
        if(livroDeReceitasArrayList.size() == index){

            aux = "preparando o prato" + livroDeReceitasArrayList.get(index);
        }
        return aux;
    }

    public void adcionarArray(receita livroDeReceita){
        livroDeReceitasArrayList.add(livroDeReceita);
    }

    public void mostrarReceitas(){
        System.out.print("[");
        for (receita livroDeReceita  : livroDeReceitasArrayList){
            try{
                System.out.print("  " + livroDeReceita.getNome() + " - " + livroDeReceita.getDificuldade() + ", ");
            }catch (NullPointerException e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("]");
    }

}
