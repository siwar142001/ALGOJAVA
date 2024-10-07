//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int [] Siwar_the_best = new int [7];


    public static void affiche_tab(int [] tableau){
        for (int i = 0; i < tableau.length ; i++) {
            System.out.println("i = " + tableau[i]);
        }
    };




    public static void max_tab(int [] tableau){
        int max = tableau[0];
        for (int i = 0; i < tableau.length ; i++) {
            if (tableau[i] > max){
                max = tableau[i];
            }
        }
        System.out.println("le maximum = " + max);
    };



    public static boolean moins10 (int [] tableau) {
        for (int j : tableau) {
            if (j < 10) {
                return true;
            }
        }
        return false;
    };




    public static void main(String[] args) {
        Siwar_the_best[0]=5;
        Siwar_the_best[1]=15;
        Siwar_the_best[2]=25;
        Siwar_the_best[3]=35;
        Siwar_the_best[4]=45;
        Siwar_the_best[5]=55;
        Siwar_the_best[6]=65;
        System.out.println("Hello and welcome!");
        affiche_tab(Siwar_the_best);
        max_tab(Siwar_the_best);
        boolean f3 = moins10(Siwar_the_best);
        System.out.println(f3);
    }
}