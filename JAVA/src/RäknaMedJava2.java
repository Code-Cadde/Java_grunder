import java.util.Scanner;

public class RäknaMedJava2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        
        int total = 0;
        boolean run = true;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Välkommen till miniräknaren.");

        while (run) {

            System.out.println("Välj räknesätt: +-/* ");
            System.out.println("Eller skriv 'EXIT' för att avsluta programmet.");

            String choice = scanner.nextLine();
            switch (choice) {
                case "+":
                System.out.println("Vilket tal vill du plusa med?");
                int add = scanner2.nextInt();

                    total += add;   
                    System.out.println("Du valde +. Din total är nu: " + total);
                    break;

                case "-":
                System.out.println("Vilket tal vill du subtrahera med?");
                int sub = scanner2.nextInt();

                    total -= sub;   
                    System.out.println("Du valde -. Din total är nu: " + total);
                    break;
                    
                case "/":
                System.out.println("Vilket tal vill du dividera med?");
                int divide = scanner2.nextInt();

                    total /= divide;   
                    System.out.println("Du valde -. Din total är nu: " + total);
                    
                    break;

                case "*":
                System.out.println("Vilket tal vill du multiplikation med?");
                int multi = scanner2.nextInt();

                    total *= multi;   
                    System.out.println("Du valde -. Din total är nu: " + total);
                    break;

                case "EXIT":
                System.out.println("Nu avslutas programmet!");
                run = false;
                    break;
            
                default:
                System.out.println("Du måste skriva: +-/*");
                    break;
            }

        }
    }
}
