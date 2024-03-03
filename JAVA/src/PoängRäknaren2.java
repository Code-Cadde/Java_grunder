import java.util.Scanner;

// Syftet var att räkna med hjälp av kombinera olika typer av loop typer och även hitta på egen lösning för problemet.

public class PoängRäknaren2 {
     {
        int points = 0;
        boolean run = true;

        System.out.println("Välkommen till poängräknar spelet.");
        System.out.println("Du kommer få ett val att lägga till eller ta bort ett poäng. När poäng når 5 så avslutas spelet.");

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("Klicka 1 för att lägga till");
            System.out.println("Klicka 2 för att ta bort");
            int choice = scanner.nextInt();
            
            switch (choice) {
    
                case 1: 
                points += 1;
                System.out.println("Du lägger till 1 poäng, det står nu: " + points);
                    break;
                
                case 2:
                points -= 1;
                System.out.println("Du tar bort 1 poäng, det står nu: " + points);
                    break;
            
                default:
                System.out.println("Du måste skriva 1 eller 2");
                    break;
            }
            if (points >= 5) {
                run = false;
                System.out.println("Du nådde 5, du vann!");
                System.out.println("Nu avslutas spelet. ");

            }if(points <= 0){
                System.out.println("Det går inte att få poäng under 0.");
                System.out.println("Nu avslutas spelet.");
                run = false;
                
            }
        }
        scanner.close();
    }
}
