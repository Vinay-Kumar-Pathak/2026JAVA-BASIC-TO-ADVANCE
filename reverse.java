import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;          // last digit
            reverse = reverse * 10 + digit;
            n = n / 10;                  // remove last digit
        }

        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}


