package tableau;

import java.util.Scanner;

public class Verifier {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("taille tableau ?: ");
        int taille = clavier.nextInt();

        System.out.println("remplir tableau ?: ");
        int[] tableau = new int[taille];
        for(int  i = 0; i < taille; i++) {
            System.out.print("element " + (i+1) + " ?: ");
            tableau[i] = clavier.nextInt();
        }

        System.out.println("afficher tableau");
        for(int  i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " | ");
        }

        System.out.println();
        System.out.println("verifier element ?: ");
        int element = clavier.nextInt();
        int test = 0;
        for(int  i = 0; i < taille; i++) {
            if(tableau[i] == element) {
                test = 1;
            }
        }

        if (test == 1) {
            System.out.println("vrai");
        } else {
            System.out.println("faux");
        }

        clavier.close();
    }
}
