import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int octal = 0;
        int place = 1;
        while (num > 0) {
            int rem = num % 8;
            octal = octal + rem * place;
            place *= 10;
            num /= 8;
        }
        System.out.println("Octal: " + octal);
        sc.close();
    }
}
