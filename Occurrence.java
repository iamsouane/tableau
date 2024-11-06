package tableau;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int N;
        System.out.println("Taille tableau ?: ");
        N = clavier.nextInt();
        char[] A = new char[N];
        
        System.out.println("Remplir tableau ?: ");
        for(int i = 0; i < N; i++) {
            System.out.println("Element " + (i + 1));
            String M = clavier.next();
            if (M.length() == 1) {
                A[i] = M.charAt(0);
            } else {
                System.out.println("entrer un seul caractere");
                i--;
            }
        }

        System.out.println("Afficher tableau ?: ");
        
        for(int i = 0; i < N; i++) {
            System.out.println(A[i] + " | ");
        }

        int oc = 0;
        for(int i = 0; i < N; i++) {
            if (A[i] == 'E') {
                oc++;
            }
        }

        System.out.print("Nombre d'occurrences : " + oc);

        clavier.close();
    }
}
