import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String hex = "";
        while (num > 0) {
            int rem = num % 16;
            char hexChar;
            if (rem < 10)
                hexChar = (char) (rem + '0');
            else
                hexChar = (char) (rem - 10 + 'A');
            hex = hexChar + hex;
            num /= 16;
        }
        System.out.println("Hexadecimal: " + hex);
        sc.close();
    }
}
