import java.util.Scanner;

public class SumOfCommandLineArguments {

    public static void main(String[] args) {
        int invalid = 0, sum = 0;
        System.out.println("Enter Numbers to Calculate Sum...");
        String a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.next();
            b = sc.next();
            c = sc.next();
        }
        String[] arr = {a, b, c};

        for (int i = 0; i < arr.length; i++) {
            try {
                sum = sum + Integer.parseInt(arr[i]);
            } catch (NumberFormatException t) {
                invalid++;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("No of invalid integers entered " + invalid);
    }
}