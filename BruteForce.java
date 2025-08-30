import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        String correctPassword = "Cyber123";
        Scanner scanner = new Scanner(System.in);
        String guess = "";
        int attempts = 0;

        System.out.println("Brute Force Password Simulator (Ethical Hacking Practice)");
        while (!guess.equals(correctPassword)) {
            System.out.print("Enter password guess: ");
            guess = scanner.nextLine();
            attempts++;
        }

        System.out.println("Password correct! Attempts: " + attempts);
        System.out.println("Lesson: Strong passwords resist brute-force attacks.");
        scanner.close();
    }
}
