import java.util.Scanner;


//Syftet med övningen var att testa printa ut olika värden som man skickar in med hjälp av scanner. 

public class Bondalizer {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Skriv in ditt första namn: ");
    String userName1 = scanner.nextLine();

    System.out.println("Skriv in ditt efternamn: ");
    String userName2 = scanner.nextLine();

    System.out.println("Your name is " + userName2 + ", " + userName1 + " " + userName2 + "!");
    scanner.close(); 
    }
}
