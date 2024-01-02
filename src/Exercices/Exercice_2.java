package Exercices;

import java.util.Scanner;

public class Exercice_2 {
	
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Veuillez saisir votre nom: ");
	        String nom = scanner.nextLine();

	        System.out.println("Bienvenue " + nom + "! Que puis-je faire pour vous?");

	        scanner.close();
	    }
}
