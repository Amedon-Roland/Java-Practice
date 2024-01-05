package Exercices;

import java.util.Scanner;

public class Exercice_4 {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Veuillez saisir un nombre entier: ");
	        int nombre = scanner.nextInt();

	        if (nombre % 2 == 0) {
	            System.out.println("Le nombre est pair.");
	        } else {
	            System.out.println("Le nombre est impair.");
	        }

	        scanner.close();
	    }
}
