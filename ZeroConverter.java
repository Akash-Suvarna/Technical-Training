import java.util.Scanner;

public class ZeroConverter {

    static void pos(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void neg(int n) {
        for (int i = n; i <= 0; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("already Zero");
        } else if (n > 0) {
            pos(n);
        } else {
            neg(n);
        }

        sc.close();
    }
}
