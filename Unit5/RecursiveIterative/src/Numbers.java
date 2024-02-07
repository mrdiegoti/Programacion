import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
    }
    private static void RecursiveDesc(int number){
        int result = 1;
        for (int i = 0; i < number; i--){
            System.out.println(result + RecursiveDesc(number));
        }
    }
}
