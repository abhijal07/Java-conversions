import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while (octal != 0) {
            int digit = octal % 10;
            decimal += digit * Math.pow(8, power);
            power++;
            octal /= 10;
        }
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}
