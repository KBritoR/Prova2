//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        cozinheiro Cozinheiro = new cozinheiro("joao","frangocru",1000);
        capitão Capitão = new capitão("jogedias","bolinhodeouro",1000000);
        espadachin Espadachin = new espadachin("xapolin","pirulito",1000000);

        Cozinheiro.adcionarArray(new receita("fragocru",2));
        Cozinheiro.adcionarArray(new receita("bolinhadeouro",202));
        Cozinheiro.adcionarArray(new receita("carnedepanela",4));
        Cozinheiro.adcionarArray(new receita("picanha no molho de tubarão",50));


        Capitão.conquistarNovoSeguidor(new Pirata("gloucorochapintonet","morcego",100));
        Capitão.darOrdens(1);
        Espadachin.darOrdens(0);
        Espadachin.mudarRota(0);

        Cozinheiro.mostrarReceitas();
        Capitão.comer(Cozinheiro,1);

    }
}







