package tableau;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("taille tableau ?: ");
        int B;
        B = clavier.nextInt();

        System.out.println("Remplir tableau");
        int[] tab = new int[B];
        for(int i = 0; i < B; i++) {
            System.out.print("element " + (i+1) + " ?: ");
            tab[i] = clavier.nextInt();
        }

        System.out.println("afficher tableau");
        int max = tab[0];
        int min = tab[0];
        int indexMax = 0;
        int indexMin = 0;
        for(int i = 0; i < B; i++) {
            if (tab[i] > max) {
                max = tab[i];
                indexMax = i;
            }
            if (tab[i] < min) {
                min = tab[i];
                indexMin = i;
            }

            System.out.print(tab[i] + " | ");
        }
        System.out.println("");
        System.out.println("min : " + min + ", index : " + indexMin + " | max : " + max + ", index : " + indexMax);
        clavier.close();
    }
}
