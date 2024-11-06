package tableau;

import java.util.Scanner;

public class Trier {
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

        
        for(int i = 0; i < (taille-1); i++) {
            for(int j = 0; j < (taille-1); j++) {
                if(tableau[j] > tableau[j+1]) {
                   int temp = tableau[j];
                   tableau[j] = tableau[j+1];
                   tableau[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("afficher tableau trie");
        for(int  j = 0; j < taille; j++) {
            System.out.print(tableau[j] + " | ");
        }

        clavier.close();
    }
}
