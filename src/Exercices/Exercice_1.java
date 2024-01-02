package Exercices;
import java.util.Scanner;
public class Exercice_1 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre entier n: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " n'est pas un nombre premier.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(n + " n'est pas un nombre premier.");
                    break;
                }
            }

            if (n == 2) {
                System.out.println(n + " est un nombre premier.");
            } else {
                System.out.println(n + " est un nombre premier.");
            }
        }

        scanner.close();
    }
}
