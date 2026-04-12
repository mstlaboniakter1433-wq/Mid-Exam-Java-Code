import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The Sum = " + sum);
    }
}