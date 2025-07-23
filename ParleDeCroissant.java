import java.util.Scanner;

public class ParleDeCroissant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Comment tu t'appeles ?\t"); // "What's your name"
        String nom = input.nextLine();

        System.out.print("Quel age as-tu ?\t"); // "How old are you"
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Aimes-tu les croissants ? (true/false):\t"); // "Do you like croissants"
        boolean aimerlescroissants = input.nextBoolean();

        System.out.printf("Enchanté(e), %s ! ", nom); // "Nice to meet you ..."
        System.out.printf("Tu as %d ans. ", age); // "You are ... years old"

        if (!aimerlescroissants) {
            System.out.println("Comment as-tu pu passer " + age + " ans sur cette Terre sans aimer les croissants ? Comment oses-tu..." ); // "How could you spend 'age' years on this Earth without liking croissants? How dare you..."
        } else {
            System.out.println(age + " ans à aimer les croissants ? Tu vis la belle vie !"); // "'age' years liking croissants? You're living a good life!"
        }
        input.close();
    }
}