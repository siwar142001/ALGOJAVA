//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //on declare un tableau de int nommé tab dune taille de 7 cases

    public static void main(String[] args) {
        int [] Siwar_the_best = new int [7];
        Siwar_the_best[0]=5;
        Siwar_the_best[1]=15;
        Siwar_the_best[2]=25;
        Siwar_the_best[3]=35;
        Siwar_the_best[4]=45;
        Siwar_the_best[5]=55;
        Siwar_the_best[6]=65;

        System.out.printf("Hello and welcome!");
        float somme=0;

        for (int i = 0; i < Siwar_the_best.length ; i++) {

            System.out.println("i = " + Siwar_the_best[i]);
            somme=somme+Siwar_the_best[i];
        }
        System.out.println("somme = "+somme/Siwar_the_best.length);
    }
}