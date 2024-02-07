import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        System.out.println(IterativeFactorial(number));
        System.out.println(Factorial(number));
    }
    private static int IterativeFactorial(int number){
        int result = 1;
        while (number > 1){
            result *= number;
            number--;
        }
        return result;
    }
    private  static int Factorial(int num){
        if (num <= 1)
            return 1;
        return num * Factorial(num - 1);
    }
}
