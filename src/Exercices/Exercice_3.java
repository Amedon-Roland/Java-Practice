package Exercices;

import java.util.Scanner;

public class Exercice_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre âge: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }

        scanner.close();
    }
}
