import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sumDouble(a, b);
        System.out.println("Result: " + result);
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
