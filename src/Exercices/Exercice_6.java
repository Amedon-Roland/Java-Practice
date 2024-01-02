package Exercices;
import java.util.Scanner;
public class Exercice_6 {
	   public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Veuillez saisir un nombre entier n: ");
	        int n = scanner.nextInt();

	        int somme = 0;

	        for (int i = 1; i <= n; i++) {
	            somme += i;
	        }

	        System.out.println("La somme des " + n + " premiers entiers est: " + somme);
	        
	        scanner.close();
	    }
	   
}
