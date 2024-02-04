import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values a and b:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean result = lastDigit(a, b);
        System.out.println("Result: " + result);
    }

    public static boolean lastDigit(int a, int b) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        return lastDigitA == lastDigitB;
    }
}
