import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a base: ");
        int base = in.nextInt();
        System.out.println("Enter a exponent: ");
        int exponent = in.nextInt();
        System.out.println(IterativePower(base, exponent));
        System.out.println(RecursivePower(base, exponent));
    }

    private static int IterativePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    private static int RecursivePower(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * RecursivePower(base, exponent - 1);
    }
}
