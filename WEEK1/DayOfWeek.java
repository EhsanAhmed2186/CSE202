import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String day;
        switch (num % 7) {
            case 0: day = "Saturday"; 
                break;
            case 1: day = "Sunday"; 
                break;
            case 2: day = "Monday"; 
                break;
            case 3: day = "Tuesday"; 
                break;
            case 4: day = "Wednesday"; 
                break;
            case 5: day = "Thursday"; 
                break;
            case 6: day = "Friday"; 
                break;
            default: day = "Invalid";
        }
        System.out.println(day);
        sc.close();
    }
}
