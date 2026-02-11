import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int power = 0;
        int temp = binary;
        while (temp != 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            temp /= 10;
        }
        int octal = 0;
        int place = 1;
        while (decimal != 0) {
            int rem = decimal % 8;
            octal += rem * place;
            place *= 10;
            decimal /= 8;
        }
        System.out.println("Octal: " + octal);
        sc.close();
    }
}
