import java.util.Scanner;

public class ÇaySeverMisiniz { // Do you like tea?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı girin: "); // Enter your name
        String isim = input.nextLine();

        System.out.print("Soyadınızı girin: "); // Enter your surname
        String soyisim = input.nextLine();

        System.out.print("Doğum gününüzü girin (sayıyla): "); // Enter your day of birth (numbers only)
        int doğum_günü = input.nextInt();

        input.nextLine();

        System.out.print("Doğum ayınızı girin (sayıyla): "); // Enter your month of birth (numbers only)
        int doğum_ayı = input.nextInt();

        input.nextLine();

        System.out.print("Doğum yılınızı girin (sayıyla): "); // Enter your year of birth (numbers only)
        int doğum_yılı = input.nextInt();

        input.nextLine();

        System.out.print("Hangi yılda olduğunuzu girin (sayıyla): "); // Enter the year you are currently in (numbers only)
        int yıl = input.nextInt();

        input.nextLine();

        System.out.print("Çay sever misiniz? (true/false) "); // Do you like Turkish tea?
        boolean çay = input.nextBoolean();

        System.out.println("\n---- Profiliniz ----"); // Your Profile

        System.out.println("Ad: " + isim); // Name
        System.out.println("Soyad: " + soyisim); // Surname
        System.out.println("Doğum tarihi: " + doğum_günü + "." + doğum_ayı + "." + doğum_yılı); // Date of Birth
        System.out.println("Çayı sevip sevmediğiniz: " + çay); // Whether you like Turkish tea or not

        if(çay)
        {
            System.out.println("\nGerçek bir Türk'sünüz!"); // "You are a real Turk!"
        } else {
            System.out.println("\n--- T.C. ÇAY KORUMA BAKANLIĞI ---"); // "Republic of Turkiye, Ministry of Turkish Tea Conservation"
            System.out.println("Sayın " + isim + " " + soyisim + ","); // "Dear"
            System.out.println("Yapılan incelemeler sonucunda çay içmediğiniz tespit edilmiştir."); // "As a result of the investigations, it has been determined that you have not consumed tea."
            System.out.println("Bu sebeple hakkınızda işlem başlatılmıştır."); // "Therefore, proceedings have been initiated against you."
            System.out.println("Mahkeme tarihiniz: " + doğum_günü + "." + doğum_ayı + "." + (doğum_yılı + (yıl - doğum_yılı + 1))); // "Your court date:"
            System.out.println("Mahkemeye katılmamanız halinde " + (doğum_yılı + 100000) + " TL tutarında idari para cezası uygulanacaktır."); // "Failure to attend the court hearing will result in an administrative fine of ... TL."
            System.out.println("Çay içmeye teşvik için son çağrıdır. :D"); // "This is the final notice to encourage you to drink Turkish tea."

        }
    input.close();

    }
}
