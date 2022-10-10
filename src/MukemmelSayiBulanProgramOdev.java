import java.util.Scanner;
/**
 * Mükemmel Sayı Nedir ?
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */
public class MukemmelSayiBulanProgramOdev {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " Mükemmel sayıdır. ");
        } else {
            System.out.println(n + " Mükemmel sayı değildir. ");
        }

    }
}