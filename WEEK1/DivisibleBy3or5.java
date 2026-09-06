import java.util.Scanner;

public class DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numbers divisible by 3 or 5 but not both:");
        for (int n : numbers) {
            if ((n % 3 == 0) ^ (n % 5 == 0)) { // XOR
                System.out.println(n);
            }
        }
        sc.close();
    }
}
