
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Cette classe contient plusieurs méthodes de manipulation d'un tableau d'entiers.
 */
public class Main {
    // Tableau de scores statique
    static int [] Siwar_the_best = new int [7];

    /**
     * Affiche le contenu d'un tableau d'entiers.
     * ne retourne rien car c une fonction void
     * @param tableau Le tableau d'entiers à afficher.
     */

    public static int recherche(int [] tableau , int n){
        int min = 0;
        int max = tableau.length-1;

        while (min <= max) {
            // Calcul de l'index du milieu
            int milieu = (min + max) / 2;

            // Si l'élément du milieu est égal à n, on renvoie son index
            if (tableau[milieu] == n) {
                return milieu;
            }

            // Si l'élément du milieu est plus grand que n, on cherche dans la partie gauche
            if (tableau[milieu] > n) {
                max = milieu - 1;
            }
            // Si l'élément du milieu est plus petit que n, on cherche dans la partie droite
            else {
                min = milieu + 1;
            }
        }

        // Si l'élément n'a pas été trouvé, on renvoie -1
        return -1;
    }






    /**
     * Affiche le contenu d'un tableau d'entiers.
     * ne retourne rien car c une fonction void
     * @param tableau Le tableau d'entiers à afficher.
     */

    public static void affiche_tab(int [] tableau){
        for (int i = 0; i < tableau.length ; i++) {
            System.out.println("i = " + tableau[i]);
        }
    }



    /**
     * Trouve et affiche la valeur maximale dans un tableau d'entiers.
     *
     * @param tableau Le tableau d'entiers dans lequel trouver la valeur maximale.
     */

    public static void max_tab(int [] tableau){
        int max = tableau[0];
        for (int i = 0; i < tableau.length ; i++) {
            if (tableau[i] > max){
                max = tableau[i];
            }
        }
        System.out.println("le maximum = " + max);
    };


    /**
     * Vérifie si un tableau contient au moins une valeur inférieure à 10.
     *
     * @param tableau Le tableau d'entiers à vérifier.
     * @return true si le tableau contient au moins une valeur inférieure à 10, sinon false.
     */
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
        int index = recherche(Siwar_the_best,10);
        System.out.println(index);
        boolean f3 = moins10(Siwar_the_best);
        System.out.println(f3);
    }
}