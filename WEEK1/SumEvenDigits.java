import java.util.Scanner;

public class SumEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of even digits: " + sum);
        sc.close();
    }
}
