import java.util.Random;
import java.util.Scanner;

public class Tärningkastaren {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många sidor ska din tärning ha?");
        int sides = scanner.nextInt();

        System.out.println("Hur många tärningar ska du kasta?");
        int cubes = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < cubes; i++ ) {
            int resultat = random.nextInt(sides) + 1;

            System.out.println("Detta blev ditt nummer: " + resultat);
        } 
        scanner.close();
    }
}
