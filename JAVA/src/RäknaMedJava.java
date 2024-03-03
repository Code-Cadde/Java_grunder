import java.util.Scanner;

public class RäknaMedJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ge mig första numret du vill räkna med: ");
        int first = scanner.nextInt();

        System.out.println("Ge mig andra numret du vill räkna med: ");
        int second = scanner.nextInt();

        int resultat = 0;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Välj räknesätt: +-/* ");
        String svar = scanner2.nextLine();

        switch (svar){
            case "+":
                resultat = first + second;
                break;
            case "-":
                resultat = first - second;
                break;
            case "/":
            resultat = first / second;
            break;
            case "*":
            resultat = first * second;
            default:
            System.out.println("Nu blev något fel, försök igen.");
                break;
        }

        System.out.println("Ditt resultat: " + resultat);
        scanner.close();
        scanner2.close();

    }
}
