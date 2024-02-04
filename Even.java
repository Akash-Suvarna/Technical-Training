import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        boolean result = isEven(n);
        System.out.println("Result: " + result);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
