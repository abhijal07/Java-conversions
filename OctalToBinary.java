import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();
        int decimal = 0;
        int power = 0;
        int temp = octal;
        while (temp != 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(8, power);
            power++;
            temp /= 10;
        }
        int binary = 0;
        int place = 1;
        while (decimal != 0) {
            int rem = decimal % 2;
            binary += rem * place;
            place *= 10;
            decimal /= 2;
        }
        System.out.println("Binary: " + binary);
        sc.close();
    }
}
