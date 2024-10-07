import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {

    static boolean isLeapYear(int annee) {
        if ((annee % 4 == 0) && ((annee % 100) != 0) || (annee % 400 == 0)) {
            System.out.println(" bissextile ");
            return true ;
        } else {
            System.out.println(" non bissextile !");
            return false;
        }
    }

    static  int min (int a, int b) {
        if (a<b) {return a;}
        else {return b;}
    }


    static int sum (int a, int b){
        int sum =a+b ;
        return sum;
    }




    public static void main(String[] args) {
        boolean test= isLeapYear(2019);
        int somme= sum(2,3) ;
        int minimum= min(3,7);

        System.out.println(test);
        System.out.println(somme);
        System.out.println(minimum);

    }
}












/*
        //int a = (int)(Math.random()*100);
        //int b = (int)(Math.random()*100);
        boolean c = false;


        System.out.println("la variable a ="+ a);
        System.out.println("la variable b ="+ b);


        if( a % 2 ==0 ) {
            System.out.println("paire  ");

        }
        else {
            System.out.println("impaire");
        }

        int f= 4;
        for (int i=3   ; i < f ; ){

            if ((i%3) ==0) {
                System.out.println(i);
            }
            else;
        }
        int a=2;
        int b = 5;
        int i =1;
        int resultat =1;
        while ( i  <= b){
            resultat *= a;
            int i1 = i++;
            System.out.println(resultat);
        }*/

